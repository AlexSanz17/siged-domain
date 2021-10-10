package com.btg.ositran.siged.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "proveido")

public class Proveido {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PROVEIDO_SEQ")
	@SequenceGenerator(name="PROVEIDO_SEQ",sequenceName="PROVEIDO_SEQ",initialValue=1,allocationSize=1)
	@Basic(optional=false)
	@Column(name="idproveido")
	private Integer idProveido;
        
        @Column(name="estado")
        private String estado;

        @Column(name="pendiente")
        private String pendiente;

        public String getPendiente() {
            return pendiente;
        }

        public void setPendiente(String pendiente) {
            this.pendiente = pendiente;
        }
	
        @Column(name="grupo")
	private String grupo;
	
        @Column(name="nombre")
	private String nombre;

	public Integer getIdProveido() {
		return idProveido;
	}

	public void setIdProveido(Integer idProveido) {
		this.idProveido = idProveido;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
}
