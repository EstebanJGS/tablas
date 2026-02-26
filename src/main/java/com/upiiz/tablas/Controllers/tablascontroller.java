package com.upiiz.tablas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class tablascontroller {
    @GetMapping("/")
    public String getListas() {
        return "tablas";
    }

}
