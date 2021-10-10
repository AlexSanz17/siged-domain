package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="perfil")
@NamedQueries({@NamedQuery(name="Perfil.findAll",query="SELECT p FROM Perfil p order by nombre"),@NamedQuery(name="Perfil.findByIdperfil",query="SELECT p FROM Perfil p WHERE p.idperfil = :idperfil"),@NamedQuery(name="Perfil.findByNombre",query="SELECT p FROM Perfil p WHERE p.nombre = :nombre"),@NamedQuery(name="Perfil.findByDescripcion",query="SELECT p FROM Perfil p WHERE p.descripcion = :descripcion"),@NamedQuery(name="Perfil.findByEstado",query="SELECT p FROM Perfil p WHERE p.estado = :estado order by nombre")})
public class Perfil implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PERFIL_SEQ")
	@SequenceGenerator(name="PERFIL_SEQ",sequenceName="PERFIL_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idperfil")
	private Integer idperfil;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@JoinTable(name="gridcolumnaxperfil",joinColumns={@JoinColumn(name="idperfil",referencedColumnName="idperfil")},inverseJoinColumns={@JoinColumn(name="idgridcolumna",referencedColumnName="id")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<GridXGridColumna> columnas;
	@JoinTable(name="recursoxperfil",joinColumns={@JoinColumn(name="idperfil",referencedColumnName="idperfil")},inverseJoinColumns={@JoinColumn(name="idrecurso",referencedColumnName="idrecurso")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Recurso> recursoList;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperfil", fetch =
	 * FetchType.LAZY) private List<Rol> rolList;
	 */

	/*
	 * Constructors
	 */
	public Perfil(){
	}

	public Perfil(Integer idperfil){
		this.idperfil=idperfil;
	}

	public Perfil(Integer idperfil,String nombre,char estado){
		this.idperfil=idperfil;
		this.nombre=nombre;
		this.estado=estado;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdperfil(){
		return idperfil;
	}

	public void setIdperfil(Integer idperfil){
		this.idperfil=idperfil;
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

	public List<GridXGridColumna> getColumnas(){
		return columnas;
	}

	public void setColumnas(List<GridXGridColumna> columnas){
		this.columnas=columnas;
	}

	public List<Recurso> getRecursoList(){
		return recursoList;
	}

	public void setRecursoList(List<Recurso> recursoList){
		this.recursoList=recursoList;
	}

	/*
	 * public List<Rol> getRolList() { return rolList; }
	 * 
	 * public void setRolList(List<Rol> rolList) { this.rolList = rolList; }
	 */

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idperfil != null ? idperfil.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Perfil)){
			return false;
		}
		Perfil other=(Perfil) object;
		if((this.idperfil == null && other.idperfil != null) || (this.idperfil != null && !this.idperfil.equals(other.idperfil))){
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
		lstCamposAuditables.add(new AuditableCampo("recursoList","Recursos"));

		return lstCamposAuditables;
	}
}
