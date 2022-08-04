package com.btg.ositran.siged.domain;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;  
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;

@Entity
@Table(name="documento")
@NamedQueries({@NamedQuery(name="Documento.findAll",query="SELECT d FROM Documento d"),
	@NamedQuery(name="Documento.findByIddocumento",query="SELECT d FROM Documento d WHERE d.idDocumento = :iddocumento"),
	@NamedQuery(name="Documento.findByID_CODIGO",query="SELECT d FROM Documento d WHERE d.ID_CODIGO = :ID_CODIGO"),
	@NamedQuery(name="Documento.findByFechacreacion",query="SELECT d FROM Documento d WHERE d.fechaCreacion = :fechacreacion"),
	@NamedQuery(name="Documento.consultafechafestiva",query="SELECT d FROM Documento d WHERE d.principal = 'S' AND d.plazo > 0 AND (d.fechaAccion<=:fechanolaborable AND d.fechaLimiteAtencion >=:fechanolaborable)"),
	@NamedQuery(name="Documento.consultaDocumentoReferencia",query="SELECT d FROM Documento d WHERE d.documentoreferencia = :iddocumento and d.estado not in ('I','N') "),
    @NamedQuery(name="Documento.consultaDocumentoReferenciaMover",query="SELECT d FROM Documento d WHERE d.documentoreferencia = :iddocumento "),
    @NamedQuery(name="Documento.consultaDocumentoMultipleAtendido",query="SELECT d FROM Documento d WHERE d.documentoreferencia = :iddocumento and d.estado not in ('I','N') and d.flagMultiple is null and flagatendido is null"),
    @NamedQuery(name="Documento.consultafechafija",query="SELECT d FROM Documento d WHERE d.principal = 'S' AND (d.plazo is null OR d.plazo = 0)  AND (d.fechaLimiteAtencion = :fechanolaborable OR ((d.fechaAccion<=:fechanolaborable AND d.fechaLimiteAtencion >=:fechanolaborable)))"),
	@NamedQuery(name="Documento.findDocumentoPrincipal",query="SELECT d FROM Documento d WHERE d.expediente.id = :idexpediente AND d.principal = 'S' AND d.documentoreferencia is NULL"),
	@NamedQuery(name="Documento.findByIdExpedienteDocumento",query="SELECT d FROM Documento d WHERE d.expediente.id = :idexpediente and d.estado not in ('I') AND d.documentoreferencia is NULL"),
	@NamedQuery(name="Documento.findByIdOrigen", query="SELECT d FROM Documento d WHERE d.origen = :idOrigen"),
    @NamedQuery(name="Documento.findByIdDocVirtual", query="SELECT d FROM Documento d WHERE d.nroVirtual = :nroVirtual and d.estado not in ('I','N')"),
    @NamedQuery(name="Documento.findByIdExpediente",query="SELECT d FROM Documento d WHERE d.expediente.id = :idexpediente"),
    @NamedQuery(name="Documento.findByIdNroTramite",query="SELECT d FROM Documento d WHERE d.ID_CODIGO = :nroTramite and d.documentoreferencia is NULL"),
	@NamedQuery(name="Documento.buscarDocumentoMasAntiguoPor",query="SELECT d FROM Documento d WHERE d.expediente.id = :idexpediente AND d.fechaCreacion <= (SELECT MIN(d1.fechaCreacion) FROM Documento d1 WHERE d1.expediente.id = :idexpediente  AND d1.documentoreferencia is NULL) AND d.documentoreferencia is NULL"),
	@NamedQuery(name="Documento.buscarLstPor1",query="SELECT d FROM Documento d WHERE d.expediente.id <> :idexpediente AND d.expediente.nroexpediente LIKE :nroexpediente AND d.numeroDocumento LIKE :nrodocumento AND d.numeroCaja LIKE :nrocaja"),
	@NamedQuery(name="Documento.buscarLstPor2",query="SELECT d FROM Documento d WHERE d.expediente.id <> :idexpediente AND d.expediente.nroexpediente LIKE :nroexpediente AND d.numeroDocumento LIKE :nrodocumento AND d.numeroCaja LIKE :nrocaja AND d.tipoDocumento.idtipodocumento = :idtipodocumento"),
	@NamedQuery(name="Documento.getDocumentosPorExpediente",query="SELECT d FROM Documento d WHERE d.estado not in ('I') and d.expediente.id=:idExpediente AND d.documentoreferencia is NULL ORDER BY d.origen DESC, d.fechaCreacion asc"),
    @NamedQuery(name="Documento.getDocumentosPorLegajo",query="SELECT d FROM Documento d, LegajoDocumento l WHERE d.estado not in ('I') and l.idLegajo=:idLegajo AND l.estado = 'A' AND d.documentoreferencia is NULL AND l.idDocumento = d.idDocumento order by l.fechaCreacion desc"),
	@NamedQuery(name="Documento.getDocumentosNoConfidencialesPorExpediente",query="SELECT d FROM Documento d WHERE d.expediente.id=:idExpediente AND d.confidencial != 'S' AND d.documentoreferencia is NULL ORDER BY d.fechaCreacion DESC"),
	@NamedQuery(name="Documento.getDocumentoMasReciente",query="SELECT d FROM Documento d WHERE d.estado='A' AND d.expediente.id = :idExpediente AND d.idDocumento <> :idDocumento AND d.fechaCreacion >= (SELECT MAX(d1.fechaCreacion) FROM Documento d1 WHERE d1.estado='A' AND d1.expediente.id = :idExpediente AND d1.idDocumento <> :idDocumento)")})
