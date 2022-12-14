package com.example.controller;

import com.example.domain.Quake;
import com.example.domain.QuakeList;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;



@RestController
public class QuakeController {
    @RequestMapping("/")
    public List<Quake> list(){
        RestTemplate restTemplate = new RestTemplate();
        QuakeList response = restTemplate.getForObject("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2022-01-01&endtime=2022-01-02",QuakeList.class);
        assert response != null;
        return response.getFeatureList();
    }
}
