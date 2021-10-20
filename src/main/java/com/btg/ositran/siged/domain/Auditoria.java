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

@Entity
@Table(name="auditoria")
@NamedQueries({@NamedQuery(name="Auditoria.findAll",query="SELECT a FROM Auditoria a order by a.idAuditoria desc")})
public class Auditoria implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="AUDITORIA_SEQ")
	//@SequenceGenerator(name="AUDITORIA_SEQ",sequenceName="AUDITORIA_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idauditoria")
	private Integer idAuditoria;

	@Column(name="tipoauditoria")
	private String tipoAuditoria;

	private String modulo;

	private String opcion;

	private String campo;

	@Column(name="nuevovalor")
	private String nuevoValor;

	@Column(name="oldvalor")
	private String antiguoValor;

	@Column(name="fechaaudioria")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAudioria;

	@Column(name="usuario")
	private String usuario;

	@JoinColumn(name="expediente",referencedColumnName="idexpediente")
	@ManyToOne
	private Expediente expediente;

	@JoinColumn(name="documento",referencedColumnName="iddocumento")
	@ManyToOne
	private Documento documento;

        
	@JoinColumn(name="proceso",referencedColumnName="idproceso")
	@ManyToOne
	private Proceso proceso;
        
        
	@Column(name="nuevovalor_")
	private String nuevoValor_;

	public String getNuevoValor_() {
		return nuevoValor_;
	}

	public void setNuevoValor_(String nuevoValor_) {
		this.nuevoValor_ = nuevoValor_;
	}

	public String getAntiguoValor_() {
		return antiguoValor_;
	}

	public void setAntiguoValor_(String antiguoValor_) {
		this.antiguoValor_ = antiguoValor_;
	}

	@Column(name="oldvalor_")
	private String antiguoValor_;

	public Auditoria(){
	}

	public Auditoria(Integer idauditoria){
		this.idAuditoria=idauditoria;
	}

	public Integer getIdAuditoria(){
		return idAuditoria;
	}

	public void setIdAuditoria(Integer idAuditoria){
		this.idAuditoria=idAuditoria;
	}

	public String getTipoAuditoria(){
		return tipoAuditoria;
	}

	public void setTipoAuditoria(String tipoAuditoria){
		this.tipoAuditoria=tipoAuditoria;
	}

	public String getModulo(){
		return modulo;
	}

	public void setModulo(String modulo){
		this.modulo=modulo;
	}

	public String getOpcion(){
		return opcion;
	}

	public void setOpcion(String opcion){
		this.opcion=opcion;
	}

	public String getCampo(){
		return campo;
	}

	public void setCampo(String campo){
		this.campo=campo;
	}

	public String getNuevoValor(){
		return nuevoValor;
	}

	public void setNuevoValor(String nuevoValor){
		this.nuevoValor=nuevoValor;
	}

	public String getAntiguoValor(){
		return antiguoValor;
	}

	public void setAntiguoValor(String antiguoValor){
		this.antiguoValor=antiguoValor;
	}

	public Date getFechaAudioria(){
		return fechaAudioria;
	}

	public void setFechaAudioria(Date fechaAudioria){
		this.fechaAudioria=fechaAudioria;
	}

	public String getUsuario(){
		return usuario;
	}

	public void setUsuario(String usuario){
		this.usuario=usuario;
	}

	public Expediente getExpediente(){
		return expediente;
	}

	public void setExpediente(Expediente expediente){
		this.expediente=expediente;
	}

	public Documento getDocumento(){
		return documento;
	}

	public void setDocumento(Documento documento){
		this.documento=documento;
	}

        
	public Proceso getProceso(){
		return proceso;
	}

	public void setProceso(Proceso proceso){
		this.proceso=proceso;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idAuditoria != null ? idAuditoria.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Auditoria)){
			return false;
		}
		Auditoria other=(Auditoria) object;
		if((this.idAuditoria == null && other.idAuditoria != null) || (this.idAuditoria != null && !this.idAuditoria.equals(other.idAuditoria))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Auditoria[idauditoria=" + idAuditoria + "]";
	}
}