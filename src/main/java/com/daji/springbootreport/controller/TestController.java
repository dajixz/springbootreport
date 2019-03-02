package com.daji.springbootreport.controller;

import com.daji.springbootreport.serivce.CityDataService;
import com.daji.springbootreport.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private CityDataService cityDataService;

    @GetMapping("/getCityList")
    public List<City> cityList(){
        List<City> cityList = new ArrayList<>();
        try{
           cityList = cityDataService.listCity();
        }catch (Exception e){
            e.printStackTrace();
        }
        return cityList;
    }
}
