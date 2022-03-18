package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="archivo")
@NamedQueries({@NamedQuery(name="Archivo.findByExpediente",query="SELECT a FROM Archivo a JOIN FETCH a.documento d JOIN FETCH d.expediente e WHERE e.id = :idexpediente AND a.estadoDigitalizacion <> 'I'"),
	@NamedQuery(name="Archivo.findByEstadodigitalizacion",query="SELECT a FROM Archivo a WHERE a.estadoDigitalizacion = :estadoDigitalizacion"),
	@NamedQuery(name="Archivo.findByIdDocumento",         query="SELECT a FROM Archivo a WHERE a.documento.idDocumento = :iddoc AND estadoDigitalizacion <> 'I' AND a.estado = :estado order by a.principal desc "),@NamedQuery(name="Archivo.findByArchivoPrincipalIdDocumento",query="SELECT a FROM Archivo a WHERE a.documento.idDocumento = :iddoc AND estadoDigitalizacion <> 'I' AND a.estado = :estado AND a.principal = :principal"),@NamedQuery(name="Archivo.findByCriteria",query="SELECT a FROM Archivo a join fetch a.documento WHERE a.documento.idDocumento = :iddoc AND a.nombre = :nombre"),@NamedQuery(name="Archivo.findByCriteria2",query="SELECT a FROM Archivo a WHERE a.documento.idDocumento = :iddoc AND a.nombre like :nombre"),@NamedQuery(name="Archivo.checkEstadoDigitalizacion",query="SELECT a FROM Archivo a WHERE a.documento.idDocumento = :iddoc AND (estadoDigitalizacion = 'Y' OR estadoDigitalizacion = 'A')"),
	@NamedQuery(name="Archivo.findByIdDocumentoOrderDesc",query="SELECT a FROM Archivo a WHERE a.documento.expediente.id = :idexpediente AND a.documento.idDocumento >= :iddocumento AND a.documento.estaEnFlujo = 'S' AND estadoDigitalizacion <> 'I' ORDER BY a.fechaCreacion DESC"),@NamedQuery(name="Archivo.findByIdDocumentoOrderDescQAS",query="SELECT a FROM Archivo a WHERE a.documento.expediente.id = :idexpediente AND a.documento.idDocumento = :iddocumento AND estadoDigitalizacion <> 'I' ORDER BY a.fechaCreacion DESC"),@NamedQuery(name="Archivo.updateEstado",query="UPDATE Archivo a SET a.estadoDigitalizacion = :estado WHERE a.idArchivo = :idarchivo"),
        @NamedQuery(name="Archivo.buscarArchivosObjectId",query="SELECT a FROM Archivo a where objectId = :objectId and a.estado = 'A' and exists (select 1 from Documento d where d.idDocumento = a.documento.idDocumento and d.ID_CODIGO = :nroTramite)"),
        @NamedQuery(name="Archivo.buscarArchivoExterno",query="SELECT a FROM Archivo a where a.objectId = :objectId and a.estado = 'A' and a.clave = :clave  and exists (select 1 from Documento d where d.idDocumento = a.documento.idDocumento and d.ID_CODIGO = :nroTramite)"),
        @NamedQuery(name="Archivo.buscarArchivosPorRuta",query="SELECT count(a.idArchivo) FROM Archivo a WHERE LOWER(a.rutaAlfresco) =:ruta and a.estado = :estado and a.autor.idusuario not in (:autor)"),
        @NamedQuery(name="Archivo.buscarArchivosPorRutaDocumento",query="SELECT a FROM Archivo a WHERE  a.documento.idDocumento = :idDocumento and a.estado = :estado and LOWER(SUBSTRING(NOMBRE, CHARINDEX(nombre,']') +1, LEN(NOMBRE))) = :nombre"), 
        @NamedQuery(name="Archivo.buscarActivosPorAutorPorArea",query="SELECT a FROM Archivo a WHERE  a.documento.idDocumento = :idDocumento and a.autor.idusuario = :idUsuario AND a.estado = :estado  and a.unidadAutor = :idUnidad order by a.principal desc"),
	@NamedQuery(name="Archivo.buscarActivosPorAutor",query="SELECT a FROM Archivo a WHERE a.autor.idusuario = :idUsuario AND a.estado = :estado AND a.documento.idDocumento = :idDocumento"),@NamedQuery(name="Archivo.updatePrincipal",query="UPDATE Archivo a SET a.principal = :principal WHERE a.idArchivo = :idarchivo"),@NamedQuery(name="Archivo.findByIdNombreEstado",query="SELECT a FROM Archivo a join fetch a.documento WHERE a.documento.idDocumento = :idDocumento AND UPPER(substring(a.nombre,charindex(a.nombre,']') + 1,len(a.nombre))) = :nombre AND a.estado =:estado")})
