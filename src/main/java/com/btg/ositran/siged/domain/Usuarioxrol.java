package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarioxrol")

public class Usuarioxrol implements Serializable{

	private static final long serialVersionUID=1L;
	@EmbeddedId
	protected UsuarioxrolPK usuarioxrolPK;
	
	@JoinColumn(name="idrol",referencedColumnName="idrol",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Rol rol;
	
	@JoinColumn(name="idusuario",referencedColumnName="idusuario",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Usuario usuario;
        	
	public Usuarioxrol(){
	}

	public Usuarioxrol(UsuarioxrolPK usuarioxrolPK){
		this.usuarioxrolPK=usuarioxrolPK;
	}

	public Usuarioxrol(int idusuario,int idrol){
		this.usuarioxrolPK=new UsuarioxrolPK(idusuario,idrol);
	}

	public UsuarioxrolPK getUsuarioxrolPK() {
		return usuarioxrolPK;
	}

	public void setUsuarioxrolPK(UsuarioxrolPK usuarioxrolPK) {
		this.usuarioxrolPK = usuarioxrolPK;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(usuarioxrolPK != null ? usuarioxrolPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Usuarioxrol)){
			return false;
		}
		Usuarioxrol other=(Usuarioxrol) object;
		if((this.usuarioxrolPK == null && other.usuarioxrolPK != null) || (this.usuarioxrolPK != null && !this.usuarioxrolPK.equals(other.usuarioxrolPK))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.usuarioxrol[usuarioxrolPK=" + usuarioxrolPK + "]";
	}
}
