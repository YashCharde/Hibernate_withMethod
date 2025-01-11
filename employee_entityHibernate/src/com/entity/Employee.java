package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeeRecord")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Emp_id;
	private String name;
	private String email;
	@Column(name = "city")
	private String adress;

	public Employee() {

	}

	public Employee(int emp_id, String name, String email, String adress) {
		super();
		Emp_id = emp_id;
		this.name = name;
		this.email = email;
		this.adress = adress;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", name=" + name + ", email=" + email + ", adress=" + adress + "]";
	}

}
