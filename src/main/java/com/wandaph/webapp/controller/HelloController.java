package com.wandaph.webapp.controller;

import com.wandaph.webapp.clients.HelloClient;
import com.wandaph.webapp.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @项目名称: spring-mvc-webapp
 * @标题信息: HelloController
 * @创建人: Ailen
 * @创建日期: 2019/3/1014:05
 * @描述信息: TODO
 */
@Controller
@RequestMapping()
public class HelloController {


    @Autowired
    HelloClient helloClient;

    @RequestMapping(value = "/sayHello", method = RequestMethod.POST)
    @ResponseBody
    public String sayHello(@RequestParam("name") String name) {
        return helloClient.sayHello(name);
    }

    @RequestMapping(value = "/updatePerson", method = RequestMethod.POST)
    @ResponseBody
    public Person updatePerson(@RequestBody Person person) {
        return helloClient.updatePerson(person);
    }

}
