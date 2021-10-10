package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="notificacion")
@NamedQueries({@NamedQuery(name="Notificacion.findAll",query="SELECT n FROM Notificacion n"),@NamedQuery(name="Notificacion.findByIdnotificacion",query="SELECT n FROM Notificacion n WHERE n.idnotificacion = :idnotificacion"),@NamedQuery(name="Notificacion.findAllByIdUsuarioEstado",query="SELECT n FROM Notificacion n WHERE (( n.iddocumento.estado = :estado AND n.iddocumento.propietario.idusuario = :idusr ) OR (n.idusuario.idusuario = :idusr))"),@NamedQuery(name="Notificacion.findByAsunto",query="SELECT n FROM Notificacion n WHERE n.asunto = :asunto"),@NamedQuery(name="Notificacion.findByContenido",query="SELECT n FROM Notificacion n WHERE n.contenido = :contenido"),@NamedQuery(name="Notificacion.buscarNotificacionesNoLeidas",query="SELECT n FROM Notificacion n WHERE n.idusuario.idusuario = :idusuario AND n.leido = 'N'"),
		@NamedQuery(name="Notificacion.findByUsuarioAndTipoAndLeido",query="SELECT n FROM Notificacion n WHERE n.idusuario.idusuario = :idusuario AND n.tiponotificacion = :tipo AND n.leido = :leido AND n.estado = 'A' AND n.unidadPropietario = :unidadPropietario and n.cargoPropietario = :cargoPropietario "),@NamedQuery(name="Notificacion.findByIdDocumento",query="SELECT n FROM Notificacion n WHERE n.iddocumento.idDocumento = :iddocumento AND n.estado = 'A'"),@NamedQuery(name="Notificacion.findLastNotificacionbyUsuario",query="SELECT n FROM Notificacion n WHERE n.iddocumento.idDocumento = :iddocumento AND n.idusuario.idusuario = :idusuario ")})
