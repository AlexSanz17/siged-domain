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
@Table(name="reemplazo")
@NamedQueries({@NamedQuery(name="Reemplazo.findAll",query="SELECT r FROM Reemplazo r"),
	@NamedQuery(name="Reemplazo.findByIdreemplazo",query="SELECT r FROM Reemplazo r WHERE r.idreemplazo = :idreemplazo"),
	@NamedQuery(name="Reemplazo.findByIdreemplazado",query="SELECT r FROM Reemplazo r WHERE r.idreemplazado = :idreemplazado"),
	@NamedQuery(name="Reemplazo.findByIdproceso",query="SELECT r FROM Reemplazo r WHERE r.idproceso = :idproceso"),
	@NamedQuery(name="Reemplazo.findByIdreemplazadoIdproceso",query="SELECT r FROM Reemplazo r WHERE r.idproceso = :idproceso and r.idreemplazado = :idreemplazado" + "	 		and r.idreemplazo = (SELECT Max(r.idreemplazo) from Reemplazo r where r.idproceso = :idproceso and r.idreemplazado = :idreemplazado) AND r.estado = 'A'"),
	@NamedQuery(name="Reemplazo.findByEstado",query="SELECT r FROM Reemplazo r WHERE r.estado = :estado"),
	@NamedQuery(name="Reemplazo.findByFechaInicialReemplazo",query="SELECT r FROM Reemplazo r WHERE r.fechainicialreemplazo = :fechainicialreemplazo"),
	@NamedQuery(name="Reemplazo.findByUsuario",query="SELECT r FROM Reemplazo r WHERE r.idusuario.idusuario = :idusuario"),
	@NamedQuery(name="Reemplazo.findByFechaFinalReemplazo",query="SELECT r FROM Reemplazo r WHERE r.fechafinalreemplazo = :fechafinalreemplazo"),
	@NamedQuery(name="Reemplazo.findByReemplazo",query="SELECT r FROM Reemplazo r WHERE r.idproceso=:proceso AND r.idusuario.idusuario=:reemplazante AND r.idreemplazado=:reemplazado and r.estado = 'A'"),
	@NamedQuery(name="Reemplazo.findByEstadoCustom",query="SELECT NEW Reemplazo(r.idreemplazo, u.nombres, u.apellidos, r.idusuario, p.nombre) FROM Reemplazo r, Proceso p, Usuario u WHERE r.idproceso = p.idproceso AND r.idreemplazado = u.idusuario AND r.estado = :estado")})
public class Reemplazo implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="REEMPLAZO_SEQ")
	//@SequenceGenerator(name="REEMPLAZO_SEQ",sequenceName="REEMPLAZO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idreemplazo")
	private Integer idreemplazo;
	@Basic(optional=false)
	@Column(name="idreemplazado")
	private Integer idreemplazado;
	@Basic(optional=false)
	@Column(name="idproceso")
	private Integer idproceso;
	@Basic(optional=false)
	@Column(name="estado")
	private Character estado;
	@Column(name="fechainicialreemplazo")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechainicialreemplazo;
	@Column(name="fechafinalreemplazo")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechafinalreemplazo;
	@JoinColumn(name="idusuario",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario idusuario;
	@Transient
	private String nombreProceso;
	@Transient
	private String nombreReemplazado;

	public Reemplazo(){
	}

	public Reemplazo(Integer iIdReemplazo,String sNombreReemplazado,String sApellidoReemplazado,Usuario objReemplazante,String sNombreProceso){
		this.idreemplazo=iIdReemplazo;
		this.nombreReemplazado=sNombreReemplazado + " " + sApellidoReemplazado;
		this.idusuario=objReemplazante;
		this.nombreProceso=sNombreProceso;
	}

	public Integer getIdreemplazo(){
		return idreemplazo;
	}

	public void setIdreemplazo(Integer idreemplazo){
		this.idreemplazo=idreemplazo;
	}

	public Integer getIdreemplazado(){
		return idreemplazado;
	}

	public void setIdreemplazado(Integer idreemplazado){
		this.idreemplazado=idreemplazado;
	}

	public Date getFechainicialreemplazo(){
		return fechainicialreemplazo;
	}

	public void setFechainicialreemplazo(Date fechainicialreemplazo){
		this.fechainicialreemplazo=fechainicialreemplazo;
	}

	public Date getFechafinalreemplazo(){
		return fechafinalreemplazo;
	}

	public void setFechafinalreemplazo(Date fechafinalreemplazo){
		this.fechafinalreemplazo=fechafinalreemplazo;
	}

	public Usuario getIdusuario(){
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario){
		this.idusuario=idusuario;
	}

	public Integer getIdproceso(){
		return idproceso;
	}

	public void setIdproceso(Integer idproceso){
		this.idproceso=idproceso;
	}

	public Character getEstado(){
		return estado;
	}

	public void setEstado(Character estado){
		this.estado=estado;
	}

	public String getNombreProceso(){
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso){
		this.nombreProceso=nombreProceso;
	}

	public String getNombreReemplazado(){
		return nombreReemplazado;
	}

	public void setNombreReemplazado(String nombreReemplazado){
		this.nombreReemplazado=nombreReemplazado;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final Reemplazo other=(Reemplazo) obj;
		if(this.idreemplazo == null || !this.idreemplazo.equals(other.idreemplazo)){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode(){
		int hash=7;
		hash=73 * hash + (this.idreemplazo != null ? this.idreemplazo.hashCode() : 0);
		return hash;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Recibidofisico[idrecibidofisico=" + idreemplazo + "]";
	}
}
