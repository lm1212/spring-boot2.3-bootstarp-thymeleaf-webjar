package com.xt.monior.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 传感器相关配置
 */


@Data
@Component
@ConfigurationProperties(prefix = "sensor")
public class SensorConfig {

    private  String sname;

    private  String surl;
}
