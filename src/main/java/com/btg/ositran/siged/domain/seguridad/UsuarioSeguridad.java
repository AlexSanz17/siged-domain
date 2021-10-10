package com.btg.ositran.siged.domain.seguridad;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;

/**
 * The persistent class for the SEG_M_USRIO database table.
 * 
 */
//@Entity
//@Table(name="SEG_M_USRIO")
public class UsuarioSeguridad implements Serializable{
	private static final long serialVersionUID=1L;

	@Id
	@Column(name="USRIO_ID")
	private int idUsuario;

	// @Column(name="COD_DEP")
	@JoinColumn(name="COD_DEP",referencedColumnName="COD_DEP")
	@ManyToOne(optional=false)
	private UnidadSeguridad unidad;

	@Column(name="USRIO_CORREO")
	private String correo;

	@Column(name="USRIO_ESTADO")
	private String estado;

	@Column(name="USRIO_LOGIN")
	private String usuario;

	@Column(name="USRIO_NOMBRE")
	private String nombre;

	@Column(name="USRIO_CNTRSNHA")
	private String clave;

	// uni-directional many-to-many association to Rol
	@ManyToMany
	@JoinTable(name="SEG_T_USRIO_ROL",joinColumns={@JoinColumn(name="USRIO_ID")},inverseJoinColumns={@JoinColumn(name="ROL_ID")})
	private List<RolSeguridad> roles;

	public UsuarioSeguridad(){
	}

	public int getIdUsuario(){
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario){
		this.idUsuario=idUsuario;
	}

	public UnidadSeguridad getUnidad(){
		return this.unidad;
	}

	public void setUnidad(UnidadSeguridad unidad){
		this.unidad=unidad;
	}

	public String getCorreo(){
		return this.correo;
	}

	public void setCorreo(String correo){
		this.correo=correo;
	}

	public String getEstado(){
		return this.estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public String getUsuario(){
		return this.usuario;
	}

	public void setUsuario(String usuario){
		this.usuario=usuario;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public List<RolSeguridad> getRoles(){
		return this.roles;
	}

	public void setRoles(List<RolSeguridad> roles){
		this.roles=roles;
	}

	public String getClave(){
		return clave;
	}

	public void setClave(String clave){
		this.clave=clave;
	}
}