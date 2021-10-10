package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="trazabilidadmovimiento")
public class TrazabilidadMovimiento implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TRAZABILIDADMOVIMIENTO_SEQ")
	@SequenceGenerator(name="TRAZABILIDADMOVIMIENTO_SEQ",sequenceName="TRAZABILIDADMOVIMIENTO_SEQ",initialValue=1,allocationSize=1)
	@Basic(optional=false)
	@Column(name="idtrazabilidadmovimiento")
	private Integer idtrazabilidadmovimiento;

	@Column(name="documento")
	 private Integer documento;

	 @Column(name="accion")
	 private Integer accion;

	 @Column(name="idusuario")
	 private Integer idusuario;

	 @Column(name="nombrepc")
	 private String  nombrepc;

	 @Column(name="fechacreacion")
	 private Date fechacreacion;

	 @Column(name="idexporigen")
	 private Integer  idexporigen;

	 @Column(name="idexpdestino")
	 private Integer  idexpdestino;

	 public Integer getIdtrazabilidadmovimiento() {
		return idtrazabilidadmovimiento;
	}

	public void setIdtrazabilidadmovimiento(Integer idtrazabilidadmovimiento) {
		this.idtrazabilidadmovimiento = idtrazabilidadmovimiento;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public Integer getAccion() {
		return accion;
	}

	public void setAccion(Integer accion) {
		this.accion = accion;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombrepc() {
		return nombrepc;
	}

	public void setNombrepc(String nombrepc) {
		this.nombrepc = nombrepc;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Integer getIdexporigen() {
		return idexporigen;
	}

	public void setIdexporigen(Integer idexporigen) {
		this.idexporigen = idexporigen;
	}

	public Integer getIdexpdestino() {
		return idexpdestino;
	}

	public void setIdexpdestino(Integer idexpdestino) {
		this.idexpdestino = idexpdestino;
	}
}
