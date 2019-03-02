package com.daji.springbootreport.serivce.impl;

import com.daji.springbootreport.serivce.WeatherDataService;
import com.daji.springbootreport.serivce.WeatherReportService;
import com.daji.springbootreport.vo.Weather;
import com.daji.springbootreport.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {
    @Autowired
    private WeatherDataService weatherDataService;
    @Override
    public Weather getDataByCityId(String cityId) {
        WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
        return resp.getData();
    }
}
