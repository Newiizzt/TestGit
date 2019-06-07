package th.co.orcsoft.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import th.co.orcsoft.training.service.impl.HelloServiceImpl;

@RestController
public class HelloController {
	@Autowired
	private HelloServiceImpl helloService;
	
	//presentation layer
	//created method String
	@RequestMapping(method=RequestMethod.GET,value="/hello/{queryname}")
	public String sayHello(@PathVariable("queryname") String name) {
		return helloService.sayHelloByName(name);
	}

}
