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
@Table(name = "vistabandejaseguimiento")
public class FilaBandejaSeguimiento {
    @Id
    private Integer id;
    
    @Column(name = "nroTramite")
    private Integer nroTramite;
    
    @Column(name="idUsuario")
    private Integer idUsuario;

    @Column(name="unidadPropietario")
    private Integer unidadPropietario;
    
    @Column(name="cargoPropietario")
    private Integer cargoPropietario;

    @Column(name="idDocumento")
    private Integer idDocumento;
    
    @Column(name="estado")
    private String estado;
    
    @Column(name="asunto")
    private String asunto;

    @Column(name="fechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    
    @Column(name = "codEstado")
    private String codEstado;
    
    @Column(name="asuntoExpediente")
    private String asuntoExpediente;
    
    @Column(name="cliente")
    private String cliente;
    
    @Column(name="expediente")
    private String expediente;
    
    @Column(name = "tipodocumento")
    private Integer idtipodocumento;

    public Integer getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(Integer idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
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
    
    @Column(name="documento")
    private String documento;

    public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public Integer getNroTramite() {
        return nroTramite;
    }

    public void setNroTramite(Integer nroTramite) {
        this.nroTramite = nroTramite;
    }
}
