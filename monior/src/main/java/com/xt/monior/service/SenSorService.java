package com.xt.monior.service;

import com.xt.monior.config.SensorConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SenSorService {

    @Autowired
    SensorConfig sensorConfig;

    public String getSensor(){
        return ToStringBuilder.reflectionToString(sensorConfig);
    }
}

