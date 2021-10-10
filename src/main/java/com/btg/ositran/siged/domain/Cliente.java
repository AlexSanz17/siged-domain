package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.btg.ositran.siged.domain.utils.Constantes;

@Entity
@Table(name="cliente")
@NamedQueries({@NamedQuery(name="Cliente.findById",query="SELECT c FROM Cliente c WHERE c.idCliente = :idcliente "),
               @NamedQuery(name="Cliente.findClienteInstituciones",query="SELECT c FROM Cliente c WHERE c.estado = 'A' and c.tipoinstitucion.cod_tipoinstitucion= :codTipoInstitucion"),
               @NamedQuery(name="Cliente.findAll",query="SELECT c FROM Cliente c WHERE c.estado = 'A'"),
               @NamedQuery(name="Cliente.findAllRUCPIDE",query="SELECT c FROM Cliente c WHERE c.estado = 'A' and flagPide is not null and flagPide= '1'"),
               @NamedQuery(name="Cliente.findAllConcesionariaActive",query="SELECT c FROM Cliente c WHERE c.estado = 'A' and c.concesion = :concesion "),
               @NamedQuery(name="Cliente.findAllConcesionaria"   ,   query="SELECT c FROM Cliente c WHERE c.concesion = :concesion"),
               @NamedQuery(name="Cliente.findByIdcliente",query="SELECT c FROM Cliente c WHERE c.idCliente = :idcliente AND c.estado = 'A'"),
               @NamedQuery(name="Cliente.findByNroidentificacion",query="SELECT c FROM Cliente c WHERE UPPER(c.numeroIdentificacion) = :nroidentificacion AND c.estado = 'A'"),
               @NamedQuery(name="Cliente.findByCriteria",query="SELECT c FROM Cliente c WHERE c.numeroIdentificacion = :nroidentificacion AND c.tipoIdentificacion.idtipoidentificacion = :idtipoidentificacion AND c.estado = 'A'"),
               @NamedQuery(name="Cliente.findByTipoIdentificacion",query="SELECT c FROM Cliente c WHERE c.tipoIdentificacion.idtipoidentificacion = :idtipoidentificacion"),
               @NamedQuery(name="Cliente.findByNumeroidentificacionEstado",query="SELECT c FROM Cliente c WHERE LOWER(c.numeroIdentificacion) = :numeroidentificacion AND c.estado = :estado"),
	       @NamedQuery(name="Cliente.findLikeNroidentificacion",query="SELECT c FROM Cliente c WHERE c.numeroIdentificacion LIKE :nroidentificacion AND c.estado = 'A'")})
