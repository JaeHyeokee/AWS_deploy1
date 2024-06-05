package com.lec.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {
    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer num) {
        if(num == 1) {  // info 로그
            log.info("/aws/v1 호출. info 로그 ##############################################");
        } else if(num == -1) {  // error 로그
            log.error("/aws/v1 호출. error 로그 ##############################################");
        } else if(num == 0) {  // warn 로그
            log.warn("/aws/v1 호출. warn 로그 ##############################################");
//            log.debug();
        }

        return "<h1>AWS 배포 v1</h1>";
    }


}