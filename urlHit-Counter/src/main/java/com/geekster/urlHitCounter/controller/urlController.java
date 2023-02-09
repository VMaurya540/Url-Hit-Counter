package com.geekster.urlHitCounter.controller;

import com.geekster.urlHitCounter.model.Visit;
import com.geekster.urlHitCounter.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitors-count")
public class urlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("count")
    public Visit getCount(){
        return urlService.getVisit();


    }
}