public class Cliente implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CLIENTE_SEQ")
	@SequenceGenerator(name="CLIENTE_SEQ",sequenceName="CLIENTE_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idcliente")
	private Integer idCliente;
	@Basic(optional=false)
	@Column(name="nroidentificacion")
	private String numeroIdentificacion;
	@Column(name="razonsocial")
	private String razonSocial;
	@Column(name="representantelegal")
	private String representanteLegal;
	@Column(name="direccionprincipal")
	private String direccionPrincipal;
	@Column(name="direccionalternativa")
	private String direccionAlternativa;
        
        @Basic(optional=true)
        @Column(name="concesion")
        private String concesion;
     
        @Basic(optional=true)
        @Column(name="flagPide")
        private String flagPide;
        
        @Basic(optional=true)
        @Column(name="idUnidad")
        private Integer idUnidad;

        public Integer getIdUnidad() {
            return idUnidad;
        }

        public void setIdUnidad(Integer idUnidad) {
            this.idUnidad = idUnidad;
        }
        

        public String getConcesion() {
            return concesion;
        }

        public void setConcesion(String concesion) {
            this.concesion = concesion;
        }
        
        @Column(name="codCargoCliente")
	private Integer codCargoCliente;

        public Integer getCodCargoCliente() {
            return codCargoCliente;
        }

        public void setCodCargoCliente(Integer codCargoCliente) {
            this.codCargoCliente = codCargoCliente;
        }
        
        @JoinColumn(name="codtipoinstitucion",referencedColumnName="cod_tipoinstitucion", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private TipoInstitucion tipoinstitucion;
        
        @Column(name="codtipoinstitucion")
        private Integer codtipoinstitucion;

        public Integer getCodtipoinstitucion() {
            return codtipoinstitucion;
        }

        public void setCodtipoinstitucion(Integer codtipoinstitucion) {
            this.codtipoinstitucion = codtipoinstitucion;
        }

        public TipoInstitucion getTipoinstitucion() {
            return tipoinstitucion;
        }

        public void setTipoinstitucion(TipoInstitucion tipoinstitucion) {
            this.tipoinstitucion = tipoinstitucion;
        }
        
       // @Column(name="codTipoInstitucion")
        //private Integer codTipoInstitucion;
        
       // @Column(name="codTipoRemitente")
        //private String codTipoRemitente;

        
        @Column(name="usuarioCreacion")
        private Integer usuarioCreacion;

        @Column(name="usuarioModificacion")
        private Integer usuarioModificacion;
     
        public Integer getUsuarioCreacion() {
            return usuarioCreacion;
        }

        public void setUsuarioCreacion(Integer usuarioCreacion) {
            this.usuarioCreacion = usuarioCreacion;
        }

       /* public Integer getCodTipoInstitucion() {
            return codTipoInstitucion;
        }

        public void setCodTipoInstitucion(Integer codTipoInstitucion) {
            this.codTipoInstitucion = codTipoInstitucion;
        }*/
        
	private String telefono;
	private String correo;
	private String nombres;
	@Column(name="apellidopaterno")
	private String apellidoPaterno;
	@Column(name="apellidomaterno")
	private String apellidoMaterno;
	private Character estado;
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
        
        @Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	@JoinColumn(name="ubigeoalternativo",referencedColumnName="iddistrito")
	@ManyToOne(fetch=FetchType.EAGER)
	private Distrito ubigeoAlternativo;
        
	@JoinColumn(name="ubigeoprincipal",referencedColumnName="iddistrito")
	@ManyToOne(fetch=FetchType.EAGER)
	private Distrito ubigeoPrincipal;

        public Distrito getUbigeoPrincipal() {
            return ubigeoPrincipal;
        }

        public void setUbigeoPrincipal(Distrito ubigeoPrincipal) {
            this.ubigeoPrincipal = ubigeoPrincipal;
        }
     
	@JoinColumn(name="tipoidentificacion",referencedColumnName="idtipoidentificacion")
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	private Tipoidentificacion tipoIdentificacion;
        
       

    
	private transient String sNombre;
	private transient Integer idDepartamentoUP;
	private transient String sDepartamentoUP;
	private transient Integer idProvinciaUP;
	private transient String sProvinciaUP;
	private transient Integer idDistritoUP;
	private transient String sDistritoUP;
	private transient Integer idDepartamentoUA;
	private transient String sDepartamentoUA;
	private transient Integer idProvinciaUA;
	private transient String sProvinciaUA;
	private transient Integer idDistritoUA;
	private transient String sDistritoUA;
	@Transient
	private String sTipoIdentificacion;

	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcliente")
	// private List<Mensajeria> mensajerias;

	public Cliente(){
	}

	public Cliente(Integer idcliente){
		this.idCliente=idcliente;
	}

	public Cliente(Integer iIdCliente,String sTipoIdentificacion,String sNumeroIdentificacion,String sRazonSocial,String sNombres,String sApellidoPaterno,String sApellidoMaterno){
		this.idCliente=iIdCliente;
		this.sTipoIdentificacion=sTipoIdentificacion;
		this.numeroIdentificacion=sNumeroIdentificacion;

		if(Constantes.TIPO_IDENTIFICACION_RUC.equalsIgnoreCase(sTipoIdentificacion)){
			this.sNombre=sRazonSocial;
		}
		else{
			this.sNombre=sNombres + " " + sApellidoPaterno + " " + sApellidoMaterno;
		}
	}

	public Cliente(Integer iIdCliente,Tipoidentificacion objTipoIdentificacion,String sNumeroIdentificacion,String sRazonSocial,String sNombres,String sApellidoPaterno,String sApellidoMaterno,String sRepresentanteLegal,String sDireccionPrincipal,Distrito objUbigeoPrincipal,String sDireccionAlternativa,Distrito objUbigeoAlternativo,String sTelefono,String sCorreo){
		this.idCliente=iIdCliente;
		this.tipoIdentificacion=objTipoIdentificacion;
		this.numeroIdentificacion=sNumeroIdentificacion;
		this.razonSocial=sRazonSocial;
		this.nombres=sNombres;
		this.apellidoPaterno=sApellidoPaterno;
		this.apellidoMaterno=sApellidoMaterno;
		this.representanteLegal=sRepresentanteLegal;
		this.direccionPrincipal=sDireccionPrincipal;
		//this.ubigeoPrincipal=objUbigeoPrincipal;
		this.direccionAlternativa=sDireccionAlternativa;
		this.ubigeoAlternativo=objUbigeoAlternativo;
		this.telefono=sTelefono;
		this.correo=sCorreo;
	}

	public Cliente(Integer iIdCliente,Tipoidentificacion objTipoIdentificacion,String sNumeroIdentificacion,String sRazonSocial,String sNombres,String sApellidoPaterno,String sApellidoMaterno,String sRepresentanteLegal,String sDireccionPrincipal,String sDireccionAlternativa,String sTelefono,String sCorreo,Integer idDepartamentoUP,String departamentoUP,Integer idProvinciaUP,String provinciaUP,Integer idDistritoUP,String distritoUP,Integer idDepartamentoUA,String departamentoUA,Integer idProvinciaUA,String provinciaUA,Integer idDistritoUA,String distritoUA){
		this.idCliente=iIdCliente;
		this.tipoIdentificacion=objTipoIdentificacion;
		this.numeroIdentificacion=sNumeroIdentificacion;
		this.razonSocial=sRazonSocial;
		this.nombres=sNombres;
		this.apellidoPaterno=sApellidoPaterno;
		this.apellidoMaterno=sApellidoMaterno;
		this.representanteLegal=sRepresentanteLegal;
		this.direccionPrincipal=sDireccionPrincipal;
		this.direccionAlternativa=sDireccionAlternativa;
		this.telefono=sTelefono;
		this.correo=sCorreo;

		this.idDepartamentoUP=idDepartamentoUP;
		this.sDepartamentoUP=departamentoUP;
		this.idProvinciaUP=idProvinciaUP;
		this.sProvinciaUP=provinciaUP;
		this.idDistritoUP=idDistritoUP;
		this.sDistritoUP=distritoUP;
		this.idDepartamentoUA=idDepartamentoUA;
		this.sDepartamentoUA=departamentoUA;
		this.idProvinciaUA=idProvinciaUA;
		this.sProvinciaUA=provinciaUA;
		this.idDistritoUA=idDistritoUA;
		this.sDistritoUA=distritoUA;

	}
        
         public Date getFechaModificacion() {
            return fechaModificacion;
        }

        public void setFechaModificacion(Date fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
        }
        
         public Integer getUsuarioModificacion() {
            return usuarioModificacion;
        }

        public void setUsuarioModificacion(Integer usuarioModificacion) {
            this.usuarioModificacion = usuarioModificacion;
        }

	public Integer getIdCliente(){
		return idCliente;
	}

	public void setIdCliente(Integer idCliente){
		this.idCliente=idCliente;
	}

	public String getNumeroIdentificacion(){
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion){
		this.numeroIdentificacion=numeroIdentificacion;
	}

	public String getRazonSocial(){
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial){
		this.razonSocial=razonSocial;
	}

	public String getRepresentanteLegal(){
		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal){
		this.representanteLegal=representanteLegal;
	}

	public String getDireccionPrincipal(){
		return direccionPrincipal;
	}

	public void setDireccionPrincipal(String direccionPrincipal){
		this.direccionPrincipal=direccionPrincipal;
	}

	public String getDireccionAlternativa(){
		return direccionAlternativa;
	}

	public void setDireccionAlternativa(String direccionAlternativa){
		this.direccionAlternativa=direccionAlternativa;
	}

	public String getTelefono(){
		return telefono;
	}

	public void setTelefono(String telefono){
		this.telefono=telefono;
	}

	public String getCorreo(){
		return correo;
	}

	public void setCorreo(String correo){
		this.correo=correo;
	}

	public String getNombres(){
		return nombres;
	}

	public void setNombres(String nombres){
		this.nombres=nombres;
	}

	public String getApellidoPaterno(){
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno=apellidoPaterno;
	}

	public String getApellidoMaterno(){
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno=apellidoMaterno;
	}

	public Character getEstado(){
		return estado;
	}

	public void setEstado(Character estado){
		this.estado=estado;
	}

	public Date getFechaCreacion(){
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion){
		this.fechaCreacion=fechaCreacion;
	}

	public Distrito getUbigeoAlternativo(){
		return ubigeoAlternativo;
	}

	public void setUbigeoAlternativo(Distrito ubigeoAlternativo){
		this.ubigeoAlternativo=ubigeoAlternativo;
	}

	/*public Distrito getUbigeoPrincipal(){
		return ubigeoPrincipal;
	}

	public void setUbigeoPrincipal(Distrito ubigeoPrincipal){
		this.ubigeoPrincipal=ubigeoPrincipal;
	}*/

	public Tipoidentificacion getTipoIdentificacion(){
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(Tipoidentificacion tipoIdentificacion){
		this.tipoIdentificacion=tipoIdentificacion;
	}

	public String getsNombre(){
		return sNombre;
	}

	public void setsNombre(String sNombre){
		this.sNombre=sNombre;
	}

	public Integer getIdDepartamentoUP(){
		return idDepartamentoUP;
	}

	public void setIdDepartamentoUP(Integer idDepartamentoUP){
		this.idDepartamentoUP=idDepartamentoUP;
	}

	public String getSDepartamentoUP(){
		return sDepartamentoUP;
	}

	public void setSDepartamentoUP(String departamentoUP){
		sDepartamentoUP=departamentoUP;
	}

	public Integer getIdProvinciaUP(){
		return idProvinciaUP;
	}

	public void setIdProvinciaUP(Integer idProvinciaUP){
		this.idProvinciaUP=idProvinciaUP;
	}

	public String getSProvinciaUP(){
		return sProvinciaUP;
	}

	public void setSProvinciaUP(String provinciaUP){
		sProvinciaUP=provinciaUP;
	}

	public Integer getIdDistritoUP(){
		return idDistritoUP;
	}

	public void setIdDistritoUP(Integer idDistritoUP){
		this.idDistritoUP=idDistritoUP;
	}

	public String getSDistritoUP(){
		return sDistritoUP;
	}

	public void setSDistritoUP(String distritoUP){
		sDistritoUP=distritoUP;
	}

	public Integer getIdDepartamentoUA(){
		return idDepartamentoUA;
	}

	public void setIdDepartamentoUA(Integer idDepartamentoUA){
		this.idDepartamentoUA=idDepartamentoUA;
	}

	public String getSDepartamentoUA(){
		return sDepartamentoUA;
	}

	public void setSDepartamentoUA(String departamentoUA){
		sDepartamentoUA=departamentoUA;
	}

	public Integer getIdProvinciaUA(){
		return idProvinciaUA;
	}

	public void setIdProvinciaUA(Integer idProvinciaUA){
		this.idProvinciaUA=idProvinciaUA;
	}

	public String getSProvinciaUA(){
		return sProvinciaUA;
	}

	public void setSProvinciaUA(String provinciaUA){
		sProvinciaUA=provinciaUA;
	}

	public Integer getIdDistritoUA(){
		return idDistritoUA;
	}

	public void setIdDistritoUA(Integer idDistritoUA){
		this.idDistritoUA=idDistritoUA;
	}

	public String getSDistritoUA(){
		return sDistritoUA;
	}

	public void setSDistritoUA(String distritoUA){
		sDistritoUA=distritoUA;
	}

	public String getsTipoIdentificacion(){
		return sTipoIdentificacion;
	}

	public void setsTipoIdentificacion(String sTipoIdentificacion){
		this.sTipoIdentificacion=sTipoIdentificacion;
	}

        /*
        public String getCodTipoRemitente() {
           return codTipoRemitente;
        }

        public void setCodTipoRemitente(String codTipoRemitente) {
            this.codTipoRemitente = codTipoRemitente;
        }*/
	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idCliente != null ? idCliente.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Cliente)){
			return false;
		}
		Cliente other=(Cliente) object;
		if((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.razonSocial + "]";
	}

	// Auditoria
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();
		lstCamposAuditables.add(new AuditableCampo("numeroIdentificacion","Nro de Identificacion"));
		lstCamposAuditables.add(new AuditableCampo("tipoIdentificacion","Tipo de Identificacion"));
		lstCamposAuditables.add(new AuditableCampo("razonSocial","Razon Social"));
		lstCamposAuditables.add(new AuditableCampo("representanteLegal","Representante Legal"));
		lstCamposAuditables.add(new AuditableCampo("direccionPrincipal","Direccion Principal"));
		lstCamposAuditables.add(new AuditableCampo("ubigeoPrincipal","Ubigeo Principal"));
		lstCamposAuditables.add(new AuditableCampo("direccionAlternativa","Direccion Alternativa"));
		lstCamposAuditables.add(new AuditableCampo("ubigeoAlternativo","Ubigeo Alternativo"));
		lstCamposAuditables.add(new AuditableCampo("telefono","Telefono"));
		lstCamposAuditables.add(new AuditableCampo("correo","Correo"));
		lstCamposAuditables.add(new AuditableCampo("estado","Estado"));
		return lstCamposAuditables;
	}

	public String getNombreRazon(){
           	if(tipoIdentificacion != null){
           		if(Constantes.TIPO_IDENTIFICACION_RUC.equalsIgnoreCase(tipoIdentificacion.getNombre())){
				return (razonSocial == null ? "" : razonSocial);
			}
           		return (nombres == null ? "" : nombres) + " " + (apellidoPaterno == null ? "" : apellidoPaterno) + " " + (apellidoMaterno == null ? "" : apellidoMaterno);
		}
		return "";
	}
        
        public String getFlagPide() {
            return flagPide;
        }

        public void setFlagPide(String flagPide) {
            this.flagPide = flagPide;
        }
}
