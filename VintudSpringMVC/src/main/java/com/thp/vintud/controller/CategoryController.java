package com.thp.vintud.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.thp.vintud.configuration.CategoryConfig;
import com.thp.vintud.entity.Announcement;
import com.thp.vintud.entity.Category;
import com.thp.vintud.repository.CategoryRepository;

@Controller
public class CategoryController {
	
	
	@Autowired
	CategoryConfig categoryConfig;


	
	 public void addCategory(Category category) {
		 
		 
		 	ApplicationContext context = new AnnotationConfigApplicationContext(Category.class);
		 
		 	Category cte1 = (Category) context.getBean("ali")	 ;
		 	
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("persist");    
			EntityManager em = emf.createEntityManager();    
			EntityTransaction transac = em.getTransaction();			
			transac.begin();			
			em.persist(cte1)	 ;		
			transac.commit();
			em.close();
			emf.close();
		
	 }



	public  CategoryController() {
		
	}
	 

}
