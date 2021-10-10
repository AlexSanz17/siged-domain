package com.btg.ositran.siged.domain;

import java.util.Date;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TRAZABILIDADAPOYO")
@NamedQueries({@NamedQuery(name="Trazabilidadapoyo.findByIdtrazabilidadapoyo",query="SELECT t FROM Trazabilidadapoyo t WHERE t.idtrazabilidadapoyo = :idtrazabilidadapoyo ORDER by t.fechacreacion")
})
public class Trazabilidadapoyo {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TRAZABILIDADAPOYO_SEQ")
	@SequenceGenerator(name="TRAZABILIDADAPOYO_SEQ",sequenceName="TRAZABILIDADAPOYO_SEQ",initialValue=1,allocationSize=1)
	@Basic(optional=false)
	@Column(name="idtrazabilidadapoyo")
	private Integer idtrazabilidadapoyo;

	@JoinColumn(name="idorigen",referencedColumnName="idtrazabilidaddocumento")
	@ManyToOne(optional=false)
	private Trazabilidaddocumento trazabilidad;

	@JoinColumn(name="remitente",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario remitente;

	@Column(name = "documento")
	private Integer documento;

	@JoinColumn(name="destinatario",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario destinatario;

	@JoinColumn(name="accion",referencedColumnName="idaccion")
	@ManyToOne(optional=false)
	private Accion accion;

	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;


	@Column(name="fechalimiteatencion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechalimiteatencion;

	@Column(name = "texto")
	private String texto;
        
        @Column(name="usuariocreacion")
	private Integer usuariocreacion;

	@Column(name = "asunto")
	private String asunto;

	@Column(name="indalerta")
	private String indalerta;
        
        @Column(name="prioridad")
        private Integer prioridad;

        @Column(name="plazo")
	private Integer plazo;

        @Column(name="unidaddestinatario")
	private Integer unidaddestinatario;

    
        @Column(name="unidadremitente")
	private Integer unidadremitente;
        
        @Column(name="cargodestinatario")
	private Integer cargodestinatario;
        
        @Column(name="cargoremitente")
	private Integer cargoremitente;
        
        @Basic(optional=true)
	@Column(name="idproveido")
	private Integer idproveido;

        public Integer getIdproveido() {
            return idproveido;
        }

        public void setIdproveido(Integer idproveido) {
            this.idproveido = idproveido;
        }

	@JoinColumn(name="estado",referencedColumnName="idestado")
	@ManyToOne(optional=false)
	private Estado estado;

	/*@ManyToMany
	@JoinTable(name="trazabilidadapoyoxproveido",joinColumns={@JoinColumn(name="idtrazabilidad",referencedColumnName="idtrazabilidadapoyo")},inverseJoinColumns={@JoinColumn(name="idproveido",referencedColumnName="idproveido")})
	private List<Proveido> proveidos;
        */
        
        @JoinColumn(name="idproveido",referencedColumnName="idproveido",insertable=false,updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private Proveido proveido;

        public Proveido getProveido() {
            return proveido;
        }

        public void setProveido(Proveido proveido) {
            this.proveido = proveido;
        }
        
        
	@Column(name = "nombrepc")
	private String nombrePC;

	public Trazabilidadapoyo() {
	}

	public Integer getIdtrazabilidadapoyo() {
		return idtrazabilidadapoyo;
	}

	public void setIdtrazabilidadapoyo(Integer idtrazabilidadapoyo) {
		this.idtrazabilidadapoyo = idtrazabilidadapoyo;
	}

	public Trazabilidaddocumento getTrazabilidad() {
		return trazabilidad;
	}

	public void setTrazabilidad(Trazabilidaddocumento trzabilidad) {
		this.trazabilidad = trzabilidad;
	}

	public Usuario getRemitente() {
		return remitente;
	}

	public void setRemitente(Usuario remitente) {
		this.remitente = remitente;
	}

	public Usuario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}

	public Accion getAccion() {
		return accion;
	}

	public void setAccion(Accion accion) {
		this.accion = accion;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNombrePC() {
		return nombrePC;
	}

	public void setNombrePC(String nombrePC) {
		this.nombrePC = nombrePC;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Date getFechalimiteatencion() {
		return fechalimiteatencion;
	}

	public void setFechalimiteatencion(Date fechalimiteatencion) {
		this.fechalimiteatencion = fechalimiteatencion;
	}

	public String getIndalerta() {
		return indalerta;
	}

	public void setIndalerta(String indalerta) {
		this.indalerta = indalerta;
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
        
         public Integer getPrioridad() {
            return prioridad;
        }

        public void setPrioridad(Integer prioridad) {
            this.prioridad = prioridad;
        }
        
          public Integer getPlazo() {
            return plazo;
        }

        public void setPlazo(Integer plazo) {
            this.plazo = plazo;
        }
}
