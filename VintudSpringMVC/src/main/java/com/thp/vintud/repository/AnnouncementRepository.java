package com.thp.vintud.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.thp.vintud.entity.Announcement;

@Repository
public interface AnnouncementRepository {

	
	

	public void addAnnouncement(Announcement announcement) ;
	
	
	
}
