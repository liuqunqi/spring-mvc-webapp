package com.wandaph.webapp.clients;

import com.wandaph.openfeign.annotation.FeignClient;
import com.wandaph.webapp.dto.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @项目名称: spring-mvc-webapp
 * @标题信息: TestClient
 * @创建人: Ailen
 * @创建日期: 2019/3/1015:01
 * @描述信息: TODO
 */
@FeignClient("spring-cloud-service")
@RequestMapping("/mvc-service")
public interface TestClient {

    @RequestMapping(value = "/sayHello", method = RequestMethod.POST)
    @ResponseBody
    String sayHello(@RequestParam("name") String name);

    @RequestMapping(value = "/updatePerson", method = RequestMethod.POST)
    @ResponseBody
    Person updatePerson(@RequestBody Person person);

}
