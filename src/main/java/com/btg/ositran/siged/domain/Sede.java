package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
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

@Entity
@Table(name="sede")
@NamedQueries({@NamedQuery(name="Sede.findAll",query="SELECT s FROM Sede s order by nombre"),@NamedQuery(name="Sede.findByIdsede",query="SELECT s FROM Sede s WHERE s.idsede = :idsede"),@NamedQuery(name="Sede.findByNombre",query="SELECT s FROM Sede s WHERE s.nombre = :nombre"),@NamedQuery(name="Sede.findByDescripcion",query="SELECT s FROM Sede s WHERE s.descripcion = :descripcion"),@NamedQuery(name="Sede.findByDireccion",query="SELECT s FROM Sede s WHERE s.direccion = :direccion")})
public class Sede implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEDE_SEQ")
	@SequenceGenerator(name="SEDE_SEQ",sequenceName="SEDE_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idsede")
	private Integer idsede;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="direccion")
	private String direccion;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="sede")
	private List<Unidad> unidadList;
	@JoinColumn(name="ubigeo",referencedColumnName="iddistrito")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Distrito ubigeo;

	/*
	 * Constructors
	 */
	public Sede(){
	}

	public Sede(Integer idsede){
		this.idsede=idsede;
	}

	public Sede(Integer idsede,String nombre,String direccion){
		this.idsede=idsede;
		this.nombre=nombre;
		this.direccion=direccion;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdsede(){
		return idsede;
	}

	public void setIdsede(Integer idsede){
		this.idsede=idsede;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion=direccion;
	}

	public List<Unidad> getUnidadList(){
		return unidadList;
	}

	public void setUnidadList(List<Unidad> unidadList){
		this.unidadList=unidadList;
	}

	public Distrito getUbigeo(){
		return ubigeo;
	}

	public void setUbigeo(Distrito ubigeo){
		this.ubigeo=ubigeo;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idsede != null ? idsede.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Sede)){
			return false;
		}
		Sede other=(Sede) object;
		if((this.idsede == null && other.idsede != null) || (this.idsede != null && !this.idsede.equals(other.idsede))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.nombre + "]";
	}

	/*
	 * Auditoria
	 */
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();

		lstCamposAuditables.add(new AuditableCampo("nombre","Nombre"));
		lstCamposAuditables.add(new AuditableCampo("descripcion","Descripcion"));
		lstCamposAuditables.add(new AuditableCampo("direccion","Direccion"));
		lstCamposAuditables.add(new AuditableCampo("ubigeo","Ubigeo"));

		return lstCamposAuditables;
	}
}
