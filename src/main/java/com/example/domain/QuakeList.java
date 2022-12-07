package com.example.domain;

import java.util.ArrayList;
import java.util.List;

public class QuakeList {

    private List<Quake> featureList;

    public QuakeList(){
        featureList = new ArrayList<>();
    }

    public List<Quake> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Quake> featureList) {
        this.featureList = featureList;
    }
}
