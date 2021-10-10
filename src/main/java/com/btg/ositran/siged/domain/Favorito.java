package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="favorito")
@NamedQueries({@NamedQuery(name="Favorito.findByPropietarioContactoTipocontactoEstado",query="SELECT f FROM Favorito f WHERE f.propietario = :propietario AND f.idunidadcontacto = :idunidadcontacto AND f.idcargocontacto = :idcargocontacto and f.contacto = :contacto AND f.tipoContacto = :tipocontacto AND f.estado = :estado")})
@SqlResultSetMappings({@SqlResultSetMapping(name="favoritoResult",columns={@ColumnResult(name="id"),@ColumnResult(name="label")})})
public class Favorito implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="FAVORITO_SEQ")
	@SequenceGenerator(name="FAVORITO_SEQ",sequenceName="FAVORITO_SEQ",initialValue=1,allocationSize=1)
	@Basic(optional=false)
	@Column(name="idfavorito")
	private Integer idFavorito;
	@Column(name="idpropietario")
	private Integer propietario;
	@Column(name="idcontacto")
	private Integer contacto;
	@Column(name="tipocontacto")
	private Character tipoContacto;
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
	@Column(name="estado")
	private Character estado;
        
        @Column(name="idunidadcontacto")
	private Integer idunidadcontacto;

   
        
        @Column(name="idcargocontacto")
	private Integer idcargocontacto;

	/*
	 * Transients
	 */
	@Transient
	private String id;
	@Transient
	private String label;

	/*
	 * Constructors
	 */
	public Favorito(){
	}

	public Favorito(String id,String label){
		this.id=id;
		this.label=label;
	}

	/*
	 * Methods
	 */
	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idFavorito != null ? idFavorito.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Favorito)){
			return false;
		}

		Favorito other=(Favorito) object;

		if((this.idFavorito == null && other.idFavorito != null) || (this.idFavorito != null && !this.idFavorito.equals(other.idFavorito))){
			return false;
		}

		return true;
	}

	@Override
	public String toString(){
		return "ID[" + this.idFavorito + "]";
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdFavorito(){
		return idFavorito;
	}

	public void setIdFavorito(Integer idFavorito){
		this.idFavorito=idFavorito;
	}

	public Integer getPropietario(){
		return propietario;
	}

	public void setPropietario(Integer propietario){
		this.propietario=propietario;
	}

	public Integer getContacto(){
		return contacto;
	}

	public void setContacto(Integer contacto){
		this.contacto=contacto;
	}

	public Character getTipoContacto(){
		return tipoContacto;
	}

	public void setTipoContacto(Character tipoContacto){
		this.tipoContacto=tipoContacto;
	}

	public Date getFechaCreacion(){
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion){
		this.fechaCreacion=fechaCreacion;
	}

	public Character getEstado(){
		return estado;
	}

	public void setEstado(Character estado){
		this.estado=estado;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id=id;
	}

	public String getLabel(){
		return label;
	}

	public void setLabel(String label){
		this.label=label;
	}
        
         public Integer getIdunidadcontacto() {
            return idunidadcontacto;
        }

        public void setIdunidadcontacto(Integer idunidadcontacto) {
            this.idunidadcontacto = idunidadcontacto;
        }

        public Integer getIdcargocontacto() {
            return idcargocontacto;
        }

        public void setIdcargocontacto(Integer idcargocontacto) {
            this.idcargocontacto = idcargocontacto;
        }
}
