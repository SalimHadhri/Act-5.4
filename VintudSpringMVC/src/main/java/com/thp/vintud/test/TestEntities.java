package com.thp.vintud.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thp.vintud.configuration.CategoryConfig;
import com.thp.vintud.controller.AnnouncementController;
import com.thp.vintud.controller.CategoryController;
import com.thp.vintud.entity.Announcement;
import com.thp.vintud.entity.Category;

public class TestEntities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Cre_Vin");
		
		AnnouncementController announcementController = new AnnouncementController() ;
		
		Announcement announcement = new Announcement() ;
		
		Category cat1= new Category() ;
		
		
		CategoryController categoryController = new CategoryController() ;

			 			
	 			
		categoryController.addCategory(cat1);
	}

}
