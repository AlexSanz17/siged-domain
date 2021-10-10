package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="proceso")
@NamedQueries({@NamedQuery(name="Proceso.findAll",query="SELECT p FROM Proceso p order by nombre"),@NamedQuery(name="Proceso.findAllByIdTipoProceso",query="SELECT p FROM Proceso p WHERE p.tipoproceso.idtipoproceso = :idtipoproceso ORDER BY nombre"),
		// @NamedQuery(name = "Proceso.findAllByIdTipoProcesoAndEstado", query =
		// "SELECT p FROM Proceso p WHERE p.tipoproceso.idtipoproceso = :idtipoproceso and p.estado =:estado ORDER BY nombre"),
		@NamedQuery(name="Proceso.findActivos",query="SELECT p FROM Proceso p WHERE p.estado=:estado order by nombre"),@NamedQuery(name="Proceso.findSancionadorActivos",query="SELECT p FROM Proceso p WHERE p.estado=:estado and p.nombre like 'Sancionador%' order by nombre"),@NamedQuery(name="Proceso.findByIdproceso",query="SELECT p FROM Proceso p WHERE p.idproceso = :idproceso"),@NamedQuery(name="Proceso.findByNombreEstado",query="SELECT p FROM Proceso p WHERE LOWER(p.nombre) = :nombre AND p.estado = :estado"),@NamedQuery(name="Proceso.findByDescripcion",query="SELECT p FROM Proceso p WHERE p.descripcion = :descripcion"),@NamedQuery(name="Proceso.findByTiempoatencion",query="SELECT p FROM Proceso p WHERE p.tiempoatencion = :tiempoatencion"),@NamedQuery(name="Proceso.findByFechacreacion",query="SELECT p FROM Proceso p WHERE p.fechacreacion = :fechacreacion"),@NamedQuery(name="Proceso.findByEstado",query="SELECT p FROM Proceso p WHERE p.estado = :estado"),
		@NamedQuery(name="Proceso.findByUsuarioParticipante",query="SELECT p FROM Proceso p WHERE lower(p.tipoproceso.nombre)<>'stor' AND :usuario  MEMBER OF p.usuarioList AND p.estado != :estado order by nombre "), // agregado
																																																// por
																																																// Victor

		@NamedQuery(name="Proceso.findByUsuarioParticipanteN2",query="SELECT p FROM Proceso p WHERE lower(p.tipoproceso.nombre)<>'stor' AND :usuario  MEMBER OF p.usuarioList  order by nombre "), // agregado
		@NamedQuery(name="Proceso.findByIdResponsableOrAsistente",query="SELECT p FROM Proceso p WHERE (p.responsable.idusuario = :idusuario OR p.idasistente.idusuario = :idusuario) AND p.estado = :estado"),@NamedQuery(name="Proceso.buscarLstPorResponsable",query="SELECT p FROM Proceso p WHERE p.responsable.idusuario = :idusuario or p.idasistente.idusuario = :idusuario order by nombre"),@NamedQuery(name="Proceso.findByTiponumeracion",query="SELECT p FROM Proceso p WHERE p.tiponumeracion = :tiponumeracion"),@NamedQuery(name="Proceso.findByParticipante",query="SELECT p FROM Proceso p WHERE :usuario MEMBER OF p.usuarioList ORDER BY p.nombre")})
