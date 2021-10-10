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
@Table(name="resolucionjaru")
@NamedQueries({@NamedQuery(name="Resolucionjaru.findAll",query="SELECT r FROM Resolucionjaru r"),@NamedQuery(name="Resolucionjaru.findByIdresolucion",query="SELECT r FROM Resolucionjaru r WHERE r.idresolucion = :idresolucion"),@NamedQuery(name="Resolucionjaru.findByIdExpedienteStor",query="SELECT r FROM Resolucionjaru r WHERE r.expediente.id = :idexpediente"),@NamedQuery(name="Resolucionjaru.findByResultado",query="SELECT r FROM Resolucionjaru r WHERE r.resultado = :resultado"),@NamedQuery(name="Resolucionjaru.findByNroresolucion",query="SELECT r FROM Resolucionjaru r WHERE r.nroresolucion = :nroresolucion"),@NamedQuery(name="Resolucionjaru.findByFechaelevacion",query="SELECT r FROM Resolucionjaru r WHERE r.fechaelevacion = :fechaelevacion"),@NamedQuery(name="Resolucionjaru.findByFechaaprobacion",query="SELECT r FROM Resolucionjaru r WHERE r.fechaaprobacion = :fechaaprobacion"),
		@NamedQuery(name="Resolucionjaru.findByFechacumplimiento",query="SELECT r FROM Resolucionjaru r WHERE r.fechacumplimiento = :fechacumplimiento"),@NamedQuery(name="Resolucionjaru.findByFechanotificacionconcesionario",query="SELECT r FROM Resolucionjaru r WHERE r.fechanotificacionconcesionario = :fechanotificacionconcesionario"),@NamedQuery(name="Resolucionjaru.findByFechanotificacionreclamante",query="SELECT r FROM Resolucionjaru r WHERE r.fechanotificacionreclamante = :fechanotificacionreclamante")})
public class Resolucionjaru implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="RESOLUCIONJARU_SEQ")
	@SequenceGenerator(name="RESOLUCIONJARU_SEQ",sequenceName="RESOLUCIONJARU_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idresolucion")
	private Integer idresolucion;
	@Column(name="nroresolucion")
	private String nroresolucion;
	@Column(name="fechaelevacion")
	@Temporal(TemporalType.DATE)
	private Date fechaelevacion;
	@Column(name="fechaaprobacion")
	@Temporal(TemporalType.DATE)
	private Date fechaaprobacion;
	@Column(name="plazo")
	private Integer plazo;
	@Column(name="fechacumplimiento")
	@Temporal(TemporalType.DATE)
	private Date fechacumplimiento;
	@Column(name="fechanotificacionconcesionario")
	@Temporal(TemporalType.DATE)
	private Date fechanotificacionconcesionario;
	@Column(name="fechanotificacionreclamante")
	@Temporal(TemporalType.DATE)
	private Date fechanotificacionreclamante;
	@JoinColumn(name="expediente",referencedColumnName="idexpediente")
	@ManyToOne
	private Expedientestor expediente;
	@JoinColumn(name="resultado",referencedColumnName="idtiporesultado")
	@ManyToOne
	private Tiporesultado resultado;
	@Column(name="fechasesion")
	@Temporal(TemporalType.DATE)
	private Date fechasesion;
	@JoinColumn(name="idvocal",referencedColumnName="idvocal")
	@ManyToOne
	private Vocal vocal;

	public Resolucionjaru(){
	}

	public Resolucionjaru(Integer idresolucion){
		this.idresolucion=idresolucion;
	}

	public Integer getIdresolucion(){
		return idresolucion;
	}

	public void setIdresolucion(Integer idresolucion){
		this.idresolucion=idresolucion;
	}

	public String getNroresolucion(){
		return nroresolucion;
	}

	public void setNroresolucion(String nroresolucion){
		this.nroresolucion=nroresolucion;
	}

	public Date getFechaelevacion(){
		return fechaelevacion;
	}

	public void setFechaelevacion(Date fechaelevacion){
		this.fechaelevacion=fechaelevacion;
	}

	public Date getFechaaprobacion(){
		return fechaaprobacion;
	}

	public void setFechaaprobacion(Date fechaaprobacion){
		this.fechaaprobacion=fechaaprobacion;
	}

	public Integer getPlazo(){
		return plazo;
	}

	public void setPlazo(Integer plazo){
		this.plazo=plazo;
	}

	public Date getFechacumplimiento(){
		return fechacumplimiento;
	}

	public void setFechacumplimiento(Date fechacumplimiento){
		this.fechacumplimiento=fechacumplimiento;
	}

	public Date getFechanotificacionconcesionario(){
		return fechanotificacionconcesionario;
	}

	public void setFechanotificacionconcesionario(Date fechanotificacionconcesionario){
		this.fechanotificacionconcesionario=fechanotificacionconcesionario;
	}

	public Date getFechanotificacionreclamante(){
		return fechanotificacionreclamante;
	}

	public void setFechanotificacionreclamante(Date fechanotificacionreclamante){
		this.fechanotificacionreclamante=fechanotificacionreclamante;
	}

	public Expedientestor getExpediente(){
		return expediente;
	}

	public void setExpediente(Expedientestor expediente){
		this.expediente=expediente;
	}

	public Tiporesultado getResultado(){
		return resultado;
	}

	public void setResultado(Tiporesultado resultado){
		this.resultado=resultado;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idresolucion != null ? idresolucion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Resolucionjaru)){
			return false;
		}
		Resolucionjaru other=(Resolucionjaru) object;
		if((this.idresolucion == null && other.idresolucion != null) || (this.idresolucion != null && !this.idresolucion.equals(other.idresolucion))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Resolucionjaru[idresolucion=" + idresolucion + "]";
	}

	public Date getFechasesion(){
		return fechasesion;
	}

	public void setFechasesion(Date fechasesion){
		this.fechasesion=fechasesion;
	}

	public Vocal getVocal(){
		return vocal;
	}

	public void setVocal(Vocal vocal){
		this.vocal=vocal;
	}
}
