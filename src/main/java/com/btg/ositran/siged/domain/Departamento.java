package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
@NamedQueries({@NamedQuery(name="Departamento.findAll",query="SELECT d FROM Departamento d"),@NamedQuery(name="Departamento.findByNombre",query="SELECT d FROM Departamento d WHERE d.nombre = :nombre"),@NamedQuery(name="Departamento.findByNombreregion",query="SELECT d FROM Departamento d WHERE d.nombre = :nombreregion")})
public class Departamento implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	/*
	 * @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DEPARTAMENTO_SEQ"
	 * )
	 * 
	 * @SequenceGenerator(name="DEPARTAMENTO_SEQ",sequenceName="DEPARTAMENTO_SEQ"
	 * ,initialValue=1,allocationSize=1)
	 */
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="iddepartamento")
	private Integer iddepartamento;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idregion",fetch=FetchType.LAZY)
	private List<DiaFestivo> diafestivoList;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "departamento") private
	 * List<Provincia> provinciaList;
	 */

	/*
	 * Constructors
	 */
	public Departamento(){
            
	}

	public Departamento(Integer iddepartamento){
		this.iddepartamento=iddepartamento;
	}

	public Departamento(Integer iIdDepartamento,String sNombre){
		this.iddepartamento=iIdDepartamento;
		this.nombre=sNombre;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIddepartamento(){
		return iddepartamento;
	}

	public void setIddepartamento(Integer iddepartamento){
		this.iddepartamento=iddepartamento;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public List<DiaFestivo> getDiafestivoList(){
		return diafestivoList;
	}

	public void setDiafestivoList(List<DiaFestivo> diafestivoList){
		this.diafestivoList=diafestivoList;
	}

	/*
	 * public List<Provincia> getProvinciaList() { return provinciaList; }
	 * 
	 * public void setProvinciaList(List<Provincia> provinciaList) {
	 * this.provinciaList = provinciaList; }
	 */
	@Override
	public int hashCode(){
		int hash=0;
		hash+=(iddepartamento != null ? iddepartamento.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Departamento)){
			return false;
		}
		Departamento other=(Departamento) object;
		if((this.iddepartamento == null && other.iddepartamento != null) || (this.iddepartamento != null && !this.iddepartamento.equals(other.iddepartamento))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Departamento[departamento=" + this.nombre + "]";
	}
}
