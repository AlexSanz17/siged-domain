/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Usuario
 */
@Entity
@Table(name="tiporesultado")
@NamedQueries({@NamedQuery(name="Tiporesultado.findAll",query="SELECT t FROM Tiporesultado t"),@NamedQuery(name="Tiporesultado.findByIdtiporesultado",query="SELECT t FROM Tiporesultado t WHERE t.idtiporesultado = :idtiporesultado"),@NamedQuery(name="Tiporesultado.findByResultado",query="SELECT t FROM Tiporesultado t WHERE t.resultado = :resultado"),@NamedQuery(name="Tiporesultado.findByCodigo",query="SELECT t FROM Tiporesultado t WHERE t.codigo = :codigo"),@NamedQuery(name="Tiporesultado.findByEstado",query="SELECT t FROM Tiporesultado t WHERE t.estado = :estado")})
public class Tiporesultado implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@Basic(optional=false)
	@Column(name="idtiporesultado")
	private Integer idtiporesultado;
	@Basic(optional=false)
	@Column(name="resultado")
	private String resultado;
	@Basic(optional=false)
	@Column(name="codigo")
	private String codigo;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@OneToMany(mappedBy="resultado")
	private List<Resolucionjaru> resolucionjaruList;

	public Tiporesultado(){
	}

	public Tiporesultado(Integer idtiporesultado){
		this.idtiporesultado=idtiporesultado;
	}

	public Tiporesultado(Integer idtiporesultado,String resultado,String codigo,char estado){
		this.idtiporesultado=idtiporesultado;
		this.resultado=resultado;
		this.codigo=codigo;
		this.estado=estado;
	}

	public Integer getIdtiporesultado(){
		return idtiporesultado;
	}

	public void setIdtiporesultado(Integer idtiporesultado){
		this.idtiporesultado=idtiporesultado;
	}

	public String getResultado(){
		return resultado;
	}

	public void setResultado(String resultado){
		this.resultado=resultado;
	}

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
	}

	public char getEstado(){
		return estado;
	}

	public void setEstado(char estado){
		this.estado=estado;
	}

	public List<Resolucionjaru> getResolucionjaruList(){
		return resolucionjaruList;
	}

	public void setResolucionjaruList(List<Resolucionjaru> resolucionjaruList){
		this.resolucionjaruList=resolucionjaruList;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idtiporesultado != null ? idtiporesultado.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Tiporesultado)){
			return false;
		}
		Tiporesultado other=(Tiporesultado) object;
		if((this.idtiporesultado == null && other.idtiporesultado != null) || (this.idtiporesultado != null && !this.idtiporesultado.equals(other.idtiporesultado))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Tiporesultado[idtiporesultado=" + idtiporesultado + "]";
	}

}
