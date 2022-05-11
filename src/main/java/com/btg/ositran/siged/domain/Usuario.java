package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="usuario")
@Inheritance(strategy=InheritanceType.JOINED)
@NamedQueries({@NamedQuery(name="Usuario.findAll",query="SELECT u FROM Usuario u WHERE u.estado='A' order by nombres,apellidos"),@NamedQuery(name="Usuario.findAllUF",query="SELECT u FROM Usuario u WHERE u.estado='A' and u.usuariofinal='S' order by nombres,apellidos"),@NamedQuery(name="Usuario.findAllFinales",query="SELECT u FROM Usuario u WHERE u.usuariofinal = :usuariofinal AND u.estado='A' order by nombres,apellidos"),@NamedQuery(name="Usuario.findByIdusuario",query="SELECT u FROM Usuario u WHERE u.idusuario = :idusuario AND u.estado='A'"),@NamedQuery(name="Usuario.findByUsuario",query="SELECT u FROM Usuario u WHERE upper(u.usuario) = upper(:usuario) AND u.unidad.sede.idsede = :idsede AND u.estado='A'"),@NamedQuery(name="Usuario.findByUsuariofinal",query="SELECT u FROM Usuario u WHERE u.usuariofinal = :usuariofinal AND u.estado='A' order by CONCAT(upper(TRIM(apellidos)),'', upper(nombres))"),
		@NamedQuery(name="Usuario.findByCriteria",query="SELECT u FROM Usuario u WHERE u.usuario = :usr AND u.clave = :clv AND u.estado='A'"),@NamedQuery(name="Usuario.autenticarClaveSiged",query="SELECT u FROM  Usuario u WHERE u.usuario = :usr AND u.estado='A'"),
		@NamedQuery(name="Usuario.findByParticipacionProceso",query="SELECT NEW Usuario (u.idusuario, u.nombres, u.apellidos, u.usuario, u.unidad) FROM Usuario u WHERE :proceso MEMBER OF u.procesosParticipante AND u.estado='A' order by UPPER(nombres)"),
		@NamedQuery(name="Usuario.findByIdJefe",query="SELECT u FROM Usuario u WHERE u.jefe.idusuario = :idjefe AND u.estado='A' order by nombres,apellidos"),@NamedQuery(name="Usuario.findByUnidad",query="SELECT u FROM Usuario u WHERE u.unidad.idunidad = :idunidad AND u.jefe IS NULL"),
        @NamedQuery(name="Usuario.findByUsuarioEstado",query="SELECT u FROM Usuario u WHERE LOWER(u.usuario) = :usuario AND u.estado = :estado")})
public class Usuario implements Serializable,Auditable {
	private static final long serialVersionUID=4300445690240196344L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idusuario")
	private Integer idusuario;
        
    @Basic(optional=false)
	@Column(name="idfuncion")
	private Integer idfuncion;
    
	@Basic(optional=false)
	@Column(name="usuario")
	private String usuario;

	@Basic(optional=false)
	@Column(name="flagviewtrazabilidad")
	private String flagviewtrazabilidad;
        
    @Column(name="tipoDocumento")
    private String tipoDocumento;
    
    @Column(name="nroDocumento")
    private String nroDocumento;

	private transient String flagUsuarioTramite;
        
    private transient Integer idFuncionPerfil;
    
    private transient Integer idUsuarioPerfil;
    
    private transient Integer idUnidadPerfil;

    private transient Integer idRolPerfil;
    
    private transient char permisoCargo;

        
	@Basic(optional=false)
	@Column(name="flagdocumentocf")
	private String flagdocumentocf;

	public String getFlagUsuarioTramite() {
		return flagUsuarioTramite;
	}

	public void setFlagUsuarioTramite(String flagUsuarioTramite) {
		this.flagUsuarioTramite = flagUsuarioTramite;
	}

	@Basic(optional=true)
	@Column(name="grupoFedatario")
	private Integer grupoFedatario;

	public String getFlagdocumentocf() {
		return flagdocumentocf;
	}

	public void setFlagdocumentocf(String flagdocumentocf) {
		this.flagdocumentocf = flagdocumentocf;
	}

	@Basic(optional=true)
	@Column(name="siglasFedatario")
	private String siglasFedatario;

