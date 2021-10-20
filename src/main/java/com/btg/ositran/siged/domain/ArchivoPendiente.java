package com.btg.ositran.siged.domain;

import java.io.Serializable;
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
@Table(name="archivopendiente")
@NamedQueries({@NamedQuery(name="Archivopendiente.findAll",query="SELECT a FROM ArchivoPendiente a"),@NamedQuery(name="Archivopendiente.findByIdusuario",query="SELECT a FROM ArchivoPendiente a WHERE a.usuario.idusuario =:idusuario")})
public class ArchivoPendiente implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ARCHIVOPENDIENTE_SEQ")
	//@SequenceGenerator(name="ARCHIVOPENDIENTE_SEQ",sequenceName="ARCHIVOPENDIENTE_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idarchivopendiente")
	private Integer idArchivoPendiente;

	private Integer expediente;

        
	@JoinColumn(name="proceso",referencedColumnName="idproceso")
	@ManyToOne(optional=true)
	private Proceso proceso;
        
	@Column(name="tipodocumento")
	private Integer tipoDocumento;

	@Column(name="nrodocumento")
	private String numeroDocumento;

	@Column(name="nrofolios")
	private Integer numeroFolios;

	private String asunto;

	@Column(name="fechadocumento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDocumento;

	private Integer cliente;

	@JoinColumn(name="concesionario",referencedColumnName="idconcesionario")
	@ManyToOne(optional=true)
	private Concesionario concesionario;

	@Column(name="direccionalternativa")
	private String direccionAlternativa;

	private String estado;

	@JoinColumn(name="documento",referencedColumnName="iddocumento")
	@ManyToOne(optional=true)
	private Documento documento;

	@JoinColumn(name="plantilla",referencedColumnName="idplantilla")
	@ManyToOne(optional=false)
	private Plantilla plantilla;

	@JoinColumn(name="usuario",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario usuario;

	@JoinColumn(name="firmante",referencedColumnName="idusuario")
	@ManyToOne(optional=true)
	private Usuario firmante;

	@Column(name="responsable")
	private Integer responsable;

	@Column(name="autor")
	private String autor;

	@Column(name="enumerardocumento")
	private String enumerarDocumento;

	@Column(name="tipoidentificacion")
	private Integer tipoIdentificacion;

	private String observacion;

	public String getObservacion(){
		return observacion;
	}

	public void setObservacion(String observacion){
		this.observacion=observacion;
	}

	public Integer getTipoIdentificacion(){
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(Integer tipoIdentificacion){
		this.tipoIdentificacion=tipoIdentificacion;
	}

	public Integer getResponsable(){
		return responsable;
	}

	public void setResponsable(Integer responsable){
		this.responsable=responsable;
	}

	@OneToMany(cascade=CascadeType.ALL,mappedBy="archivoPendiente")
	private List<ArchivoTemporal> archivosTemporales;

	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="archivopendiente")
	private List<Valorcampo> valoresCampo;

	/* Variables temporales */
	private transient String strTipoDocumento;
	private transient String strFechaDocumento;
	private transient String nuevo;

	/***************************/
	public ArchivoPendiente(){
	}

	public ArchivoPendiente(String esnuevo){
		this.nuevo=esnuevo;
	}

	public ArchivoPendiente(Integer idArchivoPendiente){
		this.idArchivoPendiente=idArchivoPendiente;
	}

	public Integer getIdArchivoPendiente(){
		return idArchivoPendiente;
	}

	public void setIdArchivoPendiente(Integer idArchivoPendiente){
		this.idArchivoPendiente=idArchivoPendiente;
	}

	public Integer getExpediente(){
		return expediente;
	}

	public void setExpediente(Integer expediente){
		this.expediente=expediente;
	}

        
	public Proceso getProceso(){
		return proceso;
	}

	public void setProceso(Proceso proceso){
		this.proceso=proceso;
	}

	public Integer getTipoDocumento(){
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento){
		this.tipoDocumento=tipoDocumento;
	}

	public String getNumeroDocumento(){
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento){
		this.numeroDocumento=numeroDocumento;
	}

	public Integer getNumeroFolios(){
		return numeroFolios;
	}

	public void setNumeroFolios(Integer numeroFolios){
		this.numeroFolios=numeroFolios;
	}

	public String getAsunto(){
		return asunto;
	}

	public void setAsunto(String asunto){
		this.asunto=asunto;
	}

	public Date getFechaDocumento(){
		return fechaDocumento;
	}

	public void setFechaDocumento(Date fechaDocumento){
		this.fechaDocumento=fechaDocumento;
	}

	public Integer getCliente(){
		return cliente;
	}

	public void setCliente(Integer cliente){
		this.cliente=cliente;
	}

	public Concesionario getConcesionario(){
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario){
		this.concesionario=concesionario;
	}

	public String getDireccionAlternativa(){
		return direccionAlternativa;
	}

	public void setDireccionAlternativa(String direccionAlternativa){
		this.direccionAlternativa=direccionAlternativa;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public Documento getDocumento(){
		return documento;
	}

	public void setDocumento(Documento documento){
		this.documento=documento;
	}

	public Plantilla getPlantilla(){
		return plantilla;
	}

	public void setPlantilla(Plantilla plantilla){
		this.plantilla=plantilla;
	}

	public Usuario getUsuario(){
		return usuario;
	}

	public void setUsuario(Usuario usuario){
		this.usuario=usuario;
	}

	public List<Valorcampo> getValoresCampo(){
		return valoresCampo;
	}

	public void setValoresCampo(List<Valorcampo> valoresCampo){
		this.valoresCampo=valoresCampo;
	}

	public List<ArchivoTemporal> getArchivosTemporales(){
		return archivosTemporales;
	}

	public void setArchivosTemporales(List<ArchivoTemporal> archivosTemporales){
		this.archivosTemporales=archivosTemporales;
	}

	public void copy(ArchivoPendiente archivopendiente){

		this.setAsunto(archivopendiente.getAsunto());
		// this.setArchivotemporalList(archivopendiente.getArchivotemporalList());
		this.setCliente(archivopendiente.getCliente());
		this.setConcesionario(archivopendiente.getConcesionario());
		this.setDireccionAlternativa(archivopendiente.getDireccionAlternativa());
		this.setDocumento(archivopendiente.getDocumento());
		this.setEstado(archivopendiente.getEstado());
		this.setExpediente(archivopendiente.getExpediente());
		this.setFechaDocumento(archivopendiente.getFechaDocumento());
		this.setIdArchivoPendiente(archivopendiente.getIdArchivoPendiente());
		this.setNumeroDocumento(archivopendiente.getNumeroDocumento());
		this.setNumeroFolios(archivopendiente.getNumeroFolios());
		this.setObservacion(archivopendiente.getObservacion());
		this.setPlantilla(archivopendiente.getPlantilla());
		//this.setProceso(archivopendiente.getProceso());
		this.setResponsable(archivopendiente.getResponsable());
		this.setStrTipoDocumento(archivopendiente.getStrTipoDocumento());
		this.setTipoDocumento(archivopendiente.getTipoDocumento());
		this.setTipoIdentificacion(archivopendiente.getTipoIdentificacion());
		this.setUsuario(archivopendiente.getUsuario());
		// this.setValorcampoList(archivopendiente.getValorcampoList());

	}

	
	public String getStrTipoDocumento(){
		return strTipoDocumento;
	}

	
	public void setStrTipoDocumento(String strtipoDocumento){
		this.strTipoDocumento=strtipoDocumento;
	}

	
	public String getStrFechaDocumento(){
		return strFechaDocumento;
	}

	
	public void setStrFechaDocumento(String strFechaDocumento){
		this.strFechaDocumento=strFechaDocumento;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idArchivoPendiente != null ? idArchivoPendiente.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof ArchivoPendiente)){
			return false;
		}
		ArchivoPendiente other=(ArchivoPendiente) object;
		if((this.idArchivoPendiente == null && other.idArchivoPendiente != null) || (this.idArchivoPendiente != null && !this.idArchivoPendiente.equals(other.idArchivoPendiente))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Archivopendiente[idArchivoPendiente=" + idArchivoPendiente + "]";
	}

	public Usuario getFirmante(){
		return firmante;
	}

	public void setFirmante(Usuario firmante){
		this.firmante=firmante;
	}

	public String getAutor(){
		return autor;
	}

	public void setAutor(String autor){
		this.autor=autor;
	}

	public String getEnumerarDocumento(){
		return enumerarDocumento;
	}

	public void setEnumerarDocumento(String enumerarDocumento){
		this.enumerarDocumento=enumerarDocumento;
	}

	public String getNuevo(){
		return nuevo;
	}

	public void setNuevo(String nuevo){
		this.nuevo=nuevo;
	}

}