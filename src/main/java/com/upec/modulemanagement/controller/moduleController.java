package com.upec.modulemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upec.modulemanagement.service.ModuleService;
import com.upec.modulemanagement.entity.ModuleEntity;

@RestController
@RequestMapping("/module")
public class moduleController {
	
	private final ModuleService moduleService;

	public moduleController(ModuleService moduleService) {
		super();
		this.moduleService = moduleService;
	}
	
	@GetMapping
	public List<ModuleEntity> findAllModule(){
		return moduleService.findAllModule();
	}
	
	@GetMapping("/{id}")
	public Optional<ModuleEntity> findModuleById(@PathVariable("id") Integer id){
		return moduleService.findById(id);
	}
	
	@PostMapping
	public ModuleEntity saveModule(@RequestBody ModuleEntity moduleEntity) {
		return moduleService.saveModule(moduleEntity);
	}
	
	@PutMapping
	public ModuleEntity updateModule(@RequestBody ModuleEntity moduleEntity) {
		return moduleService.updateModule(moduleEntity);
	}
	
	@DeleteMapping
	public void deleteModule(@PathVariable("id") Integer id) {
		moduleService.deleteModule(id);
	}
	
	

}
