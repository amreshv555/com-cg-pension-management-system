package com.cg.pension.management.system.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pensioner_details")
public class Pensioner {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pensionerid;
	 @Column(nullable=false)
	private int age;
	@Column(name="aadhar_no", unique=true, nullable=false)
	 private int aadhar;
	@Column(name="pan_no",unique=true,nullable=false)
	 private int pan;
	@Column(nullable=false)
	 private long salary;
	@Column(nullable=false)
	 private String pensionType;
	 
	
	 
	public Pensioner() {
		super();
	}
	public Pensioner(int pensionerid, int age, int aadhar, int pan, long salary, String pensionType) {
		super();
		this.pensionerid = pensionerid;
		this.age = age;
		this.aadhar = aadhar;
		this.pan = pan;
		this.salary = salary;
		this.pensionType = pensionType;
	}
	public int getPensionerid() {
		return pensionerid;
	}
	public void setPensionerid(int pensionerid) {
		this.pensionerid = pensionerid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public int getPan() {
		return pan;
	}
	public void setPan(int pan) {
		this.pan = pan;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	@Override
	public String toString() {
		return "Pensioner [pensionerid=" + pensionerid + ", age=" + age + ", aadhar=" + aadhar + ", pan=" + pan
				+ ", salary=" + salary + ", pensionType=" + pensionType + "]";
	}
	
	 
}
