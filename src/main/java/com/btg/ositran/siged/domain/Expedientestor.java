package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="expedientestor")
@NamedQueries({@NamedQuery(name="Expedientestor.findAll",query="SELECT e FROM Expedientestor e"),@NamedQuery(name="Expedientestor.findByIdexpediente",query="SELECT e FROM Expedientestor e WHERE e.idexpediente = :idexpediente"),@NamedQuery(name="Expedientestor.findByTipoanalisis",query="SELECT e FROM Expedientestor e WHERE e.tipoanalisis = :tipoanalisis"),@NamedQuery(name="Expedientestor.findByTipoexpediente",query="SELECT e FROM Expedientestor e WHERE e.tipoexpediente = :tipoexpediente")})
public class Expedientestor implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@Basic(optional=false)
	@Column(name="idexpediente")
	private Integer idexpediente;

	@Column(name="tipoanalisis")
	private String tipoanalisis;

	@Column(name="tipoexpediente")
	private String tipoexpediente;

	@OneToMany(mappedBy="expediente")
	private List<Resolucionjaru> resolucionjaruList;

	@JoinColumn(name="idestadosiged",referencedColumnName="idestado")
	@ManyToOne
	private Estado idestadosiged;

	@JoinColumn(name="estado",referencedColumnName="idestado")
	// @ManyToOne(optional = false)
	@ManyToOne
	private Estado estado;

	@Column(name="requiereverificacion")
	private Character requiereverificacion;

	@JoinColumn(name="etapa",referencedColumnName="idetapa")
	@ManyToOne
	private Etapa etapa;

	@JoinColumn(name="idexpediente",referencedColumnName="idexpediente",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private Expediente expediente;

	@JoinColumn(name="sala",referencedColumnName="idsala")
	@ManyToOne
	private Sala sala;

	@JoinColumn(name="revisorlegal",referencedColumnName="idusuario")
	@ManyToOne
	private UsuarioStor revisorlegal;

	@JoinColumn(name="revisortecnico",referencedColumnName="idusuario")
	@ManyToOne
	private UsuarioStor revisortecnico;

	@JoinColumn(name="analista",referencedColumnName="idusuario")
	@ManyToOne
	private UsuarioStor analista;

	@Column(name="nroresolucion")
	private String nroresolucion;

	@JoinColumn(name="idreclamante",referencedColumnName="idcliente")
	@ManyToOne
	private Cliente reclamante;

	@Column(name="reclamanterazonsocial")
	private String reclamanterazonsocial;

	@Column(name="reclamanterepresentantelegal")
	private String reclamanterepresentantelegal;

	@Column(name="reclamantedireccionreal")
	private String reclamantedireccionreal;

	@JoinColumn(name="reclamanteubigeoreal",referencedColumnName="iddistrito")
	@ManyToOne(fetch=FetchType.EAGER)
	private Distrito reclamanteUbigeoReal;

	@Column(name="reclamantedireccionprocesal")
	private String reclamantedireccionprocesal;

	@JoinColumn(name="reclamanteubigeoprocesal",referencedColumnName="iddistrito")
	@ManyToOne(fetch=FetchType.EAGER)
	private Distrito reclamanteUbigeoProcesal;

	@Column(name="reclamantecorreo")
	private String reclamantecorreo;

	@Column(name="reclamantetelefono")
	private String reclamantetelefono;

	@Column(name="reclamantefax")
	private String reclamantefax;

	@Column(name="reclamantenrosuministro")
	private String reclamantenrosuministro;

	@Column(name="reclamantenombres")
	private String reclamantenombres;

	@Column(name="reclamanteapellidopaterno")
	private String reclamanteapellidopaterno;

	@Column(name="reclamanteapellidomaterno")
	private String reclamanteapellidomaterno;

	public Expedientestor(){

	}

	public Expedientestor(Integer idexpediente){
		this.idexpediente=idexpediente;
	}

	public Integer getIdexpediente(){
		return idexpediente;
	}

	public void setIdexpediente(Integer idexpediente){
		this.idexpediente=idexpediente;
	}

	public String getTipoanalisis(){
		return tipoanalisis;
	}

	public void setTipoanalisis(String tipoanalisis){
		this.tipoanalisis=tipoanalisis;
	}

	public String getTipoexpediente(){
		return tipoexpediente;
	}

	public void setTipoexpediente(String tipoexpediente){
		this.tipoexpediente=tipoexpediente;
	}

	public List<Resolucionjaru> getResolucionjaruList(){
		return resolucionjaruList;
	}

	public void setResolucionjaruList(List<Resolucionjaru> resolucionjaruList){
		this.resolucionjaruList=resolucionjaruList;
	}

	public Estado getIdestadosiged(){
		return idestadosiged;
	}

	public void setIdestadosiged(Estado idestadosiged){
		this.idestadosiged=idestadosiged;
	}

	public Estado getEstado(){
		return estado;
	}

	public void setEstado(Estado estado){
		this.estado=estado;
	}

	public Character getRequiereverificacion(){
		return requiereverificacion;
	}

	public void setRequiereverificacion(char requiereverificacion){
		this.requiereverificacion=requiereverificacion;
	}

	public void setRequiereverificacion(Character requiereverificacion){
		if(requiereverificacion != null){
			this.requiereverificacion=requiereverificacion;
		}
		else{
			this.requiereverificacion=null;
		}
	}

	public Etapa getEtapa(){
		return etapa;
	}

	public void setEtapa(Etapa etapa){
		this.etapa=etapa;
	}

	public Expediente getExpediente(){
		return expediente;
	}

	public void setExpediente(Expediente expediente){
		this.expediente=expediente;
	}

	public Sala getSala(){
		return sala;
	}

	public void setSala(Sala sala){
		this.sala=sala;
	}

	public UsuarioStor getRevisorlegal(){
		return revisorlegal;
	}

	public void setRevisorlegal(UsuarioStor revisorlegal){
		this.revisorlegal=revisorlegal;
	}

	public UsuarioStor getRevisortecnico(){
		return revisortecnico;
	}

	public void setRevisortecnico(UsuarioStor revisortecnico){
		this.revisortecnico=revisortecnico;
	}

	public UsuarioStor getAnalista(){
		return analista;
	}

	public void setAnalista(UsuarioStor analista){
		this.analista=analista;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idexpediente != null ? idexpediente.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Expedientestor)){
			return false;
		}
		Expedientestor other=(Expedientestor) object;
		if((this.idexpediente == null && other.idexpediente != null) || (this.idexpediente != null && !this.idexpediente.equals(other.idexpediente))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Expedientestor[idexpediente=" + idexpediente + "]";
	}

	public String getNroresolucion(){
		return nroresolucion;
	}

	public void setNroresolucion(String nroresolucion){
		this.nroresolucion=nroresolucion;
	}

	public Cliente getReclamante(){
		return reclamante;
	}

	public void setReclamante(Cliente reclamante){
		this.reclamante=reclamante;
	}

	public String getReclamanterazonsocial(){
		return reclamanterazonsocial;
	}

	public void setReclamanterazonsocial(String reclamanterazonsocial){
		this.reclamanterazonsocial=reclamanterazonsocial;
	}

	public String getReclamanterepresentantelegal(){
		return reclamanterepresentantelegal;
	}

	public void setReclamanterepresentantelegal(String reclamanterepresentantelegal){
		this.reclamanterepresentantelegal=reclamanterepresentantelegal;
	}

	public String getReclamantedireccionreal(){
		return reclamantedireccionreal;
	}

	public void setReclamantedireccionreal(String reclamantedireccionreal){
		this.reclamantedireccionreal=reclamantedireccionreal;
	}

	public String getReclamantedireccionprocesal(){
		return reclamantedireccionprocesal;
	}

	public void setReclamantedireccionprocesal(String reclamantedireccionprocesal){
		this.reclamantedireccionprocesal=reclamantedireccionprocesal;
	}

	public String getReclamantecorreo(){
		return reclamantecorreo;
	}

	public void setReclamantecorreo(String reclamantecorreo){
		this.reclamantecorreo=reclamantecorreo;
	}

	public String getReclamantetelefono(){
		return reclamantetelefono;
	}

	public void setReclamantetelefono(String reclamantetelefono){
		this.reclamantetelefono=reclamantetelefono;
	}

	public String getReclamantefax(){
		return reclamantefax;
	}

	public void setReclamantefax(String reclamantefax){
		this.reclamantefax=reclamantefax;
	}

	public String getReclamantenrosuministro(){
		return reclamantenrosuministro;
	}

	public void setReclamantenrosuministro(String reclamantenrosuministro){
		this.reclamantenrosuministro=reclamantenrosuministro;
	}

	public String getReclamantenombres(){
		return reclamantenombres;
	}

	public void setReclamantenombres(String reclamantenombres){
		this.reclamantenombres=reclamantenombres;
	}

	public String getReclamanteapellidopaterno(){
		return reclamanteapellidopaterno;
	}

	public void setReclamanteapellidopaterno(String reclamanteapellidopaterno){
		this.reclamanteapellidopaterno=reclamanteapellidopaterno;
	}

	public String getReclamanteapellidomaterno(){
		return reclamanteapellidomaterno;
	}

	public void setReclamanteapellidomaterno(String reclamanteapellidomaterno){
		this.reclamanteapellidomaterno=reclamanteapellidomaterno;
	}

	public Distrito getReclamanteUbigeoReal(){
		return reclamanteUbigeoReal;
	}

	public void setReclamanteUbigeoReal(Distrito reclamanteUbigeoReal){
		this.reclamanteUbigeoReal=reclamanteUbigeoReal;
	}

	public Distrito getReclamanteUbigeoProcesal(){
		return reclamanteUbigeoProcesal;
	}

	public void setReclamanteUbigeoProcesal(Distrito reclamanteUbigeoProcesal){
		this.reclamanteUbigeoProcesal=reclamanteUbigeoProcesal;
	}

}
