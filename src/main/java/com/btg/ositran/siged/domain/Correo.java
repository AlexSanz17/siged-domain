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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author consultor_jti15
 */

@Entity
@Table(name="correo")
public class Correo implements Serializable{
    @Id //JC82
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional=false)
	@Column(name="idCorreo")
	private Integer idCorreo;
         
        @Column(name="para")
	private String para;
        
        @Column(name="msgText")
	private String msgText;
     
        @Column(name="estado")
	private String estado;
  
        @Column(name="tema")
	private String tema;

        public String getTema() {
            return tema;
        }

        public void setTema(String tema) {
            this.tema = tema;
        }
        
        @Column(name="fechaCreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

        public Integer getIdCorreo() {
            return idCorreo;
        }

        public void setIdCorreo(Integer idCorreo) {
            this.idCorreo = idCorreo;
        }

        public String getPara() {
            return para;
        }

        public void setPara(String para) {
            this.para = para;
        }

        public String getMsgText() {
            return msgText;
        }

        public void setMsgText(String msgText) {
            this.msgText = msgText;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public Date getFechaCreacion() {
            return fechaCreacion;
        }

        public void setFechaCreacion(Date fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
        }
}
