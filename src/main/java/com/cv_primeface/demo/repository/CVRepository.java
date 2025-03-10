package com.cv_primeface.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv_primeface.demo.model.CV;

public interface CVRepository extends JpaRepository<CV,String>
{
	

}
