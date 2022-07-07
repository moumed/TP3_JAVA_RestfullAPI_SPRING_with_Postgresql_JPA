package com.upec.modulemanagement.service;
import java.util.List;
import java.util.Optional;

import com.upec.modulemanagement.entity.ModuleEntity;

public interface ModuleService {
	List<ModuleEntity> findAllModule();
	Optional<ModuleEntity> findById(Integer id);
	ModuleEntity saveModule(ModuleEntity moduleEntity);
	ModuleEntity updateModule(ModuleEntity moduleEntity);
	void deleteModule(Integer id);
	

}
