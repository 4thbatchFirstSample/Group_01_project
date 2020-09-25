package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.boot.entities.Submodule;

@Repository
public interface SubmoduleRepository extends JpaRepository<Submodule, Long> {
	public List<Submodule> findByModuleId(Long moduleId);
	public List<Submodule> findByUsersId(Long userId);
}
