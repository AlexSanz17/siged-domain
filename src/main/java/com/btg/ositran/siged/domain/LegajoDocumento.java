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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jbengoa
 */

@Entity
@Table(name="legajodocumento")
@NamedQueries({@NamedQuery(name="LegajoDocumento.findLegajoDocumento",query="SELECT d FROM LegajoDocumento d where d.idLegajo = :idLegajo and d.idDocumento = :idDocumento and d.estado = 'A'"),
               @NamedQuery(name="LegajoDocumento.findAllDocumentos",query="SELECT d FROM LegajoDocumento d where d.idLegajo = :idLegajo and d.estado = 'A'"),
               @NamedQuery(name="LegajoDocumento.findDocumento",     query="SELECT d FROM LegajoDocumento d, Legajo l  where d.idDocumento = :idDocumento and d.estado = 'A' and d.idLegajo = l.idLegajo and l.estado not in ('I') and exists (select 1 from TipoLegajoUnidad t where t.idTipo = l.tipoLegajo.idTipo and t.unidad.idunidad = :idUnidad) order by l.fechaCreacion desc")})
public class LegajoDocumento implements Serializable{
      @Id
      //@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LEGAJODOCUMENTO_SEQ")
      //@SequenceGenerator(name="LEGAJODOCUMENTO_SEQ",sequenceName="LEGAJODOCUMENTO_SEQ",initialValue=1,allocationSize=1)
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Basic(optional=false)
      @Column(name="idLegajoDocumento")
      private Integer idLegajoDocumento;
      
      @Column(name="idDocumento")
      private Integer idDocumento;

      @Column(name="idLegajo")
      private Integer idLegajo;

      public Integer getIdLegajo() {
          return idLegajo;
      }

      public void setIdLegajo(Integer idLegajo) {
          this.idLegajo = idLegajo;
      }
      
      @Column(name="estado")
      private String estado;

      @Basic(optional=false)
      @Column(name="fechaCreacion")
      @Temporal(TemporalType.TIMESTAMP)
      private Date fechaCreacion;
     
      @Basic(optional=true)
      @Column(name="fechaModificacion")
      @Temporal(TemporalType.TIMESTAMP)
      private Date fechaModificacion;
        
      @Column(name="usuarioCreacion")
      private Integer usuarioCreacion;
        
      @Column(name="usuarioModificacion")
      private Integer usuarioModificacion;
      
      public String getEstado() {
        return estado;
      }

      public void setEstado(String estado) {
        this.estado = estado;
      }
      
      public Integer getIdLegajoDocumento() {
          return idLegajoDocumento;
      }

      public void setIdLegajoDocumento(Integer idLegajoDocumento) {
          this.idLegajoDocumento = idLegajoDocumento;
      }

      public Integer getIdDocumento() {
          return idDocumento;
      }

      public void setIdDocumento(Integer idDocumento) {
          this.idDocumento = idDocumento;
      }    
      
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

        public Integer getUsuarioCreacion() {
            return usuarioCreacion;
        }

        public void setUsuarioCreacion(Integer usuarioCreacion) {
            this.usuarioCreacion = usuarioCreacion;
        }

        public Integer getUsuarioModificacion() {
            return usuarioModificacion;
        }

        public void setUsuarioModificacion(Integer usuarioModificacion) {
            this.usuarioModificacion = usuarioModificacion;
        }
}
