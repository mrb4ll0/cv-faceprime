package com.cv_primeface.demo.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Component
@Data
@Entity
public class CV
{
	@Id
	    private String name ;
	    private String title ;
	    private String email ;
	    private List<String> skills;
	    
	    public CV() 
	    {
	    	
	    }
	     public CV(String name, String title, String email, List<String> skills)
	     {
	    	 this.name = name;
	    	 this.title = title;
	    	 this.email = email;
	    	 this.skills = skills;
	     }
	    	 

	    
}
