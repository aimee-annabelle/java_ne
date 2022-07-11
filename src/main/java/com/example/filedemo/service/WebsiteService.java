package com.example.filedemo.service;

import com.example.filedemo.model.Website;
import com.example.filedemo.repository.WebsiteRepository;
import org.springframework.stereotype.Service;

@Service
public class WebsiteService {
    private final WebsiteRepository websiterepository;
    public WebsiteService(WebsiteRepository websiterepository) {
        this.websiterepository = websiterepository;
    }
    public Website save(Website website) {
        return websiterepository.save(website);
    }
}
