package com.kaige123.daomu.zfb_payreceive;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class receive {

    Logger logger = Logger.getLogger(receive.class);
    private static Map<String, String> map = new HashMap();

    @GetMapping("clear")
    public String clear(HttpServletRequest httpServletRequest) {
        ServletContext servletContext = httpServletRequest.getServletContext();
        servletContext.setAttribute("message", "");
        return "ok";
    }

}
