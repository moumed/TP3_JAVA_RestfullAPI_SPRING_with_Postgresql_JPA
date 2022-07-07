package com.upec.modulemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mt_module")
public class ModuleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mod_id")
	private int id;
	
	@Column(name="mod_title")
	private String title;
	
	
	
	public ModuleEntity() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public ModuleEntity(int id, String title) {
		this.id = id;
		this.title = title;
	}

}
