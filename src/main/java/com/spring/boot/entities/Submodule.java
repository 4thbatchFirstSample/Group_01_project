package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Submodule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long Id;
	private Long ModuleId;
	private Long UserId;
	private String Name;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getModuleId() {
		return ModuleId;
	}

	public void setModuleId(Long moduleId) {
		ModuleId = moduleId;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
