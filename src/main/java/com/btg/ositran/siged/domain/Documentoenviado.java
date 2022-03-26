package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="documentoenviado")
@NamedQueries({@NamedQuery(name="Documentoenviado.findAll",query="SELECT d FROM Documentoenviado d"),@NamedQuery(name="Documentoenviado.findByIddocumentoenviado",query="SELECT d FROM Documentoenviado d WHERE d.iddocumentoenviado = :iddocumentoenviado"),
	@NamedQuery(name="Documentoenviado.findByUsuario",query="SELECT d FROM Documentoenviado d WHERE d.usuario.idusuario = :idusuario and estado= :estado "),@NamedQuery(name="Documentoenviado.findByEstado",query="SELECT d FROM Documentoenviado d WHERE d.estado = :estado")})
public class Documentoenviado implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DOCUMENTOENVIADO_SEQ")
	//@SequenceGenerator(name="DOCUMENTOENVIADO_SEQ",sequenceName="DOCUMENTOENVIADO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="iddocumentoenviado",nullable=false)
	private Integer iddocumentoenviado;
	@Column(name="estado",length=1)
	private String estado;
	@JoinColumn(name="idusuario",referencedColumnName="idusuario",nullable=false)
	@ManyToOne(optional=false)
	private Usuario usuario;
	/*wvcarrasco 25-10-2011 Deprecado
	 * @JoinColumn(name="idtrazabilidaddocumento",referencedColumnName="idtrazabilidaddocumento",nullable=false)
	@ManyToOne(optional=false)
	private Trazabilidaddocumento trazabilidaddocumento;*/

  
	
	@Column(name="idtrazabilidaddocumento")
	private Integer idTrazabilidadEnvio;
	
	@Column(name="tipoenvio")
	private String tipoEnvio;
        
        @Column(name="unidadpropietario")
	private Integer unidadpropietario;
        
         @Column(name="cargopropietario")
	private Integer cargopropietario;
                
	
	private transient String cadenaCC;
        
        @Column(name="usuariocreacion")
	private Integer usuariocreacion;
        
     @Column(name="fechacreacion")
    	private Date fechaCreacion;
	

	public Documentoenviado(){
	}

	public Documentoenviado(Integer iddocumentoenviado){
		this.iddocumentoenviado=iddocumentoenviado;
	}

	public Integer getIddocumentoenviado(){
		return iddocumentoenviado;
	}

	public void setIddocumentoenviado(Integer iddocumentoenviado){
		this.iddocumentoenviado=iddocumentoenviado;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public Integer getIdTrazabilidadEnvio() {
		return idTrazabilidadEnvio;
	}

	public void setIdTrazabilidadEnvio(Integer idTrazabilidadEnvio) {
		this.idTrazabilidadEnvio = idTrazabilidadEnvio;
	}

	public Usuario getUsuario(){
		return usuario;
	}

	public void setUsuario(Usuario idusuario){
		this.usuario=idusuario;
	}	

	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/*
	public Trazabilidaddocumento getTrazabilidaddocumento(){
		return trazabilidaddocumento;
	}

	public void setTrazabilidaddocumento(Trazabilidaddocumento idtrazabilidaddocumento){
		this.trazabilidaddocumento=idtrazabilidaddocumento;
	}
*/
	public String getCadenaCC(){
		return cadenaCC;
	}

	public void setCadenaCC(String cadenaCC){
		this.cadenaCC=cadenaCC;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(iddocumentoenviado != null ? iddocumentoenviado.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Documentoenviado)){
			return false;
		}
		Documentoenviado other=(Documentoenviado) object;
		if((this.iddocumentoenviado == null && other.iddocumentoenviado != null) || (this.iddocumentoenviado != null && !this.iddocumentoenviado.equals(other.iddocumentoenviado))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Documentoenviado[iddocumentoenviado=" + iddocumentoenviado + "]";
	}
        
    public Integer getUnidadpropietario() {
            return unidadpropietario;
    }

    public void setUnidadpropietario(Integer unidadpropietario) {
            this.unidadpropietario = unidadpropietario;
    }

    public Integer getCargopropietario() {
            return cargopropietario;
    }

    public void setCargopropietario(Integer cargopropietario) {
            this.cargopropietario = cargopropietario;
    }
        
    public Integer getUsuariocreacion() {
            return usuariocreacion;
    }

    public void setUsuariocreacion(Integer usuariocreacion) {
            this.usuariocreacion = usuariocreacion;
    }
}