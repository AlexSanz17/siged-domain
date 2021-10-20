package com.btg.ositran.siged.domain;

import java.io.Serializable;
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
import javax.persistence.Transient;

@Entity
@Table(name="campo")
@NamedQueries({@NamedQuery(name="Campo.findAll",query="SELECT c FROM Campo c")})
public class Campo implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CAMPO_SEQ")
	//@SequenceGenerator(name="CAMPO_SEQ",sequenceName="CAMPO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idcampo")
	private Integer idCampo;

	@Basic(optional=false)
	private String codigo;

	@Basic(optional=false)
	private String descripcion;

	@Basic(optional=false)
	private String tipo;

	@JoinColumn(name="plantilla",referencedColumnName="idplantilla")
	@ManyToOne(optional=false)
	private Plantilla plantilla;

	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="campo")
	private List<Valorcampo> valoresCampo;

	@Column(name="valordefecto")
	private String valorDefecto;

	private Character estado;

	/* Variables temporales */
	private transient String valor;

	/***************************/
	public Campo(){
	}

	public Campo(Integer idcampo){
		this.idCampo=idcampo;
	}

	public Campo(Integer idcampo,String codigo,String descripcion,String tipo){
		this.idCampo=idcampo;
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.tipo=tipo;
	}

	public Integer getIdCampo(){
		return idCampo;
	}

	public void setIdCampo(Integer idCampo){
		this.idCampo=idCampo;
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

	public String getTipo(){
		return tipo;
	}

	public void setTipo(String tipo){
		this.tipo=tipo;
	}

	public Plantilla getPlantilla(){
		return plantilla;
	}

	public void setPlantilla(Plantilla plantilla){
		this.plantilla=plantilla;
	}

	public List<Valorcampo> getValoresCampo(){
		return valoresCampo;
	}

	public void setValoresCampo(List<Valorcampo> valoresCampo){
		this.valoresCampo=valoresCampo;
	}

	public String getValorDefecto(){
		return valorDefecto;
	}

	public void setValorDefecto(String valorDefecto){
		this.valorDefecto=valorDefecto;
	}

	@Transient
	public String getValor(){
		return valor;
	}

	@Transient
	public void setValor(String valor){
		this.valor=valor;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idCampo != null ? idCampo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Campo)){
			return false;
		}
		Campo other=(Campo) object;
		if((this.idCampo == null && other.idCampo != null) || (this.idCampo != null && !this.idCampo.equals(other.idCampo))){
			return false;
		}
		return true;
	}

	public Character getEstado(){
		return estado;
	}

	public void setEstado(Character estado){
		this.estado=estado;
	}
}
