/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.io.Serializable;
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

/**
 *
 * @author consultor_jti15
 */

@Entity
@Table(name="detalleCliente")
@NamedQueries({@NamedQuery(name="DetalleCliente.findByDetalleCliente",query="SELECT c FROM DetalleCliente c WHERE c.idCliente = :idCliente and estado = :estado"),
              // @NamedQuery(name="DetalleCliente.findByDetalleClienteRemitente", query="SELECT c FROM DetalleCliente c WHERE c.idCliente = :idCliente and c.idRemitente= :idRemitente and estado = :estado"),
               @NamedQuery(name="DetalleCliente.findByDetalleClienteId", query="SELECT c FROM DetalleCliente c WHERE c.idDetalleCliente = :idDetalleCliente")
              // @NamedQuery(name="DetalleCliente.findByMaxRemitente", query="SELECT c FROM DetalleCliente c WHERE c.idCliente = :idCliente")
})
public class DetalleCliente implements Serializable {
    private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DETALLECLIENTE_SEQ")
	//@SequenceGenerator(name="DETALLECLIENTE_SEQ",sequenceName="DETALLECLIENTE_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
        @Column(name="idDetalleCliente")
	private Integer idDetalleCliente;

        @Column(name="idCliente")
	private Integer idCliente;
        
        /*
        @Column(name="idRemitente")
	private Integer idRemitente;
        */
        @Column(name="idCargoAdministrado")
	private Integer idCargoAdministrado;
        
        @Column(name="nombres")
	private String nombres;
        
        @Column(name="apellidoPaterno")
	private String apellidoPaterno;
        
        @Column(name="apellidoMaterno")
	private String apellidoMaterno;
        
        @Column(name="usuarioCreacion")
	private Integer usuarioCreacion;
  
        @Column(name="usuarioModificacion")
	private Integer usuarioModificacion;

        
        @JoinColumn(name="idCargoAdministrado",referencedColumnName="idCargoAdministrado", insertable=false, updatable=false)
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private CargoAdministrado cargoAdministrado;

        public CargoAdministrado getCargoAdministrado() {
            return cargoAdministrado;
        }

        public void setCargoAdministrado(CargoAdministrado cargoAdministrado) {
            this.cargoAdministrado = cargoAdministrado;
        }
    
        
        @Column(name="estado")
	private String estado;
        
        @Column(name="fechaCreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

  
        
        @Column(name="fechaModificacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
        
              public Date getFechaCreacion() {
            return fechaCreacion;
        }

        public void setFechaCreacion(Date fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
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

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        public Integer getIdDetalleCliente() {
           return idDetalleCliente;
        }

        public void setIdDetalleCliente(Integer idDetalleCliente) {
            this.idDetalleCliente = idDetalleCliente;
        }

        public Integer getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(Integer idCliente) {
            this.idCliente = idCliente;
        }
/*
        public Integer getIdRemitente() {
            return idRemitente;
        }

        public void setIdRemitente(Integer idRemitente) {
            this.idRemitente = idRemitente;
        }
*/
        public Integer getIdCargoAdministrado() {
            return idCargoAdministrado;
        }

        public void setIdCargoAdministrado(Integer idCargoAdministrado) {
            this.idCargoAdministrado = idCargoAdministrado;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }

        public Integer getUsuarioCreacion() {
            return usuarioCreacion;
        }

        public void setUsuarioCreacion(Integer usuarioCreacion) {
            this.usuarioCreacion = usuarioCreacion;
        }
   
}
