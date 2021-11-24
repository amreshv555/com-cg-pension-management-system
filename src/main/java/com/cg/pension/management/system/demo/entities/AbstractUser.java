package com.cg.pension.management.system.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anstract_user")
public class AbstractUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminid;
	@Column
	private String userName;
	@Column
	private String password;
	@Column(unique=true,nullable=false)
	private String email;
	@Column(unique=true,nullable=false)
	private String mobile;
	
	private String pensionerid;
	
	public AbstractUser() {
		super();
	}
	public AbstractUser(int adminid, String userName, String password, String email, String mobile,
			String pensionerid) {
		super();
		this.adminid = adminid;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.pensionerid = pensionerid;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPensionerid() {
		return pensionerid;
	}
	public void setPensionerid(String pensionerid) {
		this.pensionerid = pensionerid;
	}
	@Override
	public String toString() {
		return "AbstractUser [adminid=" + adminid + ", username=" + userName + ", password=" + password + ", email="
				+ email + ", mobile=" + mobile + ", pensionerid=" + pensionerid + "]";
	}
	
	
}