public class Archivo implements Serializable{
	/* Constantes particulares */
	public static final char ESTADO_REGISTRADO='N';
	public static final char ESTADO_DISPONIBLE='Y';
	public static final char ESTADO_IMPORTADO='A';
	/***************************/

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ARCHIVO_SEQ")
	//@SequenceGenerator(name="ARCHIVO_SEQ",sequenceName="ARCHIVO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idarchivo")
	private Integer idArchivo;
        
        ///////////////////////////////////////////////
        @JoinColumn(name="usuariomodificacion",referencedColumnName="idusuario", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
        private Usuario usuarioCarga;

        public Usuario getUsuarioCarga() {
            return usuarioCarga;
        }

        public void setUsuarioCarga(Usuario usuarioCarga) {
            this.usuarioCarga = usuarioCarga;
        }

        ///////////////////////////////////////////////
    
	@Basic(optional=false)
	private String nombre;
        
        @Basic(optional=true)
	private String clave;
        
        @Basic(optional=true)
	private Integer tamano;

	private String descripcion;

	@Basic(optional=false)
	@Column(name="estadodigitalizacion")
	private char estadoDigitalizacion;

	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;
        
        @Basic(optional=true)
	@Column(name="fechamodificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	@Column(name="rutaarchivopdf")
	private String rutaArchivoPdf;
        
        @Column(name="usuariocreacion")
	private Integer usuariocreacion;

        @Column(name="usuariomodificacion")
	private Integer usuariomodificacion;

	@Column(name="rutaalfresco")
	private String rutaAlfresco;
 
        @Column(name="unidadAutor")
	private Integer unidadAutor;

	@Column(name="principal")
	private Character principal;
	
	@Column(name="flagFirma")
	private Integer flagFirma;

	@JoinColumn(name="documento",referencedColumnName="iddocumento")
	@ManyToOne(optional=false)
	private Documento documento;

	@Basic(optional=false)
	private Character estado;

	/* Variables temporales */
	private transient String nombreReal;
	private transient String sURL;
	private transient String nombreArchivo;
        
        private transient String tamanoFormateado;

        public String getTamanoFormateado() {
            
            if (tamano == null) return "";
            
            DecimalFormat df = new DecimalFormat("#.00");
            double valorsito = (double)tamano/1024;
            
            if (valorsito<1) return "1 KB";
            
            tamanoFormateado = String.valueOf(df.format(valorsito)) + " KB";
            return tamanoFormateado;
        }

        public void setTamanoFormateado(String tamanoFormateado) {
            this.tamanoFormateado = tamanoFormateado;
        }

	@JoinColumn(name="autor", referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario autor;
        
        @Column(name="objectId")
	private String objectId;

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

	
	public String getNombreArchivo(){
		// if(this.getRutaalfresco()!=null&&this.getRutaalfresco().split("/")!=null);
		if(rutaAlfresco != null){
			String[] split=rutaAlfresco.split("/");
			nombreArchivo=split[split.length - 1];
		}
		return nombreArchivo;
	}

	
	public void setNombreArchivo(String nombreArchivo){
		this.nombreArchivo=nombreArchivo;
	}

	/***************************/
	public Archivo(){
	}

	public Archivo(Integer idarchivo){
		this.idArchivo=idarchivo;
	}

	public Archivo(Integer idarchivo,String nombre,char estadodigitalizacion,Date fechacreacion){
		this.idArchivo=idarchivo;
		this.nombre=nombre;
		this.estadoDigitalizacion=estadodigitalizacion;
		this.fechaCreacion=fechacreacion;
	}
        
        public String getClave() {
            return clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }

	public Integer getIdArchivo(){
		return idArchivo;
	}

	public void setIdArchivo(Integer idarchivo){
		this.idArchivo=idarchivo;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public char getEstadoDigitalizacion(){
		return estadoDigitalizacion;
	}

	public void setEstadoDigitalizacion(char estadodigitalizacion){
		this.estadoDigitalizacion=estadodigitalizacion;
	}

	public void setEstadoDigitalizacion(Character estadodigitalizacion){
		if(estadodigitalizacion != null){
			this.estadoDigitalizacion=estadodigitalizacion;
		}
	}

	public Date getFechaCreacion(){
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechacreacion){
		this.fechaCreacion=fechacreacion;
	}

	public String getRutaArchivoPdf(){
		return rutaArchivoPdf;
	}

	public void setRutaArchivoPdf(String rutaarchivopdf){
		this.rutaArchivoPdf=rutaarchivopdf;
	}

	public String getRutaAlfresco(){
		return rutaAlfresco;
	}

	public void setRutaAlfresco(String rutaalfresco){
		this.rutaAlfresco=rutaalfresco;
	}

	public Documento getDocumento(){
		return documento;
	}

	public void setDocumento(Documento documento){
		this.documento=documento;
	}
        
         public Integer getUsuariocreacion() {
            return usuariocreacion;
        }

        public void setUsuariocreacion(Integer usuariocreacion) {
            this.usuariocreacion = usuariocreacion;
        }

	
	public String getNombreReal(){
		int inicio=nombre.indexOf(']');
		if(inicio > -1){
			nombreReal=nombre.substring(inicio + 1);
		}
		else{
			nombreReal=nombre;
		}
		return nombreReal;
	}

	/*
	 * @Transient public void setSNombreReal(String sNombreReal) {
	 * this.sNombreReal = sNombreReal; }
	 */

	
	public String getSURL(){
		return sURL;
	}

	
	public void setSURL(String sURL){
		this.sURL=sURL;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idArchivo != null ? idArchivo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Archivo)){
			return false;
		}
		Archivo other=(Archivo) object;
		if((this.idArchivo == null && other.idArchivo != null) || (this.idArchivo != null && !this.idArchivo.equals(other.idArchivo))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Archivo[idarchivo=" + idArchivo + "]";
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public Character getPrincipal() {
		return principal;
	}

	public void setPrincipal(Character principal) {
		if(principal != null){
			this.principal = principal;
		}
	}
        
        public Integer getUnidadAutor() {
            return unidadAutor;
        }

        public void setUnidadAutor(Integer unidadAutor) {
            this.unidadAutor = unidadAutor;
        }
        
       /* public String getRuta() {
            return ruta;
        }

        public void setRuta(String ruta) {
            this.ruta = ruta;
        }*/
        
         public Integer getUsuariomodificacion() {
            return usuariomodificacion;
        }

        public void setUsuariomodificacion(Integer usuariomodificacion) {
            this.usuariomodificacion = usuariomodificacion;
        }
        
          public Date getFechaModificacion() {
            return fechaModificacion;
        }

        public void setFechaModificacion(Date fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
        }

         public Integer getTamano() {
            return tamano;
        }

        public void setTamano(Integer tamano) {
            this.tamano = tamano;
        }

		public Integer getFlagFirma() {
			return flagFirma;
		}

		public void setFlagFirma(Integer flagFirma) {
			this.flagFirma = flagFirma;
		}
        
        
}
