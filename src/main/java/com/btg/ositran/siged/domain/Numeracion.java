package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="numeracion")
@NamedQueries({@NamedQuery(name="Numeracion.findAll",query="SELECT n FROM Numeracion n"),
// @NamedQuery(name = "Numeracion.findByIdnumeracion", query =
// "SELECT n FROM Numeracion n WHERE n.idNumeracion.idunidad = :idunidad and n.idNumeracion.idtipodocumento = :idtipodocumento"),
		@NamedQuery(name="Numeracion.findByIdnumeracion",query="SELECT n FROM Numeracion n WHERE n.idNumeracion.idunidad = :idunidad and n.idNumeracion.idtipodocumento = :idtipodocumento"),@NamedQuery(name="Numeracion.findByIdunidad",query="SELECT n FROM Numeracion n WHERE n.idNumeracion.idunidad = :idunidad"),@NamedQuery(name="Numeracion.findByIdtipodocumento",query="SELECT n FROM Numeracion n WHERE n.idNumeracion.idtipodocumento = :idtipodocumento"),@NamedQuery(name="Numeracion.findByNumeroactual",query="SELECT n FROM Numeracion n WHERE n.numeroactual = :numeroactual"),@NamedQuery(name="Numeracion.findByFormato",query="SELECT n FROM Numeracion n WHERE n.formato = :formato")})
public class Numeracion implements Serializable{

	private static final long serialVersionUID=1L;
	@EmbeddedId
	protected IdNumeracion idNumeracion;
	@Column(name="numeroactual")
	private Integer numeroactual;
	@Column(name="formato")
	private String formato;
	@Column(name="tiponumeracion")
	private Character tiponumeracion;
	@Column(name="firmante")
	private Character firmante;
	@Column(name="destinatario")
	private Character destinatario;
        @Column(name="aniofiscal")
        private Integer anioFiscal;
	@JoinColumn(name="idtipodocumento",referencedColumnName="idtipodocumento",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Tipodocumento tipodocumento;
	@JoinColumn(name="idunidad",referencedColumnName="idunidad",insertable=false,updatable=false)
	@ManyToOne(optional=false)
	private Unidad unidad;
	private transient String formatoleft;
	private transient String formatoright;
        
        @Column(name="fechamodificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

        @Column(name="usuariomodificacion")
	private Integer usuarioModificacion;

	public Numeracion(){
	}

	public Numeracion(Character destinatario,Character firmante,Character tiponumeracion,String formato){
		this.destinatario=destinatario;
		this.firmante=firmante;
		this.tiponumeracion=tiponumeracion;
		this.formato=formato;
	}
        
         public Date getFechaModificacion() {
            return fechaModificacion;
        }

        public void setFechaModificacion(Date fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
        }
        
        public Integer getAnioFiscal(){
            return anioFiscal;
        }
        
        public void setAnioFiscal(Integer anioFiscal){
            this.anioFiscal = anioFiscal;
        }

        public Integer getUsuarioModificacion() {
            return usuarioModificacion;
        }

        public void setUsuarioModificacion(Integer usuarioModificacion) {
            this.usuarioModificacion = usuarioModificacion;
        }
        

	public Numeracion(IdNumeracion numeracionPK){
		this.idNumeracion=numeracionPK;
	}

	public Numeracion(int idunidad,int idtipodocumento){
		this.idNumeracion=new IdNumeracion(idunidad,idtipodocumento);
	}

	public IdNumeracion getNumeracionPK(){
		return idNumeracion;
	}

	public void setNumeracionPK(IdNumeracion numeracionPK){
		this.idNumeracion=numeracionPK;
	}

	public IdNumeracion getIdNumeracion(){
		return idNumeracion;
	}

	public void setIdNumeracion(IdNumeracion idNumeracion){
		this.idNumeracion=idNumeracion;
	}

	public Integer getNumeroactual(){
		return numeroactual;
	}

	public void setNumeroactual(Integer numeroactual){
		this.numeroactual=numeroactual;
	}

	public String getFormato(){
		return formato;
	}

	public void setFormato(String formato){
		this.formato=formato;
	}

	public Character getTiponumeracion(){
		return tiponumeracion;
	}

	public void setTiponumeracion(Character tiponumeracion){
		this.tiponumeracion=tiponumeracion;
	}

	public Character getFirmante(){
		return firmante;
	}

	public void setFirmante(Character firmante){
		this.firmante=firmante;
	}

	public Character getDestinatario(){
		return destinatario;
	}

	public void setDestinatario(Character destinatario){
		this.destinatario=destinatario;
	}

	public Tipodocumento getTipodocumento(){
		return tipodocumento;
	}

	public void setTipodocumento(Tipodocumento tipodocumento){
		this.tipodocumento=tipodocumento;
	}

	public Unidad getUnidad(){
		return unidad;
	}

	public void setUnidad(Unidad unidad){
		this.unidad=unidad;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idNumeracion != null ? idNumeracion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Numeracion)){
			return false;
		}
		Numeracion other=(Numeracion) object;
		if((this.idNumeracion == null && other.idNumeracion != null) || (this.idNumeracion != null && !this.idNumeracion.equals(other.idNumeracion))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Numeracion[numeracionPK=" + idNumeracion + "]";
	}

	@Transient
	public String getFormatoleft(){
		return formatoleft;
	}

	@Transient
	public void setFormatoleft(String formatoleft){
		this.formatoleft=formatoleft;
	}

	@Transient
	public String getFormatoright(){
		return formatoright;
	}

	@Transient
	public void setFormatoright(String formatoright){
		this.formatoright=formatoright;
	}

	public String formatearNumero(){
		String numero = numeroactual.toString();
		String nformat = "";
		if(numero.length()<4){
			for(int i=1; i<=4-numero.length(); i++){
				nformat += "0";
			}
		}
		nformat += numero;
		return formato.replace("$NUMERO", nformat);
	}
}
