package com.jupyter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupyter.model.Campus;
import com.jupyter.repository.CampusRepository;

@Service
public class CampusService {

	@Autowired
	CampusRepository campusRepository;

	public List<Campus> getAllCampus() {
		return campusRepository.findAll();
	}

	public Campus saveOrUpdate(Campus Campus) {
		return campusRepository.save(Campus);
	}

	public Campus getCampusById(int campusCode) {
		return campusRepository.findById(campusCode).get();
	}

	public void delete(int campusCode) {
		campusRepository.deleteById(campusCode);
	}

}
