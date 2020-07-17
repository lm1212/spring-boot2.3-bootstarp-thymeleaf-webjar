package com.xt.monior;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Slf4j
@SpringBootApplication
public class MoniorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoniorApplication.class, args);
        log.info("应用启动成功");
    }

}
