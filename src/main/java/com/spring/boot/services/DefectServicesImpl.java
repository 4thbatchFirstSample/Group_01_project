package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Defect;
import com.spring.boot.repositories.DefectRepository;

@Service
public class DefectServicesImpl implements DefectServices {
	@Autowired
	private DefectRepository defectRepository;

	@Override
	public void addDefect(Defect defect) {
		defectRepository.save(defect);
	}

	@Override
	public List<Defect> getDefect() {
		return defectRepository.findAll();
	}

	@Override
	public Defect getByIdDefect(Long id) {
		return defectRepository.findById(id).get();
	}

	@Override
	public void deleteById(Long id) {
		defectRepository.deleteById(id);
	}

	@Override
	public void updateDefect(Defect defect) {
		defectRepository.save(defect);
	}

	@Override
	public List<Defect> getAllBySubModuleId(Long submodulId) {
		return defectRepository.findBySubModuleId(submodulId);
	}
}