package com.cg.pension.management.system.demo.entities;

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
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String pensionerid;
	public AbstractUser() {
		super();
	}
	public AbstractUser(int adminid, String username, String password, String email, String mobile,
			String pensionerid) {
		super();
		this.adminid = adminid;
		this.username = username;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		return "AbstractUser [adminid=" + adminid + ", username=" + username + ", password=" + password + ", email="
				+ email + ", mobile=" + mobile + ", pensionerid=" + pensionerid + "]";
	}
	
	
}
