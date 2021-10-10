package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="unidad")
@NamedQueries({@NamedQuery(name="Unidad.findAll",query="SELECT u FROM Unidad u where estado = 'A' order by nombre"),
	@NamedQuery(name="Unidad.findDependenciaByIdunidad",query="SELECT NEW Unidad (u.dependencia, u.idunidad, u.nombre) FROM Unidad u WHERE u.idunidad = :idunidad"),
	@NamedQuery(name="Unidad.findByIdunidad",query="SELECT u FROM Unidad u WHERE u.idunidad = :idunidad"),
	@NamedQuery(name="Unidad.findByNombre",query="SELECT u FROM Unidad u WHERE u.nombre = :nombre"),
	@NamedQuery(name="Unidad.findByGrupo",query="SELECT u FROM Unidad u where u.idunidad in (select distinct a.unidadgrupo from Unidad a)  order by u.nombre"),
        @NamedQuery(name="Unidad.findByGrupoUnidad",query="SELECT u FROM Unidad u where u.unidadgrupo = :idunidad"),
	@NamedQuery(name="Unidad.findByDescripcion",query="SELECT u FROM Unidad u WHERE u.descripcion = :descripcion")})
@NamedNativeQuery(name="Unidad.findAllUnidadSAS",query="SELECT * FROM UnidadSAS u",resultClass=Unidad.class)
public class Unidad implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="UNIDAD_SEQ")
	@SequenceGenerator(name="UNIDAD_SEQ",sequenceName="UNIDAD_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idunidad")
	private Integer idunidad;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="finenvio")
	private String finEnvio;
	@Column(name="inicioenvio")
	private String inicioEnvio;
	@Column(name="finrecepcion")
	private String finRecepcion;
	@Column(name="iniciorecepcion")
	private String inicioRecepcion;

	@Basic(optional=true)
	@Column(name="unidadgrupo")
	private Integer unidadgrupo;


	@Basic(optional=true)
	@Column(name="sigla")
	private String sigla;
        
        @Basic(optional=true)
	@Column(name="rutaSite")
	private String rutaSite;
        
        @Basic(optional=true)
	@Column(name="niveles")
	private String niveles;
        
        @Basic(optional=true)
	@Column(name="iniciales")
	private String iniciales;

        public String getIniciales() {
            return iniciales;
        }

        public void setIniciales(String iniciales) {
            this.iniciales = iniciales;
        }

        public String getNiveles() {
            return niveles;
        }

        public void setNiveles(String niveles) {
            this.niveles = niveles;
        }

        public String getRutaSite() {
            return rutaSite;
        }

        public void setRutaSite(String rutaSite) {
            this.rutaSite = rutaSite;
        }

        @Column(name="estado")
	private String estado;

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        
        @Column(name="siglaUnidad")
	private String siglaUnidad;

        public String getSiglaUnidad() {
            return siglaUnidad;
        }

        public void setSiglaUnidad(String siglaUnidad) {
            this.siglaUnidad = siglaUnidad;
        }
        
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Integer getUnidadgrupo() {
		return unidadgrupo;
	}

	public void setUnidadgrupo(Integer unidadgrupo) {
		this.unidadgrupo = unidadgrupo;
	}

	@ManyToMany(mappedBy="unidadList",fetch=FetchType.LAZY)
	private List<Procedimiento> procedimientoList;
	@JoinColumn(name="sede",referencedColumnName="idsede")
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	private Sede sede;
	/*
	 * @OneToMany(cascade=CascadeType.ALL,mappedBy="idunidad") private List<Rol>
	 * rolList;
	 */
	@OneToMany(cascade=CascadeType.ALL,mappedBy="unidad",fetch=FetchType.LAZY)
	private List<Usuario> usuarios;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idunidad",fetch=FetchType.LAZY)
	private List<Expedientesas> expedientesasList;
	@JoinColumn(name="dependencia",referencedColumnName="idunidad")
	@ManyToOne(fetch=FetchType.LAZY)
	private Unidad dependencia;

	/*
	 * Constructors
	 */
	public Unidad(){
	}

	public Unidad(Integer idunidad){
		this.idunidad=idunidad;
	}

	public Unidad(Integer idunidad,String nombre){
		this.idunidad=idunidad;
		this.nombre=nombre;
	}

	public Unidad(Unidad dependencia,Integer idunidad,String nombre){
		super();
		this.dependencia=dependencia;
		this.idunidad=idunidad;
		this.nombre=nombre;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdunidad(){
		return idunidad;
	}

	public void setIdunidad(Integer idunidad){
		this.idunidad=idunidad;
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

	public List<Procedimiento> getProcedimientoList(){
		return procedimientoList;
	}

	public void setProcedimientoList(List<Procedimiento> procedimientoList){
		this.procedimientoList=procedimientoList;
	}

	public Sede getSede(){
		return sede;
	}

	public void setSede(Sede sede){
		this.sede=sede;
	}

	/*
	 * public List<Rol> getRolList(){ return rolList; }
	 *
	 * public void setRolList(List<Rol> rolList){ this.rolList=rolList; }
	 */
	public List<Usuario> getUsuarios(){
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios){
		this.usuarios=usuarios;
	}

	public List<Expedientesas> getExpedientesasList(){
		return expedientesasList;
	}

	public void setExpedientesasList(List<Expedientesas> expedientesasList){
		this.expedientesasList=expedientesasList;
	}

	public Unidad getDependencia(){
		return dependencia;
	}

	public void setDependencia(Unidad dependencia){
		this.dependencia=dependencia;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idunidad != null ? idunidad.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Unidad)){
			return false;
		}
		Unidad other=(Unidad) object;
		if((this.idunidad == null && other.idunidad != null) || (this.idunidad != null && !this.idunidad.equals(other.idunidad))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.nombre + "]";
	}

	/*
	 * Auditoria
	 */
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();

		lstCamposAuditables.add(new AuditableCampo("nombre","Nombre"));
		lstCamposAuditables.add(new AuditableCampo("descripcion","Descripcion"));
		lstCamposAuditables.add(new AuditableCampo("sede","Sede"));
		lstCamposAuditables.add(new AuditableCampo("dependencia","Dependencia"));

		return lstCamposAuditables;
	}

	public String getFinEnvio() {
		return finEnvio;
	}

	public void setFinEnvio(String finEnvio) {
		this.finEnvio = finEnvio;
	}

	public String getInicioEnvio() {
		return inicioEnvio;
	}

	public void setInicioEnvio(String inicioEnvio) {
		this.inicioEnvio = inicioEnvio;
	}

	public String getFinRecepcion() {
		return finRecepcion;
	}

	public void setFinRecepcion(String finRecepcion) {
		this.finRecepcion = finRecepcion;
	}

	public String getInicioRecepcion() {
		return inicioRecepcion;
	}

	public void setInicioRecepcion(String inicioRecepcion) {
		this.inicioRecepcion = inicioRecepcion;
	}

   
}
