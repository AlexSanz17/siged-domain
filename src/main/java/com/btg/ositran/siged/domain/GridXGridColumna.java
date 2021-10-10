package com.btg.ositran.siged.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="gridxgridcolumna")
public class GridXGridColumna implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	private int id;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idgrid")
	private Grid grid;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idgridcolumna")
	private GridColumna gridColumna;

	/*
	 * Transients
	 */
	@Transient
	private String width;
	@Transient
	private Integer hidden;
	@Transient
	private String field;
	@Transient
	private String name;
	@Transient
	private Integer noresize;
	@Transient
	private String formater;

	/*
	 * Constructors
	 */
	public GridXGridColumna(){
	}

	public GridXGridColumna(GridColumna objGridColumna,int iIdGridxGridColumna){
		this.gridColumna=objGridColumna;
		this.id=iIdGridxGridColumna;
	}

	public GridXGridColumna(Integer iIdGridxGridColumna,String sWidth,Integer iHidden,String sField,String sName,Integer iNoResize,String sFormater){
		this.id=iIdGridxGridColumna;
		this.width=sWidth;
		this.hidden=iHidden;
		this.field=sField;
		this.name=sName;
		this.noresize=iNoResize;
		this.formater=sFormater;
	}

	/*
	 * Getters & Setters
	 */
	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id=id;
	}

	public Grid getGrid(){
		return this.grid;
	}

	public void setGrid(Grid grid){
		this.grid=grid;
	}

	public GridColumna getGridColumna(){
		return this.gridColumna;
	}

	public void setGridColumna(GridColumna gridcolumna){
		this.gridColumna=gridcolumna;
	}

	public String getWidth(){
		return width;
	}

	public void setWidth(String width){
		this.width=width;
	}

	public Integer getHidden(){
		return hidden;
	}

	public void setHidden(Integer hidden){
		this.hidden=hidden;
	}

	public String getField(){
		return field;
	}

	public void setField(String field){
		this.field=field;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public Integer getNoresize(){
		return noresize;
	}

	public void setNoresize(Integer noresize){
		this.noresize=noresize;
	}

	public String getFormater(){
		return formater;
	}

	public void setFormater(String formater){
		this.formater=formater;
	}
}
