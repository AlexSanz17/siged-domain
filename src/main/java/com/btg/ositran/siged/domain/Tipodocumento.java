package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tipodocumento")
@NamedQueries({@NamedQuery(name="Tipodocumento.findAll",query="SELECT t FROM Tipodocumento t"),@NamedQuery(name="Tipodocumento.findAllActive",query="SELECT t FROM Tipodocumento t WHERE t.estado = 'A' ORDER BY t.nombre"),@NamedQuery(name="Tipodocumento.findAllWithoutStor",query="SELECT t FROM Tipodocumento t ORDER BY t.nombre"),@NamedQuery(name="Tipodocumento.findAllWithPlantilla",query="SELECT t FROM Tipodocumento t where (select count(p) from Plantilla p where p.tipo = t.idtipodocumento AND p.estado = 'A')>0"),@NamedQuery(name="Tipodocumento.findAllWithoutPlantilla",query="SELECT t FROM Tipodocumento t WHERE t.idtipodocumento NOT IN (SELECT p.tipo FROM Plantilla p)"),@NamedQuery(name="Tipodocumento.findByIdtipodocumento",query="SELECT t FROM Tipodocumento t WHERE t.idtipodocumento = :idtipodocumento"),@NamedQuery(name="Tipodocumento.findByNombre",query="SELECT t FROM Tipodocumento t WHERE LOWER(t.nombre) = :nombre"),
			   @NamedQuery(name="Tipodocumento.findByNombreLike",query="SELECT t FROM Tipodocumento t WHERE LOWER(t.nombre) like :nombre"),@NamedQuery(name="Tipodocumento.findByDescripcion",query="SELECT t FROM Tipodocumento t WHERE t.descripcion = :descripcion"),@NamedQuery(name="Tipodocumento.findByTipoDocumentoPIDE",query="SELECT t FROM Tipodocumento t WHERE t.pide = :tipoPIDE"), @NamedQuery(name="Tipodocumento.findByAllTipoDocumentoPIDE",query="SELECT t FROM Tipodocumento t WHERE t.pide is not null and t.estadoPIDE is not null and t.estadoPIDE = 'A'"),
			   @NamedQuery(name="Tipodocumento.findByEstado",query="SELECT t FROM Tipodocumento t WHERE t.estado = :estado"),@NamedQuery(name="Tipodocumento.findByCodigo",query="SELECT t FROM Tipodocumento t WHERE UPPER(t.codigo) = :codigo")
            })
public class Tipodocumento implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TIPODOCUMENTO_SEQ")
	//@SequenceGenerator(name="TIPODOCUMENTO_SEQ",sequenceName="TIPODOCUMENTO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idtipodocumento")
	private Integer idtipodocumento;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
        
        @Column(name="pide")
	private String pide;

        @Column(name="externo")
        private String externo;

        @Column(name="estadoPIDE")
        private String estadoPIDE;
     
        @Column(name="externoQR")
        private String externoQR;

	@Column(name="descripcion")
	private String descripcion;
	@Column(name="codigo")
	private String codigo;
	@Column(name="tiponumeracion")
	private String tiponumeracion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
        
        @Column(name="sicor")
        private String sicor;

        public String getSicor() {
            return sicor;
        }

        public void setSicor(String sicor) {
            this.sicor = sicor;
        }
        
         public String getExternoQR() {
            return externoQR;
        }

        public void setExternoQR(String externoQR) {
            this.externoQR = externoQR;
        }

        public String getPide() {
            return pide;
        }

        public void setPide(String pide) {
            this.pide = pide;
        }
   

	/*
	 * @OneToMany(mappedBy = "tipoDocumento", fetch = FetchType.LAZY) private
	 * List<Documento> documentoList;
	 */

	/*
	 * Constructors
	 */
	public Tipodocumento(){
	}

	public Tipodocumento(Integer idtipodocumento){
		this.idtipodocumento=idtipodocumento;
	}

	public Tipodocumento(Integer idtipodocumento,String nombre,char estado){
		this.idtipodocumento=idtipodocumento;
		this.nombre=nombre;
		this.estado=estado;
	}
        
         public String getExterno() {
           return externo;
        }

        public void setExterno(String externo) {
            this.externo = externo;
        }
        
         public String getEstadoPIDE() {
            return estadoPIDE;
        }

        public void setEstadoPIDE(String estadoPIDE) {
            this.estadoPIDE = estadoPIDE;
        }
   
	/*
	 * Getters & Setters
	 */
        
       /*  public String getSicor() {
            return sicor;
        }

        public void setSicor(String sicor) {
            this.sicor = sicor;
        }*/
	public Integer getIdtipodocumento(){
		return idtipodocumento;
	}

	public void setIdtipodocumento(Integer idtipodocumento){
		this.idtipodocumento=idtipodocumento;
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

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
	}

	public String getTiponumeracion(){
		return tiponumeracion;
	}

	public void setTiponumeracion(String tiponumeracion){
		this.tiponumeracion=tiponumeracion;
	}

	public char getEstado(){
		return estado;
	}

	public void setEstado(char estado){
		this.estado=estado;
	}

	public void setEstado(Character estado){
		if(estado != null){
			this.estado=estado;
		}
	}

	/*
	 * public List<Documento> getDocumentoList() { return documentoList; }
	 *
	 * public void setDocumentoList(List<Documento> documentoList) {
	 * this.documentoList = documentoList; }
	 */
	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idtipodocumento != null ? idtipodocumento.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Tipodocumento)){
			return false;
		}
		Tipodocumento other=(Tipodocumento) object;
		if((this.idtipodocumento == null && other.idtipodocumento != null) || (this.idtipodocumento != null && !this.idtipodocumento.equals(other.idtipodocumento))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + nombre + "]";
	}

	/*
	 * Auditoria
	 */
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();

		lstCamposAuditables.add(new AuditableCampo("nombre","Nombre"));
		lstCamposAuditables.add(new AuditableCampo("descripcion","Descripcion"));

		return lstCamposAuditables;
	}
}
