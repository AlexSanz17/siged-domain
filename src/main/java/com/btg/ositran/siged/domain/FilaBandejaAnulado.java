/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author consultor_jti15
 */

@Entity
@Table(name = "vistabandejaanulados")
public class FilaBandejaAnulado implements java.io.Serializable{
    @Id
    private Integer id;
    
    @Column(name = "nroTramite")
    private Integer nroTramite;
    
    @Column(name = "codEstado")
    private String codEstado;

    @Column(name="tipoDocumento")
    private Integer tipoDocumento;
    
    @Column(name="asunto")
    private String asunto;
    
    @Column(name="asuntoExpediente")
    private String asuntoExpediente;
    
    @Column(name="documento")
    private String documento;
    
    @Column(name="fechaLimite")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLimite;
    
    @Column(name="fechaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name="estado")
    private String estado;
    
    @Column(name="expediente")
    private String expediente;
    
    @Column(name="cliente")
    private String cliente;

    
    @Column(name="fechaAccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAccion;
    
    @Column(name="fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
  
    @Column(name="usuario")
    private Integer usuario;
    
    @Column(name="unidadPropietario")
    private Integer unidadPropietario;
    
    @Column(name="cargoPropietario")
    private Integer cargoPropietario;

    @Column(name="idDocumento")
    private Integer idDocumento;

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getAsuntoExpediente() {
        return asuntoExpediente;
    }

    public void setAsuntoExpediente(String asuntoExpediente) {
        this.asuntoExpediente = asuntoExpediente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

   /* public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }*/

    public Date getFechaAccion() {
        return fechaAccion;
    }

    public void setFechaAccion(Date fechaAccion) {
        this.fechaAccion = fechaAccion;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getUnidadPropietario() {
        return unidadPropietario;
    }

    public void setUnidadPropietario(Integer unidadPropietario) {
        this.unidadPropietario = unidadPropietario;
    }

    public Integer getCargoPropietario() {
        return cargoPropietario;
    }

    public void setCargoPropietario(Integer cargoPropietario) {
        this.cargoPropietario = cargoPropietario;
    }
    
     public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
   /*  public String getDesProceso() {
        return desProceso;
    }

    public void setDesProceso(String desProceso) {
        this.desProceso = desProceso;
    }*/
    
     public Integer getNroTramite() {
        return nroTramite;
    }

    public void setNroTramite(Integer nroTramite) {
        this.nroTramite = nroTramite;
    }
    
     public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }
    
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
