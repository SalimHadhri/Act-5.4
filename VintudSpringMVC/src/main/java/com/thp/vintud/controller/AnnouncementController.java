package com.thp.vintud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.thp.vintud.repository.AnnouncementRepository;

@Controller
public class AnnouncementController {
	
	
	
	@Autowired
    private AnnouncementRepository announcementRepository;

	

}
