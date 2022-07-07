package com.upec.modulemanagement.repository;
import com.upec.modulemanagement.entity.ModuleEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.jpa.repository.JpaRepository;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleEntity,Integer> {

}
