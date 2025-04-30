package com.example.methodlvlsec;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    @PreAuthorize("hasAuthority('read')")
    public String demo(){
        return "demo";
    }

    @GetMapping("/demo1")
    @PreAuthorize("hasAnyAuthority('write', 'read')")
    public String demo1(){
        return "demo1";
    }
}
