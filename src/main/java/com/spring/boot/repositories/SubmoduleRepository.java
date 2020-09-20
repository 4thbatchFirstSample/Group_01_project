package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Submodule;



@Repository
public interface SubmoduleRepository extends JpaRepository<Submodule,Long > {

}