public class Documento implements Serializable {
    @Id
	@Basic(optional=false)
	@Column(name="iddocumento")
	private Integer idDocumento;
        
    @Basic(optional=false)
	private char principal;
        
    @Basic(optional=false)
    @Column(name="unidadpropietario")
	private Integer unidadpropietario;
        
	@Basic(optional=true)
	@Column(name="idConcesionario")
	private Integer idConcesionario;
	
	@Basic(optional=true)
	@Column(name="unidadenumera")
	private Integer unidadenumera;
	
	@Basic(optional=false)
	@Column(name="unidadautor")
	private Integer unidadautor;
	
	@Basic(optional=true)
	@Column(name="bandeja")
	private Integer bandeja;
	
	@Basic(optional=true)
	@Column(name="flaginicioflujo")
	private String flaginicioflujo;
	
	@Basic(optional=true)
	@Column(name="desCargoRemitente")
	private String desCargoRemitente;
	
	@Basic(optional=true)
	@Column(name="desUnidadRemitente")
	private String desUnidadRemitente;
	
	@Basic(optional=true)
	@Column(name="recepcionado")
	private String recepcionado;
	
	@Basic(optional=true)
	@Column(name="desRemitente")
	private String desRemitente; 
	
	@Basic(optional=true)
	@Column(name="proyecto")
	private Integer proyecto;
	
	@Basic(optional=true)
	@Column(name="origen")
	private Integer origen;
	
	@Basic(optional=true)
	@Column(name="flagatendido")
	private String flagatendido;
	
	@Basic(optional=false)
	@Column(name="cargopropietario")
	private Integer cargopropietario;
   
	@Basic(optional=true)
	@Column(name="documentoasociado")
	private Integer documentoasociado;

	@Basic(optional=true)
	@Column(name="ID_CLIENTE")
	private Integer ID_CLIENTE;
        
    @Column(name="usuariocreacion")
	private Integer usuariocreacion;
        
    @Column(name="usuariomodificacion")
	private Integer usuarioModificacion;

    @Basic(optional=true)
    @Column(name="flagMultiple")
    private String flagMultiple;

	@Basic(optional=true)
	@Column(name="ID_EXTERNO")
	private Integer ID_EXTERNO;
        
    @Basic(optional=true)
	@Column(name="ID_CODIGO")
	private String ID_CODIGO;

    @Column(name="delexpediente")
	private String delExpediente;

	@Column(name="nrodocumento")
	private String numeroDocumento;

    @Basic(optional=true)
	@Column(name="nrofolios")
	private int numeroFolios;
        
    @Basic(optional=true)
    @Column(name="nrofoliospide")
	private Integer numeroFoliosPIDE;

    @Basic(optional=true)
	@Column(name="nrofoliosoriginales")
	private Integer numeroFoliosOriginales;
     
    @Basic(optional=true)
	@Column(name="nrofolioscopias")
	private Integer numeroFoliosCopias;
        
    @Basic(optional=true)
	@Column(name="imagenesdigitalizadas")
	private Integer imagenesDigitalizadas;
        
    @Basic(optional=true)
    @Column (name="aniofiscal")
    private Integer anioFiscal;

	@Column(name="nrocaja")
	private String numeroCaja;

	@Column(name="nromesapartes")
	private String numeroMesaPartes;

	private String asunto;

	@Column(name="ultimoasunto")
	private String ultimoAsunto;

	@Lob
	private String contenido;

	@Lob
	private String observacion;

