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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="rol")
@NamedQueries({@NamedQuery(name="Rol.findAll",query="SELECT r FROM Rol r order by r.descripcion"),@NamedQuery(name="Rol.findByIdrol",query="SELECT r FROM Rol r WHERE r.idrol = :idrol"),@NamedQuery(name="Rol.findByNombre",query="SELECT r FROM Rol r WHERE r.nombre = :nombre"),@NamedQuery(name="Rol.findByDescripcion",query="SELECT r FROM Rol r WHERE r.descripcion = :descripcion"),@NamedQuery(name="Rol.findByEstado",query="SELECT r FROM Rol r WHERE r.estado = :estado")})
public class Rol implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ROL_SEQ")
	//@SequenceGenerator(name="ROL_SEQ",sequenceName="ROL_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idrol")
	private Integer idrol;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@JoinColumn(name="idperfil",referencedColumnName="idperfil")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Perfil idperfil;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="usuarioxrol",joinColumns={@JoinColumn(name="idrol",referencedColumnName="idrol")},inverseJoinColumns={@JoinColumn(name="idusuario",referencedColumnName="idusuario")})
	private List<Usuario> usuarios;
	@OneToMany(mappedBy="rol",fetch=FetchType.LAZY)
	private List<Grid> gridList;
	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "rol") private
	 * List<Usuario> usuarioList;
	 */

	@Basic(optional=false)
	private Character  esJefe;
	
	@Basic(optional=false)
	@Column(name="enumerararea")
	private Character  enumerarArea;
	
	@Basic(optional=false)
	@Column(name="enumerargerencia")
	private Character  enumerarGerencia;
	
	@Basic(optional=false)
	@Column(name="enumerarpresidencia")
	private Character  enumerarPresidencia;
	
	/*
	 * Constants
	 */
	public static final String strDigitalizador="dig";
	public static final String strMesaPartes="mp";
	public static final String strQAS="qas";
	public static final String strSuperUser="superuser";
	public static final String strUsuarioFinal="user";
    
	/*
	 * Constructors
	 */
	public Rol(){
	}

	public Rol(Integer idrol){
		this.idrol=idrol;
	}

	public Rol(Integer idrol,String nombre,char estado){
		this.idrol=idrol;
		this.nombre=nombre;
		this.estado=estado;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdrol(){
		return idrol;
	}

	public void setIdrol(Integer idrol){
		this.idrol=idrol;
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

	public Perfil getIdperfil(){
		return idperfil;
	}

	public void setIdperfil(Perfil idperfil){
		this.idperfil=idperfil;
	}

	public List<Usuario> getUsuarios(){
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios){
		this.usuarios=usuarios;
	}

	/*
	 * public List<Usuario> getUsuarioList() { return usuarioList; }
	 * 
	 * public void setUsuarioList(List<Usuario> usuarioList) { this.usuarioList
	 * = usuarioList; }
	 */
	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idrol != null ? idrol.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Rol)){
			return false;
		}
		Rol other=(Rol) object;
		if((this.idrol == null && other.idrol != null) || (this.idrol != null && !this.idrol.equals(other.idrol))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return this.nombre;
	}

	/*
	 * Auditoria
	 */
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();

		// lstCamposAuditables.add(new AuditableCampo("idunidad","Area"));
		lstCamposAuditables.add(new AuditableCampo("idperfil","Perfil"));
		lstCamposAuditables.add(new AuditableCampo("nombre","Nombre"));
		lstCamposAuditables.add(new AuditableCampo("descripcion","Descripcion"));

		return lstCamposAuditables;
	}

	public List<Grid> getGridList(){
		return gridList;
	}

	public void setGridList(List<Grid> gridList){
		this.gridList=gridList;
	}

	public Character getEsJefe() {
		return esJefe;
	}

	public void setEsJefe(Character esJefe) {
		if(esJefe != null){
			this.esJefe = esJefe;
		}		
	}

	public Character getEnumerarArea() {
		return enumerarArea;
	}

	public void setEnumerarArea(Character enumerarArea) {		
		if(enumerarArea != null){
			this.enumerarArea = enumerarArea;
		}	
	}

	public Character getEnumerarGerencia() {
		return enumerarGerencia;
	}

	public void setEnumerarGerencia(Character enumerarGerencia) {		
		if(enumerarGerencia != null){
			this.enumerarGerencia = enumerarGerencia;
		}	
	}

	public Character getEnumerarPresidencia() {
		return enumerarPresidencia;
	}

	public void setEnumerarPresidencia(Character enumerarPresidencia) {		
		if(enumerarPresidencia != null){
			this.enumerarPresidencia = enumerarPresidencia;
		}
	}
	
	
	
}
