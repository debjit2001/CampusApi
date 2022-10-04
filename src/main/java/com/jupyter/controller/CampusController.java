package com.jupyter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jupyter.model.Campus;
import com.jupyter.service.CampusService;

@RestController
public class CampusController {
	
	@Autowired
	CampusService campusService;
	
	//get data from database
	@GetMapping("/campus")
	private List<Campus> getAllCampus(){
		return campusService.getAllCampus();
	}
	
	//save data into the database
	@PostMapping("/campus")  
	private Campus saveCampus(@RequestBody Campus campus)   
	{  
	return campusService.saveOrUpdate(campus);
	}  
	
	//get data by ID
	@GetMapping("/campus/{campusCode}")  
	private Campus getcampusById(@PathVariable("campusCode") int campusCode)   
	{  
	return campusService.getCampusById(campusCode);
	}  
	
	//delete data
	@DeleteMapping("/campus/{campusCode}")  
	private void deleteCampus(@PathVariable("campusCode") int empCode)   
	{  
	campusService.delete(empCode);  
	}  
	
	//edit data
	@PutMapping("/campus")  
	private Campus update(@RequestBody Campus campus)   
	{  
	campusService.saveOrUpdate(campus);  
	return campus;
	}
	
}
