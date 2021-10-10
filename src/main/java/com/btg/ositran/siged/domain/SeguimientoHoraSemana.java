package com.btg.ositran.siged.domain;

import java.sql.Timestamp;
import java.util.List;

public class SeguimientoHoraSemana{

	public Timestamp getHora(){
		return hora;
	}

	public void setHora(Timestamp hora){
		this.hora=hora;
	}

	public List<Trazabilidaddocumento> getJueves(){
		return jueves;
	}

	public void setJueves(List<Trazabilidaddocumento> jueves){
		this.jueves=jueves;
	}

	public List<Trazabilidaddocumento> getLunes(){
		return lunes;
	}

	public void setLunes(List<Trazabilidaddocumento> lunes){
		this.lunes=lunes;
	}

	public List<Trazabilidaddocumento> getMartes(){
		return martes;
	}

	public void setMartes(List<Trazabilidaddocumento> martes){
		this.martes=martes;
	}

	public List<Trazabilidaddocumento> getMiercoles(){
		return miercoles;
	}

	public void setMiercoles(List<Trazabilidaddocumento> miercoles){
		this.miercoles=miercoles;
	}

	public List<Trazabilidaddocumento> getViernes(){
		return viernes;
	}

	public void setViernes(List<Trazabilidaddocumento> viernes){
		this.viernes=viernes;
	}

	public List<Trazabilidaddocumento> getSabado(){
		return sabado;
	}

	public void setSabado(List<Trazabilidaddocumento> sabado){
		this.sabado=sabado;
	}

	public List<Trazabilidaddocumento> getDomingo(){
		return domingo;
	}

	public void setDomingo(List<Trazabilidaddocumento> domingo){
		this.domingo=domingo;
	}

	private Timestamp hora;

	private List<Trazabilidaddocumento> lunes;
	private List<Trazabilidaddocumento> martes;
	private List<Trazabilidaddocumento> miercoles;
	private List<Trazabilidaddocumento> jueves;
	private List<Trazabilidaddocumento> viernes;
	private List<Trazabilidaddocumento> sabado;
	private List<Trazabilidaddocumento> domingo;
}
