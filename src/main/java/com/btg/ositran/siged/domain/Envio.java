package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="envio")
@NamedQueries({@NamedQuery(name="Envio.findAll",query="SELECT e FROM Envio e"),@NamedQuery(name="Envio.findByIdmensajeria",query="SELECT e FROM Envio e WHERE e.idmensajeria = :idmensajeria"),@NamedQuery(name="Envio.findByNumeroguia",query="SELECT e FROM Envio e WHERE e.numeroguia = :numeroguia"),@NamedQuery(name="Envio.findByNumerocourier",query="SELECT e FROM Envio e WHERE e.numerocourier = :numerocourier"),@NamedQuery(name="Envio.findByNombrecourier",query="SELECT e FROM Envio e WHERE e.nombrecourier = :nombrecourier"),@NamedQuery(name="Envio.findByFechasalida",query="SELECT e FROM Envio e WHERE e.fechasalida = :fechasalida"),
// @NamedQuery(name = "Envio.findByTipoenvio", query =
// "SELECT e FROM Envio e WHERE e.tipoenvio = :tipoenvio"),
		@NamedQuery(name="Envio.findByNombreenvio",query="SELECT e FROM Envio e WHERE e.nombreenvio = :nombreenvio"),@NamedQuery(name="Envio.findByDiasdistribuicion",query="SELECT e FROM Envio e WHERE e.diasdistribuicion = :diasdistribuicion"),@NamedQuery(name="Envio.findByDiasdevcargo",query="SELECT e FROM Envio e WHERE e.diasdevcargo = :diasdevcargo"),@NamedQuery(name="Envio.findByDiasdevolucion",query="SELECT e FROM Envio e WHERE e.diasdevolucion = :diasdevolucion")})
public class Envio implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@Basic(optional=false)
	@Column(name="idmensajeria")
	private Integer idmensajeria;
	@Column(name="numeroguia")
	private String numeroguia;
	@Column(name="numerocourier")
	private String numerocourier;
	@Column(name="nombrecourier")
	private String nombrecourier;
	@Column(name="fechasalida")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechasalida;
	@Column(name="nombreenvio")
	private String nombreenvio;
	// @Column(name = "diasdistribuicion")
	// private Integer diasdistribuicion;
	// @Column(name = "diasdevcargo")
	// private Integer diasdevcargo;
	// @Column(name = "diasdevolucion")
	// private Integer diasdevolucion;

	@Column(name="diasdistribucion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date diasdistribuicion;
	@Column(name="diasdevcargo")
	@Temporal(TemporalType.TIMESTAMP)
	private Date diasdevcargo;
	@Column(name="diasdevolucion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date diasdevolucion;

	@Column(name="pesodcmto",length=10)
	private String pesodcmto;
	@Column(name="unidadpeso",length=40)
	private String unidadpeso;

	@Column(name="ambitoenvio")
	private String ambitoenvio;

	@JoinColumn(name="idmensajeria",referencedColumnName="idmensajeria",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private Mensajeria mensajeria;

	public Envio(){
	}

	public Envio(Integer idmensajeria){
		this.idmensajeria=idmensajeria;
	}

	public Integer getIdmensajeria(){
		return idmensajeria;
	}

	public void setIdmensajeria(Integer idmensajeria){
		this.idmensajeria=idmensajeria;
	}

	public String getNumeroguia(){
		return numeroguia;
	}

	public void setNumeroguia(String numeroguia){
		this.numeroguia=numeroguia;
	}

	public String getNumerocourier(){
		return numerocourier;
	}

	public void setNumerocourier(String numerocourier){
		this.numerocourier=numerocourier;
	}

	public String getNombrecourier(){
		return nombrecourier;
	}

	public void setNombrecourier(String nombrecourier){
		this.nombrecourier=nombrecourier;
	}

	public Date getFechasalida(){
		return fechasalida;
	}

	public void setFechasalida(Date fechasalida){
		this.fechasalida=fechasalida;
	}

	public String getNombreenvio(){
		return nombreenvio;
	}

	public void setNombreenvio(String nombreenvio){
		this.nombreenvio=nombreenvio;
	}

	public Mensajeria getMensajeria(){
		return mensajeria;
	}

	public void setMensajeria(Mensajeria mensajeria){
		this.mensajeria=mensajeria;
	}

	public String getPesodcmto(){
		return pesodcmto;
	}

	public void setPesodcmto(String pesodcmto){
		this.pesodcmto=pesodcmto;
	}

	public String getUnidadpeso(){
		return unidadpeso;
	}

	public void setUnidadpeso(String unidadpeso){
		this.unidadpeso=unidadpeso;
	}

	public String getAmbitoenvio(){
		return ambitoenvio;
	}

	public void setAmbitoenvio(String ambitoenvio){
		this.ambitoenvio=ambitoenvio;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idmensajeria != null ? idmensajeria.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Envio)){
			return false;
		}
		Envio other=(Envio) object;
		if((this.idmensajeria == null && other.idmensajeria != null) || (this.idmensajeria != null && !this.idmensajeria.equals(other.idmensajeria))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Envio[idmensajeria=" + idmensajeria + "]";
	}

	/**
	 * @return the diasdistribuicion
	 */
	public Date getDiasdistribuicion(){
		return diasdistribuicion;
	}

	/**
	 * @param diasdistribuicion
	 *            the diasdistribuicion to set
	 */
	public void setDiasdistribuicion(Date diasdistribuicion){
		this.diasdistribuicion=diasdistribuicion;
	}

	/**
	 * @return the diasdevcargo
	 */
	public Date getDiasdevcargo(){
		return diasdevcargo;
	}

	/**
	 * @param diasdevcargo
	 *            the diasdevcargo to set
	 */
	public void setDiasdevcargo(Date diasdevcargo){
		this.diasdevcargo=diasdevcargo;
	}

	/**
	 * @return the diasdevolucion
	 */
	public Date getDiasdevolucion(){
		return diasdevolucion;
	}

	/**
	 * @param diasdevolucion
	 *            the diasdevolucion to set
	 */
	public void setDiasdevolucion(Date diasdevolucion){
		this.diasdevolucion=diasdevolucion;
	}
}
