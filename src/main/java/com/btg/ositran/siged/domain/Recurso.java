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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="recurso")
@NamedQueries({@NamedQuery(name="Recurso.findAll",query="SELECT r FROM Recurso r order by nombre"),@NamedQuery(name="Recurso.findRecusosActivos",query="SELECT r FROM Recurso r WHERE r.estado=:estado order by nombre"),@NamedQuery(name="Recurso.findByIdrecurso",query="SELECT r FROM Recurso r WHERE r.idrecurso = :idrecurso"),@NamedQuery(name="Recurso.findByNombre",query="SELECT r FROM Recurso r WHERE r.nombre = :nombre"),@NamedQuery(name="Recurso.findByCodigo",query="SELECT r FROM Recurso r WHERE r.codigo = :codigo"),@NamedQuery(name="Recurso.findByActionurl",query="SELECT r FROM Recurso r WHERE r.actionurl = :actionurl order by nombre"),@NamedQuery(name="Recurso.findByDescripcion",query="SELECT r FROM Recurso r WHERE r.descripcion = :descripcion"),@NamedQuery(name="Recurso.findByEstado",query="SELECT r FROM Recurso r WHERE r.estado = :estado order by nombre")})
public class Recurso implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="RECURSO_SEQ")
	@SequenceGenerator(name="RECURSO_SEQ",sequenceName="RECURSO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idrecurso")
	private Integer idrecurso;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Basic(optional=false)
	@Column(name="codigo")
	private String codigo;
	@Column(name="actionurl")
	private String actionurl;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@ManyToMany(mappedBy="recursos",fetch=FetchType.LAZY)
	private List<Actividad> actividadList;
	@ManyToMany(mappedBy="recursoList",fetch=FetchType.LAZY)
	private List<Perfil> perfilList;
	@JoinColumn(name="idmodulo",referencedColumnName="idmodulo")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Modulo idmodulo;

	/*
	 * Constructors
	 */
	public Recurso(){
	}

	public Recurso(Integer idrecurso){
		this.idrecurso=idrecurso;
	}

	public Recurso(Integer idrecurso,String nombre,String codigo,char estado){
		this.idrecurso=idrecurso;
		this.nombre=nombre;
		this.codigo=codigo;
		this.estado=estado;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdrecurso(){
		return idrecurso;
	}

	public void setIdrecurso(Integer idrecurso){
		this.idrecurso=idrecurso;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
	}

	public String getActionurl(){
		return actionurl;
	}

	public void setActionurl(String actionurl){
		this.actionurl=actionurl;
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

	public List<Actividad> getActividadList(){
		return actividadList;
	}

	public void setActividadList(List<Actividad> actividadList){
		this.actividadList=actividadList;
	}

	public List<Perfil> getPerfilList(){
		return perfilList;
	}

	public void setPerfilList(List<Perfil> perfilList){
		this.perfilList=perfilList;
	}

	public Modulo getIdmodulo(){
		return idmodulo;
	}

	public void setIdmodulo(Modulo idmodulo){
		this.idmodulo=idmodulo;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idrecurso != null ? idrecurso.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Recurso)){
			return false;
		}
		Recurso other=(Recurso) object;
		if((this.idrecurso == null && other.idrecurso != null) || (this.idrecurso != null && !this.idrecurso.equals(other.idrecurso))){
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

		lstCamposAuditables.add(new AuditableCampo("idmodulo","Modulo"));
		lstCamposAuditables.add(new AuditableCampo("nombre","Nombre"));
		lstCamposAuditables.add(new AuditableCampo("codigo","Codigo"));
		lstCamposAuditables.add(new AuditableCampo("actionurl","URL"));
		lstCamposAuditables.add(new AuditableCampo("descripcion","Descripcion"));

		return lstCamposAuditables;
	}
}
