package com.spring.boot.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	public String userName;
	public String role;
	
	@ManyToMany(mappedBy = "users")
	private List<Submodule> submodules;
	
	public List<Submodule> getSubmodule() {
		return submodules;
	}
	public void setSubmodule(List<Submodule> submodule) {
		this.submodules = submodule;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