public class Proceso implements Serializable,Auditable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PROCESO_SEQ")
	@SequenceGenerator(name="PROCESO_SEQ",sequenceName="PROCESO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idproceso")
	private Integer idproceso;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;

	@Basic(optional=true)
	@Column(name="vigencia")
	private String vigencia;

	@Column(name="codigo")
	private String codigo;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="tiempoatencion")
	private Integer tiempoatencion;
	@Column(name="permitemetadata")
	private char permitemetadata;
	@Column(name="permitesumilla")
	private Character permitesumilla;
	@Column(name="config_notif_mail")
	private Integer config_notif_mail;
	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@Column(name="tiponumeracion")
	private Character tiponumeracion;
	@Column(name="produccion")
	private Character produccion;
	@Column(name="porcentajealerta1")
	private String porcentajealertaA;
	@Column(name="porcentajealerta2")
	private String porcentajealertaR;
	private String nombreIntalio;
	@JoinTable(name="pconfidencialxproceso",joinColumns={@JoinColumn(name="idproceso",referencedColumnName="idproceso")},inverseJoinColumns={@JoinColumn(name="idusuario",referencedColumnName="idusuario")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Usuario> usuarioList1;
	@JoinTable(name="participantexproceso",joinColumns={@JoinColumn(name="idproceso",referencedColumnName="idproceso")},inverseJoinColumns={@JoinColumn(name="idusuario",referencedColumnName="idusuario")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Usuario> usuarioList;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="proceso",fetch=FetchType.LAZY)
	private List<Actividad> actividadList;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idproceso",fetch=FetchType.LAZY)
	private List<Trazabilidaddocumento> trazabilidaddocumentoList;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idproceso",fetch=FetchType.LAZY)
	private List<Trazabilidadexpediente> trazabilidadexpedienteList;
	//@OneToMany(cascade=CascadeType.ALL,mappedBy="proceso",fetch=FetchType.LAZY)
	//private List<Expediente> expedienteList;
	@JoinColumn(name="idgrupoproceso",referencedColumnName="idgrupoproceso")
	@ManyToOne(fetch=FetchType.LAZY)
	private Grupoproceso idgrupoproceso;
	@JoinColumn(name="idtipoacceso",referencedColumnName="idtipoacceso")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Tipoacceso idtipoacceso;
	@JoinColumn(name="tipoproceso",referencedColumnName="idtipoproceso")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Tipoproceso tipoproceso;
	@JoinColumn(name="responsable",referencedColumnName="idusuario")
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario responsable;
	@JoinColumn(name="idasistente",referencedColumnName="idusuario")
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario idasistente;
	@JoinTable(name="notificadoxproceso",joinColumns={@JoinColumn(name="idproceso",referencedColumnName="idproceso")},inverseJoinColumns={@JoinColumn(name="idusuario",referencedColumnName="idusuario")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Usuario> notificadoList;
	@JoinTable(name="listaxproceso",joinColumns={@JoinColumn(name="idproceso",referencedColumnName="idproceso")},inverseJoinColumns={@JoinColumn(name="idlista",referencedColumnName="idlista")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Lista> listaList;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="proceso",fetch=FetchType.LAZY)
	private List<Etapa> etapaList;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="idproceso",fetch=FetchType.LAZY)
	private List<Estado> estadoList;

	/*
	 * Constants
	 */
	public static final String ABREV_GENERAL="general";
	public static final String ABREV_STOR="stor";
	public static final String ABREV_TI="ti";

	/*
	 * Transients
	 */
	@Transient
	private String sUnidad;
	@Transient
	private String sResNombres;
	@Transient
	private String sResApelidos;
	@Transient
	private Integer iIdResponsable;
	@Transient
	private String sTipoProceso;

	@Transient
	private transient String etapas;

	private transient Integer[] arrEtapaToDelete;

	@Transient
	private transient String estados;

	private transient Integer[] arrEstadoToDelete;

	/*
	 * Constructors
	 */
	public Proceso(){
	}

	public Proceso(Integer idproceso){
		this.idproceso=idproceso;
	}

	public Proceso(Integer idproceso,String nombre,Date fechacreacion,char estado){
		this.idproceso=idproceso;
		this.nombre=nombre;
		this.fechacreacion=fechacreacion;
		this.estado=estado;
	}

	public Proceso(Integer iIdProceso,String sProceso,String sUnidad,String sRespNombres,String sRespApellidos,Integer iIdResponsable,String sTipoProceso,Character cPermiteSumilla,String sCodigo,Character cAmbiente){
		this.idproceso=iIdProceso;
		this.nombre=sProceso;
		this.sUnidad=sUnidad;
		this.sResNombres=sRespNombres;
		this.sResApelidos=sRespApellidos;
		this.iIdResponsable=iIdResponsable;
		this.sTipoProceso=sTipoProceso;
		this.permitesumilla=cPermiteSumilla;
		this.codigo=sCodigo;
		this.produccion=cAmbiente;
	}

	public Proceso(Integer idproceso,String porcentajealerta1,String porcentajealerta2){
		this.idproceso=idproceso;
		this.porcentajealertaA=porcentajealerta1;
		this.porcentajealertaR=porcentajealerta2;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdproceso(){
		return idproceso;
	}

	public void setIdproceso(Integer idproceso){
		this.idproceso=idproceso;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public Integer getTiempoatencion(){
		return tiempoatencion;
	}

	public void setTiempoatencion(Integer tiempoatencion){
		this.tiempoatencion=tiempoatencion;
	}

	public char getPermitemetadata(){
		return permitemetadata;
	}

	public void setPermitemetadata(char permitemetadata){
		this.permitemetadata=permitemetadata;
	}

	public void setPermitemetadata(Character permitemetadata){
		if(permitemetadata != null){
			this.permitemetadata=permitemetadata;
		}
	}

	public Character getPermitesumilla(){
		return permitesumilla;
	}

	public void setPermitesumilla(Character permitesumilla){
		this.permitesumilla=permitesumilla;
	}

	public Integer getConfig_notif_mail(){
		return config_notif_mail;
	}

	public void setConfig_notif_mail(Integer config_notif_mail){
		this.config_notif_mail=config_notif_mail;
	}

	public Date getFechacreacion(){
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion){
		this.fechacreacion=fechacreacion;
	}

	public char getEstado(){
		return estado;
	}

	public void setEstado(char estado){
		this.estado=estado;
	}

	public void setEstado(Character estado){
		if(estado != null){
			this.estado=estado;
		}
	}

	public Character getTiponumeracion(){
		return tiponumeracion;
	}

	public void setTiponumeracion(Character tiponumeracion){
		this.tiponumeracion=tiponumeracion;
	}

	public Character getProduccion(){
		return produccion;
	}

	public void setProduccion(Character produccion){
		this.produccion=produccion;
	}

	public String getNombreIntalio(){
		return nombreIntalio;
	}

	public void setNombreIntalio(String nombreIntalio){
		this.nombreIntalio=nombreIntalio;
	}

	public List<Usuario> getUsuarioList1(){
		return usuarioList1;
	}

	public void setUsuarioList1(List<Usuario> usuarioList1){
		this.usuarioList1=usuarioList1;
	}

	public List<Usuario> getUsuarioList(){
		return usuarioList;
	}

	public void setUsuarioList(List<Usuario> usuarioList){
		this.usuarioList=usuarioList;
	}

	public List<Actividad> getActividadList(){
		return actividadList;
	}

	public void setActividadList(List<Actividad> actividadList){
		this.actividadList=actividadList;
	}

	public List<Trazabilidaddocumento> getTrazabilidaddocumentoList(){
		return trazabilidaddocumentoList;
	}

	public void setTrazabilidaddocumentoList(List<Trazabilidaddocumento> trazabilidaddocumentoList){
		this.trazabilidaddocumentoList=trazabilidaddocumentoList;
	}

	public List<Trazabilidadexpediente> getTrazabilidadexpedienteList(){
		return trazabilidadexpedienteList;
	}

	public void setTrazabilidadexpedienteList(List<Trazabilidadexpediente> trazabilidadexpedienteList){
		this.trazabilidadexpedienteList=trazabilidadexpedienteList;
	}

	/*public List<Expediente> getExpedienteList(){
		return expedienteList;
	}

	public void setExpedienteList(List<Expediente> expedienteList){
		this.expedienteList=expedienteList;
	}*/

	public Grupoproceso getIdgrupoproceso(){
		return idgrupoproceso;
	}

	public void setIdgrupoproceso(Grupoproceso idgrupoproceso){
		this.idgrupoproceso=idgrupoproceso;
	}

	public Tipoacceso getIdtipoacceso(){
		return idtipoacceso;
	}

	public void setIdtipoacceso(Tipoacceso idtipoacceso){
		this.idtipoacceso=idtipoacceso;
	}

	public Tipoproceso getTipoproceso(){
		return tipoproceso;
	}

	public void setTipoproceso(Tipoproceso tipoproceso){
		this.tipoproceso=tipoproceso;
	}

	public Usuario getResponsable(){
		return responsable;
	}

	public void setResponsable(Usuario responsable){
		this.responsable=responsable;
	}

	public Usuario getIdasistente(){
		return idasistente;
	}

	public void setIdasistente(Usuario idasistente){
		this.idasistente=idasistente;
	}

	public List<Usuario> getNotificadoList(){
		return notificadoList;
	}

	public void setNotificadoList(List<Usuario> notificadoList){
		this.notificadoList=notificadoList;
	}

	public List<Lista> getListaList(){
		return listaList;
	}

	public void setListaList(List<Lista> listaList){
		this.listaList=listaList;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idproceso != null ? idproceso.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Proceso)){
			return false;
		}
		Proceso other=(Proceso) object;
		if((this.idproceso == null && other.idproceso != null) || (this.idproceso != null && !this.idproceso.equals(other.idproceso))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.nombre + "]";
	}

	// Auditoria
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();

		lstCamposAuditables.add(new AuditableCampo("nombre","Nombre"));
		lstCamposAuditables.add(new AuditableCampo("descripcion","Descripcion"));
		lstCamposAuditables.add(new AuditableCampo("tiempoatencion","Tiempo de Atencion"));
		lstCamposAuditables.add(new AuditableCampo("permitemetadata","Permite Metadata"));
		lstCamposAuditables.add(new AuditableCampo("estado","Estado"));
		lstCamposAuditables.add(new AuditableCampo("tipoproceso","Tipo de Proceso"));
		lstCamposAuditables.add(new AuditableCampo("idtipoacceso","Tipo de Acceso"));
		lstCamposAuditables.add(new AuditableCampo("idasistente","Asistente"));
		lstCamposAuditables.add(new AuditableCampo("responsable","Responsable"));
		lstCamposAuditables.add(new AuditableCampo("usuarioList","Participantes"));
		lstCamposAuditables.add(new AuditableCampo("usuarioList1","Participantes Confidenciales"));

		return lstCamposAuditables;
	}

	public String getsUnidad(){
		return sUnidad;
	}

	public void setsUnidad(String sUnidad){
		this.sUnidad=sUnidad;
	}

	public String getsResNombres(){
		return sResNombres;
	}

	public void setsResNombres(String sResNombres){
		this.sResNombres=sResNombres;
	}

	public String getsResApelidos(){
		return sResApelidos;
	}

	public void setsResApelidos(String sResApelidos){
		this.sResApelidos=sResApelidos;
	}

	public Integer getiIdResponsable(){
		return iIdResponsable;
	}

	public void setiIdResponsable(Integer iIdResponsable){
		this.iIdResponsable=iIdResponsable;
	}

	public String getsTipoProceso(){
		return sTipoProceso;
	}

	public void setsTipoProceso(String sTipoProceso){
		this.sTipoProceso=sTipoProceso;
	}

	public String getPorcentajealertaA(){
		return porcentajealertaA;
	}

	public void setPorcentajealertaA(String porcentajealertaA){
		this.porcentajealertaA=porcentajealertaA;
	}

	public String getPorcentajealertaR(){
		return porcentajealertaR;
	}

	public void setPorcentajealertaR(String porcentajealertaR){
		this.porcentajealertaR=porcentajealertaR;
	}

	public String getEtapas(){
		return etapas;
	}

	public void setEtapas(String etapas){
		this.etapas=etapas;
	}

	public List<Etapa> getEtapaList(){
		return etapaList;
	}

	public void setEtapaList(List<Etapa> etapaList){
		this.etapaList=etapaList;
	}

	public Integer[] getArrEtapaToDelete(){
		return arrEtapaToDelete;
	}

	public void setArrEtapaToDelete(Integer[] arrEtapaToDelete){
		this.arrEtapaToDelete=arrEtapaToDelete;
	}

	public String getEstados(){
		return estados;
	}

	public void setEstados(String estados){
		this.estados=estados;
	}

	public Integer[] getArrEstadoToDelete(){
		return arrEstadoToDelete;
	}

	public void setArrEstadoToDelete(Integer[] arrEstadoToDelete){
		this.arrEstadoToDelete=arrEstadoToDelete;
	}

	public List<Estado> getEstadoList(){
		return estadoList;
	}

	public void setEstadoList(List<Estado> estadoList){
		this.estadoList=estadoList;
	}
}
