package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vistabandeja")
public class FilaBandejaUF {

	@Id
	private Integer id;
    
	@Column(name = "nroTramite")
    private Integer nroTramite;

    @Column(name = "origen")
    private Integer origen;
    
	private String tipoalerta;

	private String asunto;

	private Character chrestado;
        
    private String firmado;
    
    private String virtual;
    
    @Column(name = "llave")
    private String llave;

	@Column(name = "asuntoexpediente")
	private String asuntoExpediente;

	@Column(name="fechaaccion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaaccion;
        
        @Column(name="fechacreaciontraza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreaciontraza;
        
        @Column(name="fechalimitetraza")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechalimitetraza;
        
        @Column(name = "prioridadtraza")
	private String prioridadtraza;
        
        @Column(name = "pendiente")
	private String pendiente;

        @Column(name = "despacho")
	private String despacho;

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    
    public String getPendiente() {
        return pendiente;
    }

    public void setPendiente(String pendiente) {
        this.pendiente = pendiente;
    }
    
    public Date getFechacreaciontraza() {
        return fechacreaciontraza;
    }

    public void setFechacreaciontraza(Date fechacreaciontraza) {
        this.fechacreaciontraza = fechacreaciontraza;
    }

    public Date getFechalimitetraza() {
        return fechalimitetraza;
    }

    public void setFechalimitetraza(Date fechalimitetraza) {
        this.fechalimitetraza = fechalimitetraza;
    }

    public String getPrioridadtraza() {
        return prioridadtraza;
    }

    public void setPrioridadtraza(String prioridadtraza) {
        this.prioridadtraza = prioridadtraza;
    }
        
	private String documento;

	private String concesionario;

	private String urlarchivo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechalimite;

	private String estado;

	private String etapa;

	private String expediente;

	private String cliente;
        
        private Integer idcliente;

	private String actividad;

	private String numeromesapartes;

	@Column(name = "porcentaje_a")
	private String porcentajeA;

	@Column(name = "porcentaje_r")
	private String porcentajeR;
        
        @Column(name = "externo")
	private String externo;
     
        @Column(name = "cargopropietario")
	private Integer cargopropietario;

	private String leido;

	private Integer archivos;

	@JoinColumn(name="idaccion", referencedColumnName="idAccion")
	@ManyToOne
	private Accion accion;

	@Column(name = "numerotrazabilidad")
	private Integer numeroTrazabilidad;

	@Basic(optional=false)
	private char despachado;
        
	@Column(name = "tipodocumento")
	private Integer idtipodocumento;
        
	@JoinColumn(name="idproceso", referencedColumnName="idproceso")
	@ManyToOne
	private Proceso proceso; 

	@JoinColumn(name="propietario", referencedColumnName="idusuario")
	@ManyToOne
	private Usuario propietario;

	private String documentoreferencia;

	@JoinColumn(name="idremitente", referencedColumnName="idusuario")
	@ManyToOne
	private Usuario remitente;

	@JoinColumn(name="idautor", referencedColumnName="idusuario")
	@ManyToOne
	private Usuario autor;

	@Column(name = "prioridad")
	private String prioridad;
        
        @Column(name = "unidadpropietario")
	private Integer unidadpropietario;
        
        @Column(name = "desunidadremitente")
	private String desunidadremitente;
        
        @Column(name = "desunidadautor")
	private String desunidadautor;
    
        @Column(name = "iniciales")
	private String iniciales;
        
        @Column(name = "unidadremitente")
	private Integer unidadremitente;
        
        @Column(name = "unidadautor")
	private Integer unidadautor;
        
    @Column(name = "flagmultiple")
    private String flagmultiple;
    
    @Column(name = "flagatendido")
    private String flagatendido;
    
    @Column(name = "estadorecepcionvirtual")
    private String estadorecepcionvirtual;

    public String getEstadorecepcionvirtual() {
        return estadorecepcionvirtual;
    }

    public void setEstadorecepcionvirtual(String estadorecepcionvirtual) {
        this.estadorecepcionvirtual = estadorecepcionvirtual;
    }
    
    public String getExterno() {
        return externo;
    }

    public void setExterno(String externo) {
        this.externo = externo;
    }
    
    public String getVirtual() {
        return virtual;
    }

    public void setVirtual(String virtual) {
        this.virtual = virtual;
    }

    public String getFlagatendido() {
        return flagatendido;
    }

    public void setFlagatendido(String flagatendido) {
        this.flagatendido = flagatendido;
    }

    public String getFlagmultiple() {
        return flagmultiple;
    }

    public void setFlagmultiple(String flagmultiple) {
        this.flagmultiple = flagmultiple;
    }

    public Integer getUnidadremitente() {
        return unidadremitente;
    }

    public void setUnidadremitente(Integer unidadremitente) {
        this.unidadremitente = unidadremitente;
    }
        
       

	public FilaBandejaUF() {
	}

	public FilaBandejaUF(Integer id) {
		this.id = id;
	}

	public FilaBandejaUF(Integer id, Date fechaaccion, String expediente) {
		this.id = id;
		this.fechaaccion = fechaaccion;
		this.expediente = expediente;
	}
        
        public Integer getOrigen() {
            return origen;
        }

        public void setOrigen(Integer origen) {
            this.origen = origen;
        }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoalerta() {
		return tipoalerta;
	}

	public void setTipoalerta(String tipoalerta) {
		this.tipoalerta = tipoalerta;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Date getFechaaccion() {
		return fechaaccion;
	}

	public void setFechaaccion(Date fechaaccion) {
		this.fechaaccion = fechaaccion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(String concesionario) {
		this.concesionario = concesionario;
	}

	public String getUrlarchivo() {
		return urlarchivo;
	}

	public void setUrlarchivo(String urlarchivo) {
		this.urlarchivo = urlarchivo;
	}

	public Date getFechalimite() {
		return fechalimite;
	}

	public void setFechalimite(Date fechalimite) {
		this.fechalimite = fechalimite;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getNumeromesapartes() {
		return numeromesapartes;
	}

	public void setNumeromesapartes(String numeromesapartes) {
		this.numeromesapartes = numeromesapartes;
	}

	public String getPorcentajeA() {
		return porcentajeA;
	}

	public void setPorcentajeA(String porcentajeA) {
		this.porcentajeA = porcentajeA;
	}

	public String getPorcentajeR() {
		return porcentajeR;
	}

	public void setPorcentajeR(String porcentajeR) {
		this.porcentajeR = porcentajeR;
	}

        
	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	public String getDocumentoreferencia() {
		return documentoreferencia;
	}

	public void setDocumentoreferencia(String documentoreferencia) {
		this.documentoreferencia = documentoreferencia;
	}

	public Usuario getRemitente() {
		return remitente;
	}

	public void setRemitente(Usuario remitente) {
		this.remitente = remitente;
	}

	public String getAsuntoExpediente() {
		return asuntoExpediente;
	}

	public void setAsuntoExpediente(String asuntoExpediente) {
		this.asuntoExpediente = asuntoExpediente;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public String getLeido() {
		return leido;
	}

	public void setLeido(String leido) {
		this.leido = leido;
	}

	public Integer getArchivos() {
		return archivos;
	}

	public void setArchivos(Integer archivos) {
		this.archivos = archivos;
	}

	public Accion getAccion() {
		return accion;
	}

	public void setAccion(Accion accion) {
		this.accion = accion;
	}

	public Integer getNumeroTrazabilidad() {
		return numeroTrazabilidad;
	}

	public void setNumeroTrazabilidad(Integer numeroTrazabilidad) {
		this.numeroTrazabilidad = numeroTrazabilidad;
	}

	public Character getChrestado() {
		return chrestado;
	}

	public void setChrestado(Character chrestado) {
		this.chrestado = chrestado;
	}


	public char getDespachado() {
		return despachado;
	}


	public void setDespachado(char despachado) {
		this.despachado = despachado;
	}


	public Integer getIdtipodocumento() {
		return idtipodocumento;
	}


	public void setIdtipodocumento(Integer idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
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
  
    public Integer getIdcliente() {
       return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
       this.idcliente = idcliente;
    }
    
     public Integer getNroTramite() {
        return nroTramite;
    }

    public void setNroTramite(Integer nroTramite) {
        this.nroTramite = nroTramite;
    }
    
    public String getFirmado() {
       return firmado;
   }

   public void setFirmado(String firmado) {
       this.firmado = firmado;
   }
   
    public Integer getUnidadautor() {
        return unidadautor;
    }

    public void setUnidadautor(Integer unidadautor) {
        this.unidadautor = unidadautor;
    }
    
    public String getDesunidadremitente() {
        return desunidadremitente;
    }

    public void setDesunidadremitente(String desunidadremitente) {
        this.desunidadremitente = desunidadremitente;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }
    
    public String getDesunidadautor() {
        return desunidadautor;
    }

    public void setDesunidadautor(String desunidadautor) {
        this.desunidadautor = desunidadautor;
    }
    
     public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }
}