public class Notificacion implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="NOTIFICACION_SEQ")
	@SequenceGenerator(name="NOTIFICACION_SEQ",sequenceName="NOTIFICACION_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idnotificacion")
	private Integer idnotificacion;
	@Basic(optional=false)
	@Column(name="fechanotificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechanotificacion;
	@Basic(optional=false)
	@Column(name="asunto")
	private String asunto;
	@Basic(optional=true)
	@Column(name="contenido")
	private String contenido;
	@Basic(optional=false)
	@Column(name="tiponotificacion")
	private int tiponotificacion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@Column(name="leido")
	private Character leido;
	@JoinColumn(name="idusuario",referencedColumnName="idusuario")
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario idusuario;
	@JoinColumn(name="iddocumento",referencedColumnName="iddocumento")
	@ManyToOne(fetch=FetchType.LAZY)
	private Documento iddocumento;
	@JoinColumn
	@OneToOne(mappedBy="notificacion", fetch=FetchType.LAZY)
	private Trazabilidadcopia trazabilidadcopia;

	@Column(name="fechaeliminadocumento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEliminaDocumento;

	 @Column(name="nombrepceliminadocumento")
	private String nombrePCEliminaDocumento;
         
        @Column(name="unidadPropietario")
	private Integer unidadPropietario;
        
        @Column(name="cargoPropietario")
	private Integer cargoPropietario;

        @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;

   

	private transient String nombreUsuario;

	/*
	 * Transients
	 */
	/*
	 * @Transient private Integer iIdDocumento;
	 * 
	 * @Transient private String sConcesionario;
	 * 
	 * @Transient private String sNroExpediente;
	 * 
	 * @Transient private String sProceso;
	 * 
	 * @Transient private String sClienteTipoIdentificacion;
	 * 
	 * @Transient private String sClienteRazonSocial;
	 * 
	 * @Transient private String sClienteNombres;
	 * 
	 * @Transient private String sClienteApellidoPaterno;
	 * 
	 * @Transient private String sClienteApellidoMaterno;
	 * 
	 * @Transient private String sTipoNotificacionDescripcion;
	 */

	/*
	 * Constructors
	 */
	public Notificacion(){
	}

	public Notificacion(Integer idnotificacion){
		this.idnotificacion=idnotificacion;
	}

	public Notificacion(Integer idnotificacion,Date fechanotificacion,String asunto,String contenido,int tiponotificacion,char estado,String usuario){
		this.idnotificacion=idnotificacion;
		this.fechanotificacion=fechanotificacion;
		this.asunto=asunto;
		this.contenido=contenido;
		this.tiponotificacion=tiponotificacion;
		this.estado=estado;
		this.nombreUsuario=usuario;
	}

	/*
	 * public Notificacion(Integer iIdNotificacion, Character cLeido, String
	 * sAsunto, Date dFechaNotificacion, int iTipoNotificacion, Integer
	 * iIdDocumento, String sConcesionario, String sNroExpediente, String
	 * sProceso, String sClienteTipoIdentificacion, String sClienteRazonSocial,
	 * String sClienteNombres, String sClienteApellidoPaterno, String
	 * sClienteApellidoMaterno) { this.idnotificacion = iIdNotificacion;
	 * this.leido = cLeido; this.asunto = sAsunto; this.fechanotificacion =
	 * dFechaNotificacion; this.tiponotificacion = iTipoNotificacion;
	 * this.iIdDocumento = iIdDocumento; this.sConcesionario = sConcesionario;
	 * this.sNroExpediente = sNroExpediente; this.sProceso = sProceso;
	 * this.sClienteTipoIdentificacion = sClienteTipoIdentificacion;
	 * this.sClienteRazonSocial = sClienteRazonSocial; this.sClienteNombres =
	 * sClienteNombres; this.sClienteApellidoPaterno = sClienteApellidoPaterno;
	 * this.sClienteApellidoMaterno = sClienteApellidoMaterno; }
	 * 
	 * public Notificacion(Integer iIdNotificacion, Character cLeido, String
	 * sAsunto, Date dFechaNotificacion, int iTipoNotificacion, Integer
	 * iIdDocumento, String sDescripcion) { this.idnotificacion =
	 * iIdNotificacion; this.leido = cLeido; this.asunto = sAsunto;
	 * this.fechanotificacion = dFechaNotificacion; this.tiponotificacion =
	 * iTipoNotificacion; this.iIdDocumento = iIdDocumento;
	 * this.sTipoNotificacionDescripcion = sDescripcion; }
	 */

	/*
	 * Getters & Setters
	 */
	public Integer getIdnotificacion(){
		return idnotificacion;
	}

	public void setIdnotificacion(Integer idnotificacion){
		this.idnotificacion=idnotificacion;
	}

	public Date getFechanotificacion(){
		return fechanotificacion;
	}

	public void setFechanotificacion(Date fechanotificacion){
		this.fechanotificacion=fechanotificacion;
	}

	public String getAsunto(){
		return asunto;
	}

	public void setAsunto(String asunto){
		this.asunto=asunto;
	}

	public String getContenido(){
		return contenido;
	}

	public void setContenido(String contenido){
		this.contenido=contenido;
	}

	public int getTiponotificacion(){
		return tiponotificacion;
	}

	public void setTiponotificacion(int tiponotificacion){
		this.tiponotificacion=tiponotificacion;
	}

	public char getEstado(){
		return estado;
	}

	public void setEstado(char estado){
		this.estado=estado;
	}

	public Character getLeido(){
		return leido;
	}

	public void setLeido(Character leido){
		this.leido=leido;
	}

	public Usuario getIdusuario(){
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario){
		this.idusuario=idusuario;
	}

	public Documento getIddocumento(){
		return iddocumento;
	}

	public void setIddocumento(Documento iddocumento){
		this.iddocumento=iddocumento;
	}

	public String getNombreUsuario(){
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario){
		this.nombreUsuario=nombreUsuario;
	}

	/*
	 * public Integer getiIdDocumento() { return iIdDocumento; }
	 * 
	 * public void setiIdDocumento(Integer iIdDocumento) { this.iIdDocumento =
	 * iIdDocumento; }
	 * 
	 * public String getsConcesionario() { return sConcesionario; }
	 * 
	 * public void setsConcesionario(String sConcesionario) {
	 * this.sConcesionario = sConcesionario; }
	 * 
	 * public String getsNroExpediente() { return sNroExpediente; }
	 * 
	 * public void setsNroExpediente(String sNroExpediente) {
	 * this.sNroExpediente = sNroExpediente; }
	 * 
	 * public String getsProceso() { return sProceso; }
	 * 
	 * public void setsProceso(String sProceso) { this.sProceso = sProceso; }
	 * 
	 * public String getsClienteTipoIdentificacion() { return
	 * sClienteTipoIdentificacion; }
	 * 
	 * public void setsClienteTipoIdentificacion(String
	 * sClienteTipoIdentificacion) { this.sClienteTipoIdentificacion =
	 * sClienteTipoIdentificacion; }
	 * 
	 * public String getsClienteRazonSocial() { return sClienteRazonSocial; }
	 * 
	 * public void setsClienteRazonSocial(String sClienteRazonSocial) {
	 * this.sClienteRazonSocial = sClienteRazonSocial; }
	 * 
	 * public String getsClienteNombres() { return sClienteNombres; }
	 * 
	 * public void setsClienteNombres(String sClienteNombres) {
	 * this.sClienteNombres = sClienteNombres; }
	 * 
	 * public String getsClienteApellidoPaterno() { return
	 * sClienteApellidoPaterno; }
	 * 
	 * public void setsClienteApellidoPaterno(String sClienteApellidoPaterno) {
	 * this.sClienteApellidoPaterno = sClienteApellidoPaterno; }
	 * 
	 * public String getsClienteApellidoMaterno() { return
	 * sClienteApellidoMaterno; }
	 * 
	 * public void setsClienteApellidoMaterno(String sClienteApellidoMaterno) {
	 * this.sClienteApellidoMaterno = sClienteApellidoMaterno; }
	 * 
	 * public String getsTipoNotificacionDescripcion() { return
	 * sTipoNotificacionDescripcion; }
	 * 
	 * public void setsTipoNotificacionDescripcion(String
	 * sTipoNotificacionDescripcion) { this.sTipoNotificacionDescripcion =
	 * sTipoNotificacionDescripcion; }
	 */

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idnotificacion != null ? idnotificacion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Notificacion)){
			return false;
		}
		Notificacion other=(Notificacion) object;
		if((this.idnotificacion == null && other.idnotificacion != null) || (this.idnotificacion != null && !this.idnotificacion.equals(other.idnotificacion))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Notificacion[idnotificacion=" + idnotificacion + "]";
	}

	public Trazabilidadcopia getTrazabilidadcopia() {
		return trazabilidadcopia;
	}

	public void setTrazabilidadcopia(Trazabilidadcopia trazabilidadcopia) {
		this.trazabilidadcopia = trazabilidadcopia;
	}

	public Date getFechaEliminaDocumento() {
		return fechaEliminaDocumento;
	}

	public void setFechaEliminaDocumento(Date fechaEliminaDocumento) {
		this.fechaEliminaDocumento = fechaEliminaDocumento;
	}

	public String getNombrePCEliminaDocumento() {
		return nombrePCEliminaDocumento;
	}

	public void setNombrePCEliminaDocumento(String nombrePCEliminaDocumento) {
		this.nombrePCEliminaDocumento = nombrePCEliminaDocumento;
	}

         public Integer getUnidadPropietario() {
            return unidadPropietario;
        }

        public void setUnidadPropietario(Integer unidadPropietario) {
            this.unidadPropietario = unidadPropietario;
        }

        public Integer getCargoPropietario() {
            return cargoPropietario;
        }

        public void setCargoPropietario(Integer cargoPropietario) {
            this.cargoPropietario = cargoPropietario;
        }
        
         public Integer getUsuarioCreacion() {
        return usuarioCreacion;
        }

        public void setUsuarioCreacion(Integer usuarioCreacion) {
            this.usuarioCreacion = usuarioCreacion;
        }

}
