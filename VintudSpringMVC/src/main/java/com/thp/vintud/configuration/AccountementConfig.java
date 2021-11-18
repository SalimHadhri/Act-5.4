package com.thp.vintud.configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thp.vintud.entity.Announcement;

@Configuration
public class AccountementConfig {

	
	@PersistenceUnit(unitName="persist")
	private EntityManagerFactory factory;	
	
	
	@PersistenceContext(unitName="persist")
	private EntityManager entityManager ;
	
	
	@Bean	
	public void addAnnouncement(Announcement announcement) {
		
		/*entityManager = factory.createEntityManager() ;
		EntityTransaction transac = entityManager.getTransaction();*/
		entityManager.joinTransaction(); 
		EntityTransaction transac = entityManager.getTransaction();
		
		transac.begin();
		entityManager.persist(announcement);
		
		transac.commit();
	
	}

	
	
	
}
