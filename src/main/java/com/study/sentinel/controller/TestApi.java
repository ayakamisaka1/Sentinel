package com.study.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author : ayaka
 * @version : 1.0
 * @appName : Sentinel
 * @moduleName : Sentinel
 * @className : com.study.sentinel.controller.TestApi
 * @date : 2024/4/15 14:22
 */
@RestController
public class TestApi {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
