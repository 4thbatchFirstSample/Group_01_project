package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import com.spring.boot.entities.Defect;

public interface DefectServices {
	public void addDefect(Defect defect);

	public List<Defect> getDefect();

	public Optional<Defect> getByIdDefect(Long id);

	public void deleteById(Long id);

	public void updateDefect(Defect defect);


}
