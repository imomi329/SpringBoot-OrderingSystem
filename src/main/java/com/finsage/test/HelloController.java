package com.finsage.test;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finsage.web.demo.bean.Demo;

/**
 * 這裡使用 @RestController (等同於 @Controller 和 @ResponseBody)
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@RestController
@RequestMapping("/test")
public class HelloController {  
    
	/**
	 * 這裡使用 @RequestMapping 建立請求映射
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
    @RequestMapping("/helloZZZ")  
    public String hello(){  
       return "Hello world!";  
    } 
    
    @RequestMapping("/hello2")  
    public String hello2(){  
       return "666666";  
    } 
    
    /**
     * Spring Boot 默認使用的json解析框架是jackson
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo(){
    	Demo demo = new Demo();
    	demo.setId(1);
    	demo.setName("張三");
    	demo.setCreateTime(new Date());
    	demo.setRemark("我是備註");
    	return demo;
    }
}  
