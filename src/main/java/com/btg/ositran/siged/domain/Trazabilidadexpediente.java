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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="trazabilidadexpediente")
@NamedQueries({@NamedQuery(name="Trazabilidadexpediente.findAll",query="SELECT t FROM Trazabilidadexpediente t"),@NamedQuery(name="Trazabilidadexpediente.findByIdtrazabilidadexpediente",query="SELECT t FROM Trazabilidadexpediente t WHERE t.idtrazabilidadexpediente = :idtrazabilidadexpediente"),@NamedQuery(name="Trazabilidadexpediente.findByNroregistro",query="SELECT t FROM Trazabilidadexpediente t WHERE t.nroregistro = :nroregistro"),@NamedQuery(name="Trazabilidadexpediente.findByFechacreacion",query="SELECT t FROM Trazabilidadexpediente t WHERE t.fechacreacion = :fechacreacion"),@NamedQuery(name="Trazabilidadexpediente.findByFecharecibido",query="SELECT t FROM Trazabilidadexpediente t WHERE t.fecharecibido = :fecharecibido"),@NamedQuery(name="Trazabilidadexpediente.findByIdexpediente",query="SELECT t FROM Trazabilidadexpediente t WHERE t.expediente.id = :idexpediente order by t.idtrazabilidadexpediente"),
		@NamedQuery(name="Trazabilidadexpediente.findByMaxNroRegistro",query="SELECT t FROM Trazabilidadexpediente t WHERE t.expediente.id = :idexpediente AND t.nroregistro = (SELECT MAX(tt.nroregistro) FROM Trazabilidadexpediente tt WHERE tt.expediente.id = :idexpediente)")})
public class Trazabilidadexpediente implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TRAZABILIDADEXPEDIENTE_SEQ")
	//@SequenceGenerator(name="TRAZABILIDADEXPEDIENTE_SEQ",sequenceName="TRAZABILIDADEXPEDIENTE_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idtrazabilidadexpediente")
	private Integer idtrazabilidadexpediente;
	@Basic(optional=false)
	@Column(name="nroregistro")
	private int nroregistro;
	@Lob
	@Column(name="observacion")
	private String observacion;
	@Column(name="fechalimiteatencion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechalimiteatencion;
	@Column(name="fecharecibido")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharecibido;
	@Column(name="fecharecibidomonth")
	private Integer fecharecibidomonth;
	@Column(name="fecharecibidoyear")
	private Integer fecharecibidoyear;
	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;
	@Column(name="fechacreacionmonth")
	private Integer fechacreacionmonth;
	@Column(name="fechacreacionyear")
	private Integer fechacreacionyear;
	@JoinColumn(name="destinatario",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario destinatario;
	@Column(name="estado")
	private Character estado;
        
	@JoinColumn(name="idproceso",referencedColumnName="idproceso")
	@ManyToOne(optional=false)
	private Proceso idproceso; 
	@JoinColumn(name="accion",referencedColumnName="idaccion")
	@ManyToOne(optional=false)
	private Accion accion;
	@JoinColumn(name="etapa",referencedColumnName="idetapa")
	@ManyToOne(optional=false)
	private Etapa etapa;
	@JoinColumn(name="expediente",referencedColumnName="idexpediente")
	@ManyToOne(optional=false)
	private Expediente expediente;
	@JoinColumn(name="remitente",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario remitente;

	public Trazabilidadexpediente(){
	}

	public Trazabilidadexpediente(Integer idtrazabilidadexpediente){
		this.idtrazabilidadexpediente=idtrazabilidadexpediente;
	}

	public Trazabilidadexpediente(Integer idtrazabilidadexpediente,int nroregistro,Date fechacreacion){
		this.idtrazabilidadexpediente=idtrazabilidadexpediente;
		this.nroregistro=nroregistro;
		this.fechacreacion=fechacreacion;
	}

	public Integer getIdtrazabilidadexpediente(){
		return idtrazabilidadexpediente;
	}

	public void setIdtrazabilidadexpediente(Integer idtrazabilidadexpediente){
		this.idtrazabilidadexpediente=idtrazabilidadexpediente;
	}

	public int getNroregistro(){
		return nroregistro;
	}

	public void setNroregistro(int nroregistro){
		this.nroregistro=nroregistro;
	}

	public String getObservacion(){
		return observacion;
	}

	public void setObservacion(String observacion){
		this.observacion=observacion;
	}

	public Date getFechalimiteatencion(){
		return fechalimiteatencion;
	}

	public void setFechalimiteatencion(Date fechalimiteatencion){
		this.fechalimiteatencion=fechalimiteatencion;
	}

	public Date getFecharecibido(){
		return fecharecibido;
	}

	public void setFecharecibido(Date fecharecibido){
		this.fecharecibido=fecharecibido;
	}

	public Integer getFecharecibidomonth(){
		return fecharecibidomonth;
	}

	public void setFecharecibidomonth(Integer fecharecibidomonth){
		this.fecharecibidomonth=fecharecibidomonth;
	}

	public Integer getFecharecibidoyear(){
		return fecharecibidoyear;
	}

	public void setFecharecibidoyear(Integer fecharecibidoyear){
		this.fecharecibidoyear=fecharecibidoyear;
	}

	public Date getFechacreacion(){
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion){
		this.fechacreacion=fechacreacion;
	}

	public Integer getFechacreacionmonth(){
		return fechacreacionmonth;
	}

	public void setFechacreacionmonth(Integer fechacreacionmonth){
		this.fechacreacionmonth=fechacreacionmonth;
	}

	public Integer getFechacreacionyear(){
		return fechacreacionyear;
	}

	public void setFechacreacionyear(Integer fechacreacionyear){
		this.fechacreacionyear=fechacreacionyear;
	}

	public Usuario getDestinatario(){
		return destinatario;
	}

	public void setDestinatario(Usuario destinatario){
		this.destinatario=destinatario;
	}

	public Character getEstado(){
		return estado;
	}

	/*
	 * public void setEstado(char estado) { this.estado = estado; }
	 */

	public void setEstado(Character estado){
		if(estado != null){
			this.estado=estado;
		}
	}

        
	public Proceso getIdproceso(){
		return idproceso;
	}

	public void setIdproceso(Proceso idproceso){
		this.idproceso=idproceso;
	}

	public Accion getAccion(){
		return accion;
	}

	public void setAccion(Accion accion){
		this.accion=accion;
	}

	public Etapa getEtapa(){
		return etapa;
	}

	public void setEtapa(Etapa etapa){
		this.etapa=etapa;
	}

	public Expediente getExpediente(){
		return expediente;
	}

	public void setExpediente(Expediente expediente){
		this.expediente=expediente;
	}

	public Usuario getRemitente(){
		return remitente;
	}

	public void setRemitente(Usuario remitente){
		this.remitente=remitente;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idtrazabilidadexpediente != null ? idtrazabilidadexpediente.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Trazabilidadexpediente)){
			return false;
		}
		Trazabilidadexpediente other=(Trazabilidadexpediente) object;
		if((this.idtrazabilidadexpediente == null && other.idtrazabilidadexpediente != null) || (this.idtrazabilidadexpediente != null && !this.idtrazabilidadexpediente.equals(other.idtrazabilidadexpediente))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Trazabilidadexpediente[idtrazabilidadexpediente=" + idtrazabilidadexpediente + "]";
	}
}
