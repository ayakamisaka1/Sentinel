package com.study.springcloudsentinel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author : ayaka
 * @version : 1.0
 * @appName : springCloud-sentinel
 * @moduleName : springCloud-sentinel
 * @className : com.study.springcloudsentinel.index
 * @date : 2024/4/17 16:03
 */
@RestController
public class index {
    @Value("${a}")
    private int a;
    @GetMapping("/index")
    public String index(){
        System.out.println(String.valueOf(a));
        return ""+a;
    }
}
