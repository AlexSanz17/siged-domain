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
@Table(name="supervisor")
@NamedQueries({@NamedQuery(name="Supervisor.findAll",query="SELECT s FROM Supervisor s"),@NamedQuery(name="Supervisor.findByIdsupervisor",query="SELECT s FROM Supervisor s WHERE s.idsupervisor = :idsupervisor"),@NamedQuery(name="Supervisor.findByFechadsolicitud",query="SELECT s FROM Supervisor s WHERE s.fechadsolicitud = :fechadsolicitud"),@NamedQuery(name="Supervisor.findByFechadentrega",query="SELECT s FROM Supervisor s WHERE s.fechadentrega = :fechadentrega"),@NamedQuery(name="Supervisor.findByFechadevolucion",query="SELECT s FROM Supervisor s WHERE s.fechadevolucion = :fechadevolucion"),@NamedQuery(name="Supervisor.findByCaja",query="SELECT s FROM Supervisor s WHERE s.caja = :caja"),@NamedQuery(name="Supervisor.findByEstado",query="SELECT s FROM Supervisor s WHERE s.estado = :estado")})
public class Supervisor implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SUPERVISOR_SEQ")
	@SequenceGenerator(name="SUPERVISOR_SEQ",sequenceName="SUPERVISOR_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idsupervisor")
	private Integer idsupervisor;
	@Column(name="fechadsolicitud")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechadsolicitud;
	@Column(name="fechadentrega")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechadentrega;
	@Column(name="fechadevolucion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechadevolucion;
	@Column(name="caja")
	private String caja;
	@Column(name="estado")
	private char estado;
	@JoinColumn(name="documento",referencedColumnName="iddocumento")
	@ManyToOne
	private Documento documento;
	@JoinColumn(name="expediente",referencedColumnName="idexpediente")
	@ManyToOne
	private Expediente expediente;
	@JoinColumn(name="usuario",referencedColumnName="idusuario")
	@ManyToOne
	private Usuario usuario;

	public Supervisor(){
	}

	public Supervisor(Integer idsupervisor){
		this.idsupervisor=idsupervisor;
	}

	public Integer getIdsupervisor(){
		return idsupervisor;
	}

	public void setIdsupervisor(Integer idsupervisor){
		this.idsupervisor=idsupervisor;
	}

	public Date getFechadsolicitud(){
		return fechadsolicitud;
	}

	public void setFechadsolicitud(Date fechadsolicitud){
		this.fechadsolicitud=fechadsolicitud;
	}

	public Date getFechadentrega(){
		return fechadentrega;
	}

	public void setFechadentrega(Date fechadentrega){
		this.fechadentrega=fechadentrega;
	}

	public Date getFechadevolucion(){
		return fechadevolucion;
	}

	public void setFechadevolucion(Date fechadevolucion){
		this.fechadevolucion=fechadevolucion;
	}

	public String getCaja(){
		return caja;
	}

	public void setCaja(String caja){
		this.caja=caja;
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

	public Documento getDocumento(){
		return documento;
	}

	public void setDocumento(Documento documento){
		this.documento=documento;
	}

	public Expediente getExpediente(){
		return expediente;
	}

	public void setExpediente(Expediente expediente){
		this.expediente=expediente;
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
		hash+=(idsupervisor != null ? idsupervisor.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Supervisor)){
			return false;
		}
		Supervisor other=(Supervisor) object;
		if((this.idsupervisor == null && other.idsupervisor != null) || (this.idsupervisor != null && !this.idsupervisor.equals(other.idsupervisor))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "Test.pojo.Supervisor[idsupervisor=" + idsupervisor + "]";
	}
}
