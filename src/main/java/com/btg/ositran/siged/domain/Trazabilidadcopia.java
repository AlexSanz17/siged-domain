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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TRAZABILIDADCOPIA")
@NamedQueries({@NamedQuery(name="Trazabilidadcopia.buscarPorId",query="SELECT t FROM Trazabilidadcopia t WHERE t.idtrazabilidadcopia = :ididtrazabilidadcopia"),@NamedQuery(name="Trazabilidadcopia.buscarPorOrigen",query="SELECT t FROM Trazabilidadcopia t WHERE t.idorigen.idtrazabilidaddocumento = :idorigen AND t.tipo = :tipo"),@NamedQuery(name="Trazabilidadcopia.buscarPorNotificacion",query="SELECT t FROM Trazabilidadcopia t WHERE t.notificacion.idnotificacion = :idnotificacion"),@NamedQuery(name="Trazabilidadcopia.numeroCopias",query="SELECT COUNT(t.idtrazabilidadcopia) FROM Trazabilidadcopia t WHERE t.idorigen.idtrazabilidaddocumento = :idorigen AND t.tipo = :tipo"),@NamedQuery(name="Trazabilidadcopia.buscarPorDocumento",query="SELECT t FROM Trazabilidadcopia t WHERE t.documento.idDocumento = :iddocumento")})
public class Trazabilidadcopia implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TRAZABILIDADCOPIA_SEQ")
	@SequenceGenerator(name="TRAZABILIDADCOPIA_SEQ",sequenceName="TRAZABILIDADCOPIA_SEQ",initialValue=1,allocationSize=1)
	@Basic(optional=false)
	@Column(name="idtrazabilidadcopia")
	private Integer idtrazabilidadcopia;

	@JoinColumn(name="idorigen",referencedColumnName="idtrazabilidaddocumento")
	@ManyToOne(optional=false)
	private Trazabilidaddocumento idorigen;
	
	@JoinColumn(name="remitente",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario remitente;

	@JoinColumn(name="destinatario",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario destinatario;

	@JoinColumn(name="documento",referencedColumnName="iddocumento")
	@ManyToOne(optional=false)
	private Documento documento;

	@JoinColumn(name="accion",referencedColumnName="idaccion")
	@ManyToOne(optional=false)
	private Accion accion;

	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;

	@JoinColumn(name="idetapa",referencedColumnName="idetapa")
	@ManyToOne(optional=true)
	private Etapa etapa;
        
         @Column(name="usuariocreacion")
	private Integer usuariocreacion;

	@Basic(optional=false)
	@Column(name="tipo")
	private Character tipo;

	@JoinColumn(name="idnotificacion",referencedColumnName="idnotificacion")
	@OneToOne(optional=true)
	private Notificacion notificacion;

	@Column(name = "nombrepc")
	private String nombrePC;
        
       @Column(name="unidaddestinatario")
	private Integer unidaddestinatario;
       
        @Column(name="unidadremitente")
	private Integer unidadremitente;
        
        @Column(name="cargodestinatario")
	private Integer cargodestinatario;
        
        @Column(name="cargoremitente")
	private Integer cargoremitente;
        
	
	@Transient
	private boolean conCopias;

	/*
	 * @Transient
	 * 
	 * @JoinColumn(referencedColumnName = "idtrazabilidaddocumento") private
	 * Trazabilidaddocumento trazadoc;
	 */

	public Integer getIdtrazabilidadcopia(){
		return idtrazabilidadcopia;
	}

	public void setIdtrazabilidadcopia(Integer idtrazabilidadcopia){
		this.idtrazabilidadcopia=idtrazabilidadcopia;
	}

	public Trazabilidaddocumento getIdorigen(){
		return idorigen;
	}

	public void setIdorigen(Trazabilidaddocumento idorigen){
		this.idorigen=idorigen;
	}

	public Usuario getRemitente(){
		return remitente;
	}

	public void setRemitente(Usuario remitente){
		this.remitente=remitente;
	}

	public Usuario getDestinatario(){
		return destinatario;
	}

	public void setDestinatario(Usuario destinatario){
		this.destinatario=destinatario;
	}

	public Documento getDocumento(){
		return documento;
	}

	public void setDocumento(Documento documento){
		this.documento=documento;
	}

	public Accion getAccion(){
		return accion;
	}

	public void setAccion(Accion accion){
		this.accion=accion;
	}

	public Date getFechacreacion(){
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion){
		this.fechacreacion=fechacreacion;
	}

	public Character getTipo(){
		return tipo;
	}

	public void setTipo(Character tipo){
		this.tipo=tipo;
	}

	public Etapa getEtapa(){
		return etapa;
	}

	public void setEtapa(Etapa etapa){
		this.etapa=etapa;
	}

	public Notificacion getNotificacion(){
		return notificacion;
	}

	public void setNotificacion(Notificacion notificacion){
		this.notificacion=notificacion;
	}

	public boolean isConCopias(){
		return conCopias;
	}

	public void setConCopias(boolean conCopias){
		this.conCopias=conCopias;
	}

	public Trazabilidadcopia(Usuario destinatario){
		this.destinatario=destinatario;

	}

	public Trazabilidadcopia(){

	}

	public String getNombrePC() {
		return nombrePC;
	}

	public void setNombrePC(String nombrePC) {
		this.nombrePC = nombrePC;
	}
        
        public Integer getUsuariocreacion() {
           return usuariocreacion;
            }

         public void setUsuariocreacion(Integer usuariocreacion) {
             this.usuariocreacion = usuariocreacion;
         }
         
        public Integer getUnidaddestinatario() {
            return unidaddestinatario;
        }

        public void setUnidaddestinatario(Integer unidaddestinatario) {
            this.unidaddestinatario = unidaddestinatario;
        }

        public Integer getUnidadremitente() {
            return unidadremitente;
        }

        public void setUnidadremitente(Integer unidadremitente) {
            this.unidadremitente = unidadremitente;
        }

        public Integer getCargodestinatario() {
            return cargodestinatario;
        }

        public void setCargodestinatario(Integer cargodestinatario) {
            this.cargodestinatario = cargodestinatario;
        }

        public Integer getCargoremitente() {
            return cargoremitente;
        }

        public void setCargoremitente(Integer cargoremitente) {
            this.cargoremitente = cargoremitente;
        }

}
