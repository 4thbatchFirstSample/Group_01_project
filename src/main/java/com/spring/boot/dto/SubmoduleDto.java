package com.spring.boot.dto;

public class SubmoduleDto {
	private Long Id;
	private  Long ModuleId;
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
