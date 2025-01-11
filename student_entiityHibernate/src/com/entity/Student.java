package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	private String s_name;
	private int age;
	private String adress;
	@Id
	private long mob_no;

	public Student() {

	}

	public Student(String s_name, int age, String adress, long mob_no) {
		super();
		this.s_name = s_name;
		this.age = age;
		this.adress = adress;
		this.mob_no = mob_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	@Override
	public String toString() {
		return "Student [s_name=" + s_name + ", age=" + age + ", adress=" + adress + ", mob_no=" + mob_no + "]";
	}

}
