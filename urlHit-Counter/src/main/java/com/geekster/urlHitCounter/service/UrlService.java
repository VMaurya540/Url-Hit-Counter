package com.geekster.urlHitCounter.service;

import com.geekster.urlHitCounter.model.Visit;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    static  int count = 0;

    public Visit getVisit(){
        Visit visit = new Visit(++count);
        return visit;
    }

}
