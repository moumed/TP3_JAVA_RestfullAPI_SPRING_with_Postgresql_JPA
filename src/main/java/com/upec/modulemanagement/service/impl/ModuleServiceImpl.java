package com.upec.modulemanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.upec.modulemanagement.entity.ModuleEntity;
import com.upec.modulemanagement.repository.ModuleRepository;
import com.upec.modulemanagement.service.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {
	private final ModuleRepository moduleRepository;
	
	public ModuleServiceImpl(ModuleRepository moduleRepository) {
		super();
		this.moduleRepository = moduleRepository;
	}


	@Override
	public List<ModuleEntity> findAllModule() {
		return moduleRepository.findAll();
	}

	@Override
	public Optional<ModuleEntity> findById(Integer id) {
		return moduleRepository.findById(id);
	}

	@Override
	public ModuleEntity saveModule(ModuleEntity moduleEntity) {
		return moduleRepository.save(moduleEntity);
	}

	@Override
	public ModuleEntity updateModule(ModuleEntity moduleEntity) {
		return moduleRepository.save(moduleEntity);
	}

	@Override
	public void deleteModule(Integer id) {
		moduleRepository.deleteById(id);
	}

}
