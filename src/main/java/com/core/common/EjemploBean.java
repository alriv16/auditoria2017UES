package com.core.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class EjemploBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name,password;

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public String getPassword() {
		return password;
	}
}