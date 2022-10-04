package com.jupyter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jupyter.model.Campus;

@Repository
public interface CampusRepository extends JpaRepository<Campus, Integer>{

}
