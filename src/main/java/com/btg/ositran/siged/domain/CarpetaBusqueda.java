package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity
@Table(name="carpetabusqueda")
@NamedQueries({@NamedQuery(name="Carpetabusqueda.findAll",query="SELECT c FROM CarpetaBusqueda c"),@NamedQuery(name="Carpetabusqueda.findByIdUsuario",query="SELECT c FROM CarpetaBusqueda c WHERE c.usuario.idusuario = :idusuario")})
public class CarpetaBusqueda implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CARPETABUSQUEDA_SEQ")
	@SequenceGenerator(name="CARPETABUSQUEDA_SEQ",sequenceName="CARPETABUSQUEDA_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idcarpetabusqueda")
	private Integer idCarpetaBusqueda;

	@Column(name="nombrecarpeta")
	private String nombreCarpeta;

	@Column(name="nroexpediente")
	private String numeroExpediente;

	@Column(name="tipodocumento")
	private String tipoDocumento;

	@Column(name="nrodocumento")
	private String numeroDocumento;

	@Column(name="documentoidentidad")
	private String documentoIdentidad;

	@Column(name="nromesapartes")
	private String numeroMesaPartes;


	@Column(name="pendiente")
	private String pendiente;

	public String getPendiente() {
		return pendiente;
	}

	public void setPendiente(String pendiente) {
		this.pendiente = pendiente;
	}

	@Column(name="fechadocumentoinicio")
	@Temporal(TemporalType.DATE)
	private Date fechaDocumentoInicio;

	private transient String strFechaDocumentoInicio;

	@Column(name="fechadocumentofinal")
	@Temporal(TemporalType.DATE)
	private Date fechaDocumentoFinal;

	private transient String strFechaDocumentoFinal;

	private String consecionario;

	@Column(name="fechaexpedienteinicio")
	@Temporal(TemporalType.DATE)
	private Date fechaExpedienteInicio;

	private transient String strFechaExpedienteInicio;

	@Column(name="fechaexpedientefinal")
	@Temporal(TemporalType.DATE)
	private Date fechaExpedienteFinal;

	private transient String strFechaExpedienteFinal;

	private String cliente;

	@Column(name="direccioncliente")
	private String direccionCliente;

	@Column(name="areadestino")
	private String areaDestino;

	@Column(name="areaorigen")
	private String areaOrigen;

	private String propietario;

	private String proceso;

	@Column(name="asuntoexpediente")
	private String asuntoExpediente;

	@Column(name="asuntodocumento")
	private String asuntoDocumento;

	@Column(name="estadoexpediente")
	private String estadoExpediente;

	@JoinColumn(name="idusuario",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario usuario;

	private String remitente;

	public CarpetaBusqueda(){
	}

	public Integer getIdCarpetaBusqueda(){
		return idCarpetaBusqueda;
	}

	public void setIdCarpetaBusqueda(Integer idCarpetaBusqueda){
		this.idCarpetaBusqueda=idCarpetaBusqueda;
	}

	public String getNombreCarpeta(){
		return nombreCarpeta;
	}

	public void setNombreCarpeta(String nombreCarpeta){
		this.nombreCarpeta=nombreCarpeta;
	}

	public String getNumeroExpediente(){
		return numeroExpediente;
	}

	public void setNumeroExpediente(String numeroExpediente){
		this.numeroExpediente=numeroExpediente;
	}

	public String getTipoDocumento(){
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento){
		this.tipoDocumento=tipoDocumento;
	}

	public String getNumeroDocumento(){
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento){
		this.numeroDocumento=numeroDocumento;
	}

	public String getDocumentoIdentidad(){
		return documentoIdentidad;
	}

	public void setDocumentoIdentidad(String documentoIdentidad){
		this.documentoIdentidad=documentoIdentidad;
	}

	public String getNumeroMesaPartes(){
		return numeroMesaPartes;
	}

	public void setNumeroMesaPartes(String numeroMesaPartes){
		this.numeroMesaPartes=numeroMesaPartes;
	}

	public Date getFechaDocumentoInicio(){
		return fechaDocumentoInicio;
	}

	public void setFechaDocumentoInicio(Date fechaDocumentoInicio){
		this.fechaDocumentoInicio=fechaDocumentoInicio;
	}

	public Date getFechaDocumentoFinal(){
		return fechaDocumentoFinal;
	}

	public void setFechaDocumentoFinal(Date fechaDocumentoFinal){
		this.fechaDocumentoFinal=fechaDocumentoFinal;
	}

	public String getConsecionario(){
		return consecionario;
	}

	public void setConsecionario(String consecionario){
		this.consecionario=consecionario;
	}

	public Date getFechaExpedienteInicio(){
		return fechaExpedienteInicio;
	}

	public void setFechaExpedienteInicio(Date fechaExpedienteInicio){
		this.fechaExpedienteInicio=fechaExpedienteInicio;
	}

	public Date getFechaExpedienteFinal(){
		return fechaExpedienteFinal;
	}

	public void setFechaExpedienteFinal(Date fechaExpedienteFinal){
		this.fechaExpedienteFinal=fechaExpedienteFinal;
	}

	public String getCliente(){
		return cliente;
	}

	public void setCliente(String cliente){
		this.cliente=cliente;
	}

	public String getDireccionCliente(){
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente){
		this.direccionCliente=direccionCliente;
	}

	public String getAreaDestino(){
		return areaDestino;
	}

	public void setAreaDestino(String areaDestino){
		this.areaDestino=areaDestino;
	}

	public String getAreaOrigen(){
		return areaOrigen;
	}

	public void setAreaOrigen(String areaOrigen){
		this.areaOrigen=areaOrigen;
	}

	public String getPropietario(){
		return propietario;
	}

	public void setPropietario(String propietario){
		this.propietario=propietario;
	}

	public String getProceso(){
		return proceso;
	}

	public void setProceso(String proceso){
		this.proceso=proceso;
	}

	public String getAsuntoExpediente(){
		return asuntoExpediente;
	}

	public void setAsuntoExpediente(String asuntoExpediente){
		this.asuntoExpediente=asuntoExpediente;
	}

	public String getAsuntoDocumento(){
		return asuntoDocumento;
	}

	public void setAsuntoDocumento(String asuntoDocumento){
		this.asuntoDocumento=asuntoDocumento;
	}

	public String getEstadoExpediente(){
		return estadoExpediente;
	}

	public void setEstadoExpediente(String estadoExpediente){
		this.estadoExpediente=estadoExpediente;
	}

	public Usuario getUsuario(){
		return usuario;
	}

	public void setUsuario(Usuario usuario){
		this.usuario=usuario;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idCarpetaBusqueda != null ? idCarpetaBusqueda.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof CarpetaBusqueda)){
			return false;
		}
		CarpetaBusqueda other=(CarpetaBusqueda) object;
		if((this.idCarpetaBusqueda == null && other.idCarpetaBusqueda != null) || (this.idCarpetaBusqueda != null && !this.idCarpetaBusqueda.equals(other.idCarpetaBusqueda))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Carpetabusqueda[carpetabusqueda=" + nombreCarpeta + "]";
	}

	
	public String getStrFechaDocumentoInicio(){
		return strFechaDocumentoInicio;
	}

	
	public String getStrFechaDocumentoFinal(){
		return strFechaDocumentoFinal;
	}

	
	public String getStrFechaExpedienteInicio(){
		return strFechaExpedienteInicio;
	}

	
	public String getStrFechaExpedienteFinal(){
		return strFechaExpedienteFinal;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

}
