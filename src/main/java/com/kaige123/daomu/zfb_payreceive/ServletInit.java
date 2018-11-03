package com.kaige123.daomu.zfb_payreceive;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInit extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        System.out.println("Builder Source");
        return builder.sources(ZfbPayreceiveApplication.class);
    }
}