	public String getSiglasFedatario() {
		return siglasFedatario;
	}

	public void setSiglasFedatario(String siglasFedatario) {
		this.siglasFedatario = siglasFedatario;
	}

	public Integer getGrupoFedatario() {
		return grupoFedatario;
	}

	public void setGrupoFedatario(Integer grupoFedatario) {
		this.grupoFedatario = grupoFedatario;
	}
        
        @Transient
        private List<Usuarioxunidadxfuncion> listUsuarioxunidadxfuncion;
        
        private transient String proveido;

	@Basic(optional=false)
	@Column(name="clave")
	private String clave;
	@Basic(optional=false)
	@Column(name="nombres")
	private String nombres;
	@Basic(optional=false)
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="correo")
	private String correo;
	@Basic(optional=false)
	@Column(name="usuariofinal")
	private char usuariofinal;
	@Basic(optional=false)
	@Column(name="enviocorreo")
	private char enviocorreo;
	@Column(name="tema")
	private String tema;
	@Basic(optional=false)
	@Column(name="estado")
	private String estado;
        
    @Column(name="idRol")
	private Integer idRol;
        
	@Column(name="bandejaAgrupada")
	private Character bandejaAgrupada;
	
        //@JoinTable(name="usuarioxrol",joinColumns={@JoinColumn(name="idusuario",referencedColumnName="idusuario")},inverseJoinColumns={@JoinColumn(name="idrol",referencedColumnName="idrol")})
	//@ManyToMany(fetch=FetchType.LAZY)
	//private List<Rol> roles;  
        
        //////////////////////////////////////////////////////////
        @JoinColumn(name="idRol",referencedColumnName="idrol", insertable=false, updatable=false)
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Rol rolUsuario;
        //////////////////////////////////////////////////////////

        public Rol getRolUsuario() {
            return rolUsuario;
        }

        public void setRolUsuario(Rol rolUsuario) {
            this.rolUsuario = rolUsuario;
        }
        
	@OneToMany(mappedBy="jefe",fetch=FetchType.LAZY)
	private List<Usuario> usuariosACargo;
	@ManyToMany(mappedBy="usuarioList",fetch=FetchType.LAZY)
	private List<Proceso> procesosParticipante;
	@JoinColumn(name="jefe",referencedColumnName="idusuario")
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario jefe;
	@JoinColumn(name="idunidad",referencedColumnName="idunidad")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Unidad unidad;
	@ManyToMany(mappedBy="notificadoList",fetch=FetchType.LAZY)
	private List<Proceso> procesosNotificado;
	@ManyToMany(mappedBy="administradorListaList",fetch=FetchType.LAZY)
	private List<Lista> listaAdministrador;
	@ManyToMany(mappedBy="participanteListaList",fetch=FetchType.LAZY)
	private List<Lista> listaParticipante;

	@JoinTable(name="COMPARTIDOXUSUARIO",joinColumns={@JoinColumn(name="USUARIO",referencedColumnName="IDUSUARIO")},inverseJoinColumns={@JoinColumn(name="ASIGNADO",referencedColumnName="IDUSUARIO")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Usuario> compartidoxusuario;

	@JoinTable(name="ADMINISTRADORXUSUARIO",joinColumns={@JoinColumn(name="USUARIO",referencedColumnName="IDUSUARIO")},inverseJoinColumns={@JoinColumn(name="ADMINISTRADOR",referencedColumnName="IDUSUARIO")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Usuario> administradorxusuario;

	@Column(name = "CLAVE_SIGED")
	@Basic(optional=false)
	private String claveSiged;
	/*
	 * Transients
	 */
	@Transient
	private Rol rol;
	
	@Basic(optional=false)
	@Column(name="captcha")
	private String captcha;
        
        public char getPermisoCargo() {
            return permisoCargo;
        }

        public void setPermisoCargo(char permisoCargo) {
            this.permisoCargo = permisoCargo;
        }

        public Integer getIdRolPerfil() {
            return idRolPerfil;
        }

        public void setIdRolPerfil(Integer idRolPerfil) {
            this.idRolPerfil = idRolPerfil;
        }
        
        
	/*
	 * Constructors
	 */
	public Usuario(){
		this.administradorxusuario=null;
		this.compartidoxusuario=null;
	}
        
        public Usuario(Integer idusuario){
            this.idusuario=idusuario;
        }

	public Usuario(Integer idusuario,String nombres,String apellidos,String usuario,Unidad unidad){
		this.apellidos=apellidos;
		this.idusuario=idusuario;
		this.nombres=nombres;
		this.usuario=usuario;
		this.unidad=unidad;
	}
        
        public String getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public String getNroDocumento() {
            return nroDocumento;
        }

        public void setNroDocumento(String nroDocumento) {
            this.nroDocumento = nroDocumento;
        }

	/*
	 * Getters & Setters
	 */
	public Integer getIdusuario(){
		return idusuario;
	}

	public void setIdusuario(Integer idusuario){
		this.idusuario=idusuario;
	}

	public String getUsuario(){
		return usuario;
	}

	public void setUsuario(String usuario){
		this.usuario=usuario;
	}

	public String getClave(){
		return clave;
	}

	public void setClave(String clave){
		this.clave=clave;
	}

	public String getNombres(){
		return nombres;
	}

	public void setNombres(String nombres){
		this.nombres=nombres;
	}

	public String getApellidos(){
		return apellidos;
	}

	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}

	public String getCorreo(){
		return correo;
	}

	public void setCorreo(String correo){
		this.correo=correo;
	}

	public char getUsuariofinal(){
		return usuariofinal;
	}

	public void setUsuariofinal(char usuariofinal){
		this.usuariofinal=usuariofinal;
	}

	public void setUsuariofinal(Character usuariofinal){
		if(usuariofinal != null){
			this.usuariofinal=usuariofinal;
		}
	}

	public char getEnviocorreo(){
		return enviocorreo;
	}

	public void setEnviocorreo(char enviocorreo){
		this.enviocorreo=enviocorreo;
	}

	public void setEnviocorreo(Character enviocorreo){
		if(enviocorreo != null){
			this.enviocorreo=enviocorreo;
		}
	}

	public String getTema(){
		return tema;
	}

	public void setTema(String tema){
		this.tema=tema;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public void setEstado(Character estado){
		if(estado != null){
			this.estado=estado.toString();
		}
	}

	public List<Usuario> getUsuariosACargo(){
		return usuariosACargo;
	}

	public void setUsuariosACargo(List<Usuario> usuarioList1){
		this.usuariosACargo=usuarioList1;
	}

	public Usuario getJefe(){
		return jefe;
	}

	public void setJefe(Usuario jefe){
		this.jefe=jefe;
	}

        
	/*public List<Rol> getRoles(){
		return roles;
	}

	public void setRoles(List<Rol> roles){
		this.roles=roles;
	}*/

	public Unidad getUnidad(){
		return unidad;
	}

	public void setUnidad(Unidad unidad){
		this.unidad=unidad;
	}
        
	public List<Proceso> getProcesosNotificado(){
		return procesosNotificado;
	}

	public void setProcesosNotificado(List<Proceso> procesosNotificado){
		this.procesosNotificado=procesosNotificado;
	}

	public List<Proceso> getProcesosParticipante(){
		return procesosParticipante;
	}
        
	public void setProcesosParticipante(List<Proceso> procesosParticipante){
		this.procesosParticipante=procesosParticipante;
	}

	public List<Lista> getListaAdministrador(){
		return listaAdministrador;
	}

	public void setListaAdministrador(List<Lista> listaAdministrador){
		this.listaAdministrador=listaAdministrador;
	}

	public List<Lista> getListaParticipante(){
		return listaParticipante;
	}

	public void setListaParticipante(List<Lista> listaParticipante){
		this.listaParticipante=listaParticipante;
	}

	public Rol getRol(){
		return rol;
	}

	public void setRol(Rol rol){
		this.rol=rol;
	}

	public List<Usuario> getCompartidoxusuario(){
		return compartidoxusuario;
	}

	public void setCompartidoxusuario(List<Usuario> compartidoxusuario){
		this.compartidoxusuario=compartidoxusuario;
	}

	public List<Usuario> getAdministradorxusuario(){
		return administradorxusuario;
	}

	public void setAdministradorxusuario(List<Usuario> administradorxusuario){
		this.administradorxusuario=administradorxusuario;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idusuario != null ? idusuario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Usuario)){
			return false;
		}
		Usuario other=(Usuario) object;
		if((this.idusuario == null && other.getIdusuario() != null) || (this.idusuario != null && !this.idusuario.equals(other.getIdusuario()))){
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", tipoDocumento=" + tipoDocumento + ", nroDocumento=" + nroDocumento
				+ ", idUnidadPerfil=" + idUnidadPerfil + ", unidad=" + unidad + "]";
	}

	/*
	 * Auditoria
	 */
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();
		lstCamposAuditables.add(new AuditableCampo("usuario","Usuario"));
		lstCamposAuditables.add(new AuditableCampo("clave","Clave"));
		lstCamposAuditables.add(new AuditableCampo("nombres","Nombres"));
		lstCamposAuditables.add(new AuditableCampo("apellidos","Apellidos"));
		lstCamposAuditables.add(new AuditableCampo("correo","Correo"));
		lstCamposAuditables.add(new AuditableCampo("enviocorreo","Permite Envio de Correo"));
		lstCamposAuditables.add(new AuditableCampo("rol","Rol"));
		lstCamposAuditables.add(new AuditableCampo("jefe","Jefe"));

		return lstCamposAuditables;
	}

	public boolean isUsuarioInicial(){
		boolean b=false;
		/*for(Rol r : this.roles){
			if(r.getIdperfil().getDescripcion().equalsIgnoreCase("Mesa de Partes") || r.getIdperfil().getDescripcion().equalsIgnoreCase("Digitalizador") || r.getIdperfil().getDescripcion().equalsIgnoreCase("Control de Calidad")){
				b=true;
				break;
			}
		}*/
		return b;
	}

	public boolean isUsuarioFinal(){
		boolean b=false;
		/*for(Rol r : this.roles){
			if(r.getIdperfil().getDescripcion().equalsIgnoreCase("Usuario Final")){
				b=true;
				break;
			}
		}*/
		return b;
	}

	public String getNombreCompleto(){
		if(this.apellidos!= null && !this.apellidos.equals("")){
			return this.apellidos + ", " + this.nombres;
		}
		return this.nombres;
	}

	public Character getBandejaAgrupada() {
		return bandejaAgrupada;
	}

	public void setBandejaAgrupada(Character bandejaAgrupada) {
		this.bandejaAgrupada = bandejaAgrupada;
	}

	public String getClaveSiged() {
		return claveSiged;
	}

	public void setClaveSiged(String claveSiged) {
		this.claveSiged = claveSiged;
	}

	public String getFlagviewtrazabilidad() {
		return flagviewtrazabilidad;
	}

	public void setFlagviewtrazabilidad(String flagviewtrazabilidad) {
		this.flagviewtrazabilidad = flagviewtrazabilidad;
	}
        
    public List<Usuarioxunidadxfuncion> getListUsuarioxunidadxfuncion() {
        return listUsuarioxunidadxfuncion;
    }

    public void setListUsuarioxunidadxfuncion(List<Usuarioxunidadxfuncion> listUsuarioxunidadxfuncion) {
        this.listUsuarioxunidadxfuncion = listUsuarioxunidadxfuncion;
    }
    
    public Integer getIdfuncion() {
       return idfuncion;
    }

    public void setIdfuncion(Integer idfuncion) {
        this.idfuncion = idfuncion;
    }
    
    public Integer getIdFuncionPerfil() {
        return idFuncionPerfil;
    }

    public void setIdFuncionPerfil(Integer idFuncionPerfil) {
        this.idFuncionPerfil = idFuncionPerfil;
    }
    
     public Integer getIdUsuarioPerfil() {
      return idUsuarioPerfil;
    }

    public void setIdUsuarioPerfil(Integer idUsuarioPerfil) {
        this.idUsuarioPerfil = idUsuarioPerfil;
    }
    
     public Integer getIdUnidadPerfil() {
    return idUnidadPerfil;
    }

    public void setIdUnidadPerfil(Integer idUnidadPerfil) {
        this.idUnidadPerfil = idUnidadPerfil;
    }
    
     public String getProveido() {
        return proveido;
    }

    public void setProveido(String proveido) {
        this.proveido = proveido;
    }

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}