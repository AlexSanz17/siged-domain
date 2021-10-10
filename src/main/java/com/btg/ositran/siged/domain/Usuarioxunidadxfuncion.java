/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btg.ositran.siged.domain;
import java.io.Serializable;


  
/**
 *
 * @author consultor_jti15
 */ 


public class Usuarioxunidadxfuncion implements Serializable{
        private Integer idusuario;
        private Integer idunidad;
        private Integer idfuncion;
        private Integer idusuariocargo;
        private String  descunidad;
        private String  descfuncion;
        private Integer idrol;
        private String jefe;
        private String datos;

        public String getDatos() {
            return datos;
        }

        public void setDatos(String datos) {
            this.datos = datos;
        }

        

        public String getJefe() {
            return jefe;
        }

        public void setJefe(String jefe) {
            this.jefe = jefe;
        }

        public Integer getIdrol() {
            return idrol;
        }

        public void setIdrol(Integer idrol) {
            this.idrol = idrol;
        }
        
        public Integer getIdusuario() {
            return idusuario;
        }

        public void setIdusuario(Integer idusuario) {
            this.idusuario = idusuario;
        }

        public Integer getIdunidad() {
            return idunidad;
        }

        public void setIdunidad(Integer idunidad) {
            this.idunidad = idunidad;
        }

        public Integer getIdfuncion() {
            return idfuncion;
        }

        public void setIdfuncion(Integer idfuncion) {
            this.idfuncion = idfuncion;
        }

        public String getDescunidad() {
            return descunidad;
        }

        public void setDescunidad(String descunidad) {
            this.descunidad = descunidad;
        }

        public String getDescfuncion() {
            return descfuncion;
        }

        public void setDescfuncion(String descfuncion) {
            this.descfuncion = descfuncion;
        }
        
         public Integer getIdusuariocargo() {
           return idusuariocargo;
        }

        public void setIdusuariocargo(Integer idusuariocargo) {
            this.idusuariocargo = idusuariocargo;
        }

}
