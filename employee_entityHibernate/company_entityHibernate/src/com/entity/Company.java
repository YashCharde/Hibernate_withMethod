package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {
	@Id
	private int reg_id;
	private String Com_name;
	private String Adress;

	public Company() {

	}

	public Company(int reg_id, String com_name, String adress) {
		super();
		this.reg_id = reg_id;
		Com_name = com_name;
		Adress = adress;
	}

	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}

	public String getCom_name() {
		return Com_name;
	}

	public void setCom_name(String com_name) {
		Com_name = com_name;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	@Override
	public String toString() {
		return "Company [reg_id=" + reg_id + ", Com_name=" + Com_name + ", Adress=" + Adress + "]";
	}

}
