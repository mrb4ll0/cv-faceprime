package com.cv_primeface.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cv_primeface.demo.model.CV;
import com.cv_primeface.demo.repository.CVRepository;

@Service
public class CVService
{
	private CV cv;
	private CVRepository cvRepository;
	public CVService(CVRepository cvRep)
	{
		this.cvRepository = cvRep;
	}
	
	
	public CV createCV(String name , String title,String email, List<String> skills )
	{
		 
		 cv = new CV(name,title,email,skills); 
		   saveCV(cv);
		return cv;
	}
	
	public void saveCV(CV cv)
	{
		 cvRepository.save(cv);
	}
	
	public CV findCVById(String id)
	{
		return cvRepository.findById(id).orElseThrow();
	}
	public List<CV> findAllCV()
	{
		return cvRepository.findAll();
	}
	public void deleteCV(String id)
	{
		cvRepository.deleteById(id);
	}

}