	@Column(name="fechadocumento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDocumento;
        
    @Column(name="fechareunion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaReunion;

    @Column(name="fechamodificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

    @Column(name="lugar")
	private String lugar;

    @Column(name="objetivo")
	private String objetivo;
        
    @Column(name="codinfraestructura")
	private Integer codInfraestructura;
        
    @Column(name="codmateria")
	private Integer codMateria;
        
    @Column(name="nroVirtual")
	private Integer nroVirtual;

	@Basic(optional=false)
	@Column(name="fechaaccion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAccion;
        
    @Basic(optional=true)
    @Column(name="flagsideco")
    private String flagsideco;

    @Column(name="plazo")
	private Integer plazo;
    
	@Column(name="fechalimiteatencion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLimiteAtencion;
        
	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	@Column(name="fechacreacionmonth")
	private Integer fechaCreacionMonth;

	@Column(name="fechacreacionyear")
	private Integer fechaCreacionYear;

	@Basic(optional=false)
	private char estado;

	@Column(name="estaenflujo")
	private Character estaEnFlujo;

	@Column(name="observacionrechazo")
	private String observacionRechazo;

	@Column(name="observaciondigitalizador")
	private String observacionDigitalizador;

	@Column(name="estadoalarma")
	private Character estadoAlarma;

	@Column(name="creaexpediente")
	private Character creaExpediente;

	@Column(name="estadoplazo")
	private Character estadoplazo;

	@Column(name="fechacargo")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCargo;

	@Column(name="firmado")
	private Character firmado;

	@Column(name="enumerado")
	private Character enumerado;

	@JoinColumn(name="accion",referencedColumnName="idaccion")
	@ManyToOne(optional=false)
	private Accion accion;

	@JoinColumn(name="expediente",referencedColumnName="idexpediente")
	@ManyToOne(cascade=CascadeType.REFRESH,optional=false)
	private Expediente expediente;

	@JoinColumn(name="tipodocumento",referencedColumnName="idtipodocumento")
	@ManyToOne
	private Tipodocumento tipoDocumento;
        
    @JoinColumn(name="ID_CLIENTE",referencedColumnName="idCliente", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private Cliente cliente;
        
    @JoinColumn(name="codTipoInstitucion",referencedColumnName="cod_tipoinstitucion", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private TipoInstitucion tipoInstitucion;

    @JoinColumn(name="codRemitente",referencedColumnName="idDetalleCliente", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private DetalleCliente detalleRemitente;
        
    @JoinColumn(name="codCargoRemitente",referencedColumnName="idCargoAdministrado", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private CargoAdministrado cargoRemitente;

	private transient String DOCUMENTO_ORIGEN;
    private transient String VER_DOCUMENTO;
    private transient String vcuo;

	@JoinColumn(name="propietario",referencedColumnName="idusuario")
	@ManyToOne(optional=true)
	private Usuario propietario;

	@JoinColumn(name="firmante",referencedColumnName="idusuario")
	@ManyToOne(optional=true)
	private Usuario firmante;

	@JoinColumn(name="enumerador",referencedColumnName="idusuario")
	@ManyToOne(optional=true)
	private Usuario enumerador;

	@OneToOne(cascade=CascadeType.ALL,mappedBy="documento")
	private DocumentoStor documentoStor;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="documento")
	private List<Archivo> archivos;

	private Character leido;

	private String remitente;

	@JoinColumn(name="autor",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario autor;
        
    @Column(name="codTipoInstitucion")
    private Integer codTipoInstitucion;

    @Column(name="codRemitente")
    private Integer codRemitente;

    @Column(name="codCargoRemitente")
    private Integer codCargoRemitente;
        
	@Column(name="documentoreferencia")
	private Integer documentoreferencia;

	@Basic(optional=false)
	private char despachado;

	@Column(name="fechalecturadocumento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLecturaDocumento;

	@Column(name="nombrepclecturadocumento")
	private String nombrePCLecturaDocumento;

	private Integer prioridad;
	
	private transient String flagPide; 

	private String referenciados;

	private Character confidencial;

	private transient String etapa;

	private transient String color;

	private transient String indAlerta;
	
    private transient String nombreTipoDocumento;

	private transient String nroexpediente;

	private transient String nombreProceso;

	private transient Integer idProceso;

	private transient String razonsocialConcesionario;

	private transient String clienteNombre;

	private transient String clienteRazonSocial;

	private transient boolean esTransient=false;

	private transient String clienteTipoIdentificacion;

	private transient String nombreRemitente;

	private transient boolean enumerarDocumento;

	private transient Character historico;

	private transient String tiponumeracion;

	private transient List<String> condestinatarios;

	private transient List<String> concopias;

	private transient List<Usuario> usuariosDestinatarios;

	private transient String porcentajealertaA;

	private transient String porcentajealertaR;

	private transient Integer idUsuarioLogeado;

	private transient String actividad;

	private transient String acciones;
        
    private transient String nroReferencias;

    public Documento(){
		this.estadoAlarma='V';
	}

	public Documento(Integer iddocumento){
		this.idDocumento=iddocumento;
		this.estadoAlarma='V';
	}

	public Documento(String etapa,Integer iddocumento,String nroMesaPartes,Character historico,Character leido,String asunto,Date fechacreacion,Date fechaaccion,Accion objAccion,Date fechalimiteatencion,String tipodocumento,String nroexpediente,Integer idproceso,String porcentajealertaA,String porcentajealertaR,String nombreProceso,String razonsocialConcesionario,String clienteNombre,String clienteRazonSocial,String clienteTipoIdentificacion,String nombreRemitente,char estado,String actividad){
		this.etapa=etapa;
		this.idDocumento=iddocumento;
		this.historico=historico;
		this.leido=leido;
		this.asunto=asunto;
		this.fechaCreacion=fechacreacion;
		this.fechaAccion=fechaaccion;
		this.accion=objAccion;
		this.fechaLimiteAtencion=fechalimiteatencion;
		this.nombreTipoDocumento=tipodocumento;
		this.nroexpediente=nroexpediente;
		this.idProceso=idproceso;
		this.porcentajealertaA=porcentajealertaA;
		this.porcentajealertaR=porcentajealertaR;
		this.nombreProceso=nombreProceso;
		this.razonsocialConcesionario=razonsocialConcesionario;
		this.clienteNombre=clienteNombre;
		this.clienteRazonSocial=clienteRazonSocial;
		this.clienteTipoIdentificacion=clienteTipoIdentificacion;
		this.nombreRemitente=nombreRemitente;
		this.esTransient=true;
		this.numeroMesaPartes=nroMesaPartes;
		this.estado=estado;
		this.actividad=actividad;
	}

	public Documento(Integer iddocumento,Character historico,Character leido,String asunto,Date fechacreacion,Date fechaaccion,Accion objAccion,Date fechalimiteatencion,String tipodocumento,String nroexpediente,String nombreProceso,String razonsocialConcesionario,String clienteNombre,String clienteRazonSocial,String clienteTipoIdentificacion,String nombreRemitente){
		this.idDocumento=iddocumento;
		this.historico=historico;
		this.leido=leido;
		this.asunto=asunto;
		this.fechaCreacion=fechacreacion;
		this.fechaAccion=fechaaccion;
		this.accion=objAccion;
		this.fechaLimiteAtencion=fechalimiteatencion;
		this.nombreTipoDocumento=tipodocumento;
		this.nroexpediente=nroexpediente;
		this.nombreProceso=nombreProceso;
		this.razonsocialConcesionario=razonsocialConcesionario;
		this.clienteNombre=clienteNombre;
		this.clienteRazonSocial=clienteRazonSocial;
		this.clienteTipoIdentificacion=clienteTipoIdentificacion;
		this.nombreRemitente=nombreRemitente;
		this.esTransient=true;
	}

	public Documento(Integer iddocumento,Tipodocumento tipodocumento,Date fechadocumento,String asunto,Usuario autor){
		this.idDocumento=iddocumento;
		this.tipoDocumento=tipodocumento;
		this.fechaDocumento=fechadocumento;
		this.asunto=asunto;
		this.autor=autor;
	}

	public Documento(Integer iddocumento,Tipodocumento tipodocumento,Date fechadocumento,Date fechaCreacion,String asunto,Usuario autor,Character firmado,Character enumerado){
		this.idDocumento=iddocumento;
		this.tipoDocumento=tipodocumento;
		this.fechaDocumento=fechadocumento;
		this.fechaCreacion=fechaCreacion;
		this.asunto=asunto;
		this.autor=autor;
		this.firmado=firmado;
		this.enumerado=enumerado;
	}

	public Documento(Integer iddocumento,Tipodocumento tipodocumento,Date fechadocumento,String asunto,Usuario autor,Expediente expediente){
		this.idDocumento=iddocumento;
		this.tipoDocumento=tipodocumento;
		this.fechaDocumento=fechadocumento;
		this.asunto=asunto;
		this.autor=autor;
		this.expediente=expediente;
	}

	public Documento(Integer idDocumento,Usuario propietario){
		this.idDocumento=idDocumento;
		this.propietario=propietario;
	}

	public Documento(Expediente expediente, Usuario propietario){
		this.expediente=expediente;
		this.propietario=propietario;
	}

	public Documento(Integer idDocumento,String numeroExpediente,char principal,int numeroFolios,String asunto,char estado,Tipodocumento tipoDocumento,String numeroDocumento){
		this.idDocumento=idDocumento;
		this.nroexpediente=numeroExpediente;
		this.principal=principal;
		this.numeroFolios=numeroFolios;
		this.asunto=asunto;
		this.estado=estado;
		this.tipoDocumento=tipoDocumento;
		this.numeroDocumento=numeroDocumento;
	}
	public String getFlagPide() {
		return flagPide;
	}

	public void setFlagPide(String flagPide) {
		this.flagPide = flagPide;
	}
	public Integer getIdDocumento(){
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento){
		this.idDocumento=idDocumento;
	}

	public char getPrincipal(){
		return principal;
	}

	public void setPrincipal(char principal){
		this.principal=principal;
	}

	public String getDelExpediente(){
		return delExpediente;
	}

	public void setDelExpediente(String delExpediente){
		this.delExpediente=delExpediente;
	}

	public String getNumeroDocumento(){
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento){
		this.numeroDocumento=numeroDocumento;
	}

	public int getNumeroFolios(){
		return numeroFolios;
	}

	public void setNumeroFolios(int numeroFolios){
		this.numeroFolios=numeroFolios;
	}

	public String getNumeroCaja(){
		return numeroCaja;
	}

	public void setNumeroCaja(String numeroCaja){
		this.numeroCaja=numeroCaja;
	}

	public String getNumeroMesaPartes(){
		return numeroMesaPartes;
	}

	public void setNumeroMesaPartes(String numeroMesaPartes){
		this.numeroMesaPartes=numeroMesaPartes;
	}
        
    public String getAsuntoHTML(){
		if (asunto != null){
          	return asunto.replace("\n", "").replace("\r", "").replace("\"", "");
		}
		
		return "";
	}

	public String getObservacionHTML(){
		if(observacion != null){
			return observacion.replace("\n", "").replace("\r", "").replace("\"", "");
		}
		return "";
	}

	public String getAsunto(){
		return asunto;
	}

	public void setAsunto(String asunto){
		this.asunto=asunto;
	}

	public String getUltimoAsunto(){
		return ultimoAsunto;
	}

	public void setUltimoAsunto(String ultimoAsunto){
		this.ultimoAsunto=ultimoAsunto;
	}

	public String getContenido(){
		return contenido;
	}

	public void setContenido(String contenido){
		this.contenido=contenido;
	}

	public String getObservacion(){
		return observacion != null ? observacion : "";
	}

	public void setObservacion(String observacion){
		this.observacion=observacion;
	}

	public Date getFechaDocumento(){
		return fechaDocumento;
	}

	public void setFechaDocumento(Date fechaDocumento){
		this.fechaDocumento=fechaDocumento;
	}

	public Date getFechaAccion(){
		return fechaAccion;
	}

	public void setFechaAccion(Date fechaAccion){
		this.fechaAccion=fechaAccion;
	}
        
    public Integer getAnioFiscal() {
        return anioFiscal;
    }
    
    public void setAnioFiscal(Integer anioFiscal){
        this.anioFiscal = anioFiscal;
    }

	public Integer getPlazo(){
		return plazo;
	}

	public void setPlazo(Integer plazo){
		this.plazo=plazo;
	}

	public Date getFechaLimiteAtencion(){
		return fechaLimiteAtencion;
	}

	public void setFechaLimiteAtencion(Date fechaLimiteAtencion){
		this.fechaLimiteAtencion=fechaLimiteAtencion;
	}

	public Date getFechaCreacion(){
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion){
		this.fechaCreacion=fechaCreacion;
	}

	public Integer getFechaCreacionMonth(){
		return fechaCreacionMonth;
	}

	public void setFechaCreacionMonth(Integer fechaCreacionMonth){
		this.fechaCreacionMonth=fechaCreacionMonth;
	}

	public Integer getFechaCreacionYear(){
		return fechaCreacionYear;
	}

	public void setFechaCreacionYear(Integer fechaCreacionYear){
		this.fechaCreacionYear=fechaCreacionYear;
	}

	public char getEstado(){
		return estado;
	}

	public void setEstado(char estado){
		this.estado=estado;
	}

	public Character getEstaEnFlujo(){
		return estaEnFlujo;
	}

	public void setEstaEnFlujo(Character estaEnFlujo){
		this.estaEnFlujo=estaEnFlujo;
	}

	public String getObservacionRechazo(){
		return observacionRechazo;
	}

	public void setObservacionRechazo(String observacionRechazo){
		this.observacionRechazo=observacionRechazo;
	}

	public Character getEstadoAlarma(){
		return estadoAlarma;
	}

	public void setEstadoAlarma(Character estadoAlarma){
		this.estadoAlarma=estadoAlarma;
	}

        /*
	public Proceso getProceso(){
		return proceso;
	}

	public void setProceso(Proceso proceso){
		this.proceso=proceso;
	}*/

	public Accion getAccion(){
		return accion;
	}

	public void setAccion(Accion accion){
		this.accion=accion;
	}

	public Expediente getExpediente(){
		return expediente;
	}

	public void setExpediente(Expediente expediente){
		this.expediente=expediente;
	}

	public Tipodocumento getTipoDocumento(){
		return tipoDocumento;
	}

	public void setTipoDocumento(Tipodocumento tipoDocumento){
		this.tipoDocumento=tipoDocumento;
	}

	public Usuario getPropietario(){
		return propietario;
	}

	public void setPropietario(Usuario propietario){
		this.propietario=propietario;
	}

	public DocumentoStor getDocumentoStor(){
		return documentoStor;
	}

	public void setDocumentoStor(DocumentoStor documentoStor){
		this.documentoStor=documentoStor;
	}

	public List<Archivo> getArchivos(){
		return archivos;
	}

	public void setArchivos(List<Archivo> archivos){
		this.archivos=archivos;
	}

	public Character getLeido(){
		return leido;
	}

	public void setLeido(Character leido){
		this.leido=leido;
	}

	public String getRemitente(){
		return remitente;
	}

	public void setRemitente(String remitente){
		this.remitente=remitente;
	}

	public void setEstado(Character estado){
		if(estado != null){
			this.estado=estado;
		}
	}
        
	public String getNombreTipoDocumento(){
		return nombreTipoDocumento;
	}
	
   
	public void setNombreTipoDocumento(String nombreTipoDocumento){
		this.nombreTipoDocumento=nombreTipoDocumento;
	}


	public String getNroexpediente(){
		return nroexpediente;
	}

	public void setNroexpediente(String nroexpediente){
		this.nroexpediente=nroexpediente;
	}

	public String getNombreProceso(){
		return nombreProceso;
	}

	public void setNombreProceso(String nombreProceso){
		this.nombreProceso=nombreProceso;
	}

	public String getRazonSocialConcesionario(){
		return razonsocialConcesionario;
	}

	public void setRazonSocialConcesionario(String razonsocialConcesionario){
		this.razonsocialConcesionario=razonsocialConcesionario;
	}

	public String getClienteNombre(){
		return clienteNombre;
	}

	public void setClienteNombre(String clienteNombre){
		this.clienteNombre=clienteNombre;
	}

	public String getClienteRazonSocial(){
		return clienteRazonSocial;
	}

	public void setClienteRazonSocial(String clienteRazonSocial){
		this.clienteRazonSocial=clienteRazonSocial;
	}

	public boolean isEsTransient(){
		return esTransient;
	}

	public void setEsTransient(boolean esTransient){
		this.esTransient=esTransient;
	}

	public String getClienteTipoIdentificacion(){
		return clienteTipoIdentificacion;
	}

	public void setClienteTipoIdentificacion(String clienteTipoIdentificacion){
		this.clienteTipoIdentificacion=clienteTipoIdentificacion;
	}

	public String getNombreRemitente(){
		return nombreRemitente;
	}

	public void setNombreRemitente(String nombreRemitente){
		this.nombreRemitente=nombreRemitente;
	}

        public Usuario getFirmante(){
		return firmante;
	}

	public void setFirmante(Usuario firmante){
		this.firmante=firmante;
	}

	public Usuario getAutor(){
		return autor;
	}

	public void setAutor(Usuario autor){
		this.autor=autor;
	}

	public boolean getEnumerarDocumento(){
		return enumerarDocumento;
	}

	public void setEnumerarDocumento(boolean enumerarDocumento){
		this.enumerarDocumento=enumerarDocumento;
	}

	public boolean esDocumentoPrincipal(){
		return principal == 'S';
	}

	public Character getHistorico(){
		return historico;
	}

	public void setHistorico(Character historico){
		this.historico=historico;
	}

	public Character getCreaExpediente(){
		return creaExpediente;
	}

	public Date getFechaCargo(){
		return fechaCargo;
	}

	public void setFechaCargo(Date fechaCargo){
		this.fechaCargo=fechaCargo;
	}

	public Character getEstadoplazo(){
		return estadoplazo;
	}

	public void setEstadoplazo(Character estadoplazo){
		this.estadoplazo=estadoplazo;
	}

	public void setCreaExpediente(Character creaExpediente){
		this.creaExpediente=creaExpediente;
	}

	public boolean isCreadorExpediente(){
		return creaExpediente == 'S';
	}

	public String getTiponumeracion(){
		return tiponumeracion;
	}

	public void setTiponumeracion(String tiponumeracion){
		this.tiponumeracion=tiponumeracion;
	}

	public List<String> getCondestinatarios(){
		return condestinatarios;
	}

	public void setCondestinatarios(List<String> condestinatarios){
		this.condestinatarios=condestinatarios;
	}

	public List<String> getConcopias(){
		return concopias;
	}

	public void setConcopias(List<String> concopias){
		this.concopias=concopias;
	}	

	public String getEtapa(){
		return etapa;
	}

	public void setEtapa(String etapa){
		this.etapa=etapa;
	}

	public Integer getIdProceso(){
		return idProceso;
	}

	public void setIdProceso(Integer idProceso){
		this.idProceso=idProceso;
	}

	public String getPorcentajealertaA(){
		return porcentajealertaA;
	}

	public void setPorcentajealertaA(String porcentajealertaA){
		this.porcentajealertaA=porcentajealertaA;
	}

	public String getPorcentajealertaR(){
		return porcentajealertaR;
	}

	public void setPorcentajealertaR(String porcentajealertaR){
		this.porcentajealertaR=porcentajealertaR;
	}

	public List<Usuario> getUsuariosDestinatarios(){
		return usuariosDestinatarios;
	}

	public void setUsuariosDestinatarios(List<Usuario> usuariosDestinatarios){
		this.usuariosDestinatarios=usuariosDestinatarios;
	}

	public Integer getIdUsuarioLogeado(){
		return idUsuarioLogeado;
	}

	public void setIdUsuarioLogeado(Integer idUsuarioLogeado){
		this.idUsuarioLogeado=idUsuarioLogeado;
	}

	public String getActividad(){
		return actividad;
	}

	public void setActividad(String actividad){
		this.actividad=actividad;
	}

	public String getObservacionDigitalizador(){
		return observacionDigitalizador;
	}

	public void setObservacionDigitalizador(String observacionDigitalizador){
		this.observacionDigitalizador=observacionDigitalizador;
	}

	public Character getFirmado(){
		return firmado;
	}

	public void setFirmado(Character firmado){
		this.firmado=firmado;
	}

	public Character getEnumerado(){
		return enumerado;
	}

	public void setEnumerado(Character enumerado){
		this.enumerado=enumerado;
	}

	public Usuario getEnumerador(){
		return enumerador;
	}

	public void setEnumerador(Usuario enumerador){
		this.enumerador=enumerador;
	}

	public Integer getDocumentoreferencia() {
		return documentoreferencia;
	}

	public void setDocumentoreferencia(Integer documentoreferencia) {
		this.documentoreferencia = documentoreferencia;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public String getReferenciados() {
		return referenciados;
	}

	public void setReferenciados(String referenciados) {
		this.referenciados = referenciados;
	}

	public Character getConfidencial() {
		return confidencial;
	}

	public void setConfidencial(Character confidencial) {
		this.confidencial = confidencial;
	}

	public char getDespachado() {
		return despachado;
	}

	public void setDespachado(char despachado) {
		this.despachado = despachado;
	}

	public Date getFechaLecturaDocumento() {
		return fechaLecturaDocumento;
	}

	public void setFechaLecturaDocumento(Date fechaLecturaDocumento) {
		this.fechaLecturaDocumento = fechaLecturaDocumento;
	}

	public String getNombrePCLecturaDocumento() {
		return nombrePCLecturaDocumento;
	}

	public void setNombrePCLecturaDocumento(String nombrePCLecturaDocumento) {
		this.nombrePCLecturaDocumento = nombrePCLecturaDocumento;
	}

	public String getIndAlerta() {
		return indAlerta;
	}

	public void setIndAlerta(String indAlerta) {
		this.indAlerta = indAlerta;
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
    
     public String getFlagMultiple() {
       return flagMultiple;
    }

    public void setFlagMultiple(String flagMultiple) {
        this.flagMultiple = flagMultiple;
    }
    
    public Date getFechaReunion() {
        return fechaReunion;
    }

    public void setFechaReunion(Date fechaReunion) {
        this.fechaReunion = fechaReunion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Integer getCodInfraestructura() {
        return codInfraestructura;
    }

    public void setCodInfraestructura(Integer codInfraestructura) {
        this.codInfraestructura = codInfraestructura;
    }

    public Integer getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(Integer codMateria) {
        this.codMateria = codMateria;
    }
    
     public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    
     public Integer getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(Integer usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }
    
    public Integer getProyecto() {
        return proyecto;
    }

    public void setProyecto(Integer proyecto) {
        this.proyecto = proyecto;
    }
    
    public String getDesCargoRemitente() {
        return desCargoRemitente;
    }

    public void setDesCargoRemitente(String desCargoRemitente) {
        this.desCargoRemitente = desCargoRemitente;
    }

    public String getDesRemitente() {
        return desRemitente;
    }

    public void setDesRemitente(String desRemitente) {
        this.desRemitente = desRemitente;
    }
    
     public String getRecepcionado() {
        return recepcionado;
    }

    public void setRecepcionado(String recepcionado) {
        this.recepcionado = recepcionado;
    }
    
    public String getDesUnidadRemitente() {
        return desUnidadRemitente;
    }

    public void setDesUnidadRemitente(String desUnidadRemitente) {
        this.desUnidadRemitente = desUnidadRemitente;
    }
    
    public Integer getUnidadenumera() {
        return unidadenumera;
    }

    public void setUnidadenumera(Integer unidadenumera) {
        this.unidadenumera = unidadenumera;
    }     
    
     public Integer getNumeroFoliosOriginales() {
        return numeroFoliosOriginales;
    }

    public void setNumeroFoliosOriginales(Integer numeroFoliosOriginales) {
        this.numeroFoliosOriginales = numeroFoliosOriginales;
    }

    public Integer getNumeroFoliosCopias() {
        return numeroFoliosCopias;
    }

    public void setNumeroFoliosCopias(Integer numeroFoliosCopias) {
        this.numeroFoliosCopias = numeroFoliosCopias;
    }

    public Integer getImagenesDigitalizadas() {
        return imagenesDigitalizadas;
    }

    public void setImagenesDigitalizadas(Integer imagenesDigitalizadas) {
        this.imagenesDigitalizadas = imagenesDigitalizadas;
    }
    
    public Integer getNroVirtual() {
        return nroVirtual;
    }

    public void setNroVirtual(Integer nroVirtual) {
        this.nroVirtual = nroVirtual;
    }
    
    public String getVcuo() {
        return vcuo;
    }

    public void setVcuo(String vcuo) {
        this.vcuo = vcuo;
    }

    public String getVER_DOCUMENTO() {
        return VER_DOCUMENTO;
    }

    public void setVER_DOCUMENTO(String VER_DOCUMENTO) {
        this.VER_DOCUMENTO = VER_DOCUMENTO;
    }
    
    public Integer getIdConcesionario() {
        return idConcesionario;
    }

    public void setIdConcesionario(Integer idConcesionario) {
        this.idConcesionario = idConcesionario;
    }

    public Integer getBandeja() {
        return bandeja;
    }

    public void setBandeja(Integer bandeja) {
        this.bandeja = bandeja;
    }
    
    public String getFlagatendido() {
        return flagatendido;
    }

    public void setFlagatendido(String flagatendido) {
        this.flagatendido = flagatendido;
    }

    public String getFlaginicioflujo() {
        return flaginicioflujo;
    }

    public void setFlaginicioflujo(String flaginicioflujo) {
        this.flaginicioflujo = flaginicioflujo;
    }

    public Integer getUnidadautor() {
        return unidadautor;
    }

    public void setUnidadautor(Integer unidadautor) {
        this.unidadautor = unidadautor;
    }
    
    public String getFlagsideco() {
        return flagsideco;
    }

    public void setFlagsideco(String flagsideco) {
        this.flagsideco = flagsideco;
    }
       
	public String getDOCUMENTO_ORIGEN() {
		return DOCUMENTO_ORIGEN;
	}

	public void setDOCUMENTO_ORIGEN(String dOCUMENTO_ORIGEN) {
		DOCUMENTO_ORIGEN = dOCUMENTO_ORIGEN;
	}

	public Integer getID_EXTERNO() {
	    return ID_EXTERNO;
	}

	public void setID_EXTERNO(Integer iD_EXTERNO) {
	    ID_EXTERNO = iD_EXTERNO;
	}

	
	public String getID_CODIGO() {
	    return ID_CODIGO;
	}
        
    public Integer getOrigen() {
       return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

	public void setID_CODIGO(String iD_CODIGO) {
	    ID_CODIGO = iD_CODIGO;
	}

	public Integer getID_CLIENTE() {
		return ID_CLIENTE;
	}

	public void setID_CLIENTE(Integer iD_CLIENTE) {
		ID_CLIENTE = iD_CLIENTE;
	}
    
    public Integer getDocumentoasociado() {
		return documentoasociado;
	}

	public void setDocumentoasociado(Integer documentoasociado) {
		this.documentoasociado = documentoasociado;
	}
	
    public CargoAdministrado getCargoRemitente() {
        return cargoRemitente;
    }

    public void setCargoRemitente(CargoAdministrado cargoRemitente) {
        this.cargoRemitente = cargoRemitente;
    }

    public DetalleCliente getDetalleRemitente() {
        return detalleRemitente;
    }

    public void setDetalleRemitente(DetalleCliente detalleRemitente) {
        this.detalleRemitente = detalleRemitente;
    }
    
    public TipoInstitucion getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(TipoInstitucion tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Integer getCodTipoInstitucion() {
        return codTipoInstitucion;
    }

    public void setCodTipoInstitucion(Integer codTipoInstitucion) {
        this.codTipoInstitucion = codTipoInstitucion;
    }

    public Integer getCodRemitente() {
        return codRemitente;
    }

    public void setCodRemitente(Integer codRemitente) {
        this.codRemitente = codRemitente;
    }

    public Integer getCodCargoRemitente() {
        return codCargoRemitente;
    }

    public void setCodCargoRemitente(Integer codCargoRemitente) {
        this.codCargoRemitente = codCargoRemitente;
    }
    
    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNroReferencias() {
        return nroReferencias;
    }

    public void setNroReferencias(String nroReferencias) {
        this.nroReferencias = nroReferencias;
    }

	public String getAcciones() {
		return acciones;
	}
        
    public void setAcciones(String acciones) {
		this.acciones = acciones;
	}
    
    public Integer getNumeroFoliosPIDE() {
        return numeroFoliosPIDE;
    }

    public void setNumeroFoliosPIDE(Integer numeroFoliosPIDE) {
        this.numeroFoliosPIDE = numeroFoliosPIDE;
    }
    
    @Override
	public int hashCode(){
		int hash=0;
		hash+=(idDocumento != null ? idDocumento.hashCode() : 0);
		return hash;
	}
        
        @Override
	public boolean equals(Object object){
		if(!(object instanceof Documento)){
			return false;
		}
		Documento other=(Documento) object;
		if((this.idDocumento == null && other.idDocumento != null) || (this.idDocumento != null && !this.idDocumento.equals(other.idDocumento))){
			return false;
		}
		return true;
	}

    @Override
	public String toString() {
		return "Documento [idDocumento=" + idDocumento + ", numeroDocumento=" + numeroDocumento
			+ ", documentoreferencia=" + documentoreferencia + "]";
	}
}