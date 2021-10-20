package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name="lista")
@NamedQueries({@NamedQuery(name="Lista.findAll",query="SELECT l FROM Lista l ORDER BY l.nombre"),@NamedQuery(name="Lista.findByIdlista",query="SELECT l FROM Lista l WHERE l.idlista = :idlista"),@NamedQuery(name="Lista.findByNombre",query="SELECT l FROM Lista l WHERE l.nombre = :nombre"),@NamedQuery(name="Lista.findByFechacreacion",query="SELECT l FROM Lista l WHERE l.fechacreacion = :fechacreacion order by l.nombre"),@NamedQuery(name="Lista.findByEstado",query="SELECT l FROM Lista l WHERE l.estado = :estado ORDER BY l.nombre"),@NamedQuery(name="Lista.findByIdPropietario",query="SELECT l FROM Lista l WHERE l.idpropietario.idusuario = :idpropietario order by l.nombre"),@NamedQuery(name="Lista.findByAdministrador&Estado",query="SELECT l FROM Lista l WHERE :administrador MEMBER OF l.administradorListaList AND l.estado = :estado ORDER BY l.nombre"),
		@NamedQuery(name="Lista.findByEstadoExcludedByProceso",query="SELECT l FROM Lista l WHERE l.estado = :estado AND :proceso NOT MEMBER OF l.listaProceso ORDER BY l.nombre")})
public class Lista implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LISTA_SEQ")
	//@SequenceGenerator(name="LISTA_SEQ",sequenceName="LISTA_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idlista")
	private Integer idlista;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@JoinTable(name="contactoxlista",joinColumns={@JoinColumn(name="idlista",referencedColumnName="idlista")},inverseJoinColumns={@JoinColumn(name="idcontacto",referencedColumnName="idusuario")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Usuario> usuarioList;
	@JoinColumn(name="idpropietario",referencedColumnName="idusuario")
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario idpropietario;
	@JoinTable(name="administradorxlista",joinColumns={@JoinColumn(name="idlista",referencedColumnName="idlista")},inverseJoinColumns={@JoinColumn(name="idusuario",referencedColumnName="idusuario")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Usuario> administradorListaList;
	@JoinTable(name="participantexlista",joinColumns={@JoinColumn(name="idlista",referencedColumnName="idlista")},inverseJoinColumns={@JoinColumn(name="idusuario",referencedColumnName="idusuario")})
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Usuario> participanteListaList;
	@ManyToMany(mappedBy="listaList",fetch=FetchType.LAZY)
	private List<Proceso> listaProceso;

	/*
	 * Constructors
	 */
	public Lista(){
	}

	public Lista(Integer idlista){
		this.idlista=idlista;
	}

	public Lista(Integer idlista,String nombre,Date fechacreacion,char estado){
		this.idlista=idlista;
		this.nombre=nombre;
		this.fechacreacion=fechacreacion;
		this.estado=estado;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdlista(){
		return idlista;
	}

	public void setIdlista(Integer idlista){
		this.idlista=idlista;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public Date getFechacreacion(){
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion){
		this.fechacreacion=fechacreacion;
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

	public List<Usuario> getUsuarioList(){
		return usuarioList;
	}

	public void setUsuarioList(List<Usuario> usuarioList){
		this.usuarioList=usuarioList;
	}

	public Usuario getIdpropietario(){
		return idpropietario;
	}

	public void setIdpropietario(Usuario idpropietario){
		this.idpropietario=idpropietario;
	}

	public List<Usuario> getAdministradorListaList(){
		return administradorListaList;
	}

	public void setAdministradorListaList(List<Usuario> administradorListaList){
		this.administradorListaList=administradorListaList;
	}

	public List<Usuario> getParticipanteListaList(){
		return participanteListaList;
	}

	public void setParticipanteListaList(List<Usuario> participanteListaList){
		this.participanteListaList=participanteListaList;
	}

	public List<Proceso> getListaProceso(){
		return listaProceso;
	}

	public void setListaProceso(List<Proceso> listaProceso){
		this.listaProceso=listaProceso;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idlista != null ? idlista.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Lista)){
			return false;
		}
		Lista other=(Lista) object;
		if((this.idlista == null && other.idlista != null) || (this.idlista != null && !this.idlista.equals(other.idlista))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "ID[" + idlista + "]";
	}

	/*
	 * Auditoria
	 */
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();

		lstCamposAuditables.add(new AuditableCampo("nombre","Nombre"));
		lstCamposAuditables.add(new AuditableCampo("usuarioList","Contactos"));

		return lstCamposAuditables;
	}
}
