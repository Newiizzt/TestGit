package th.co.orcsoft.training.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1) //order class 
public class CheckRequestControllerAspect {
	@Pointcut("execution(* th.co.orcsoft.training.controller.*.*(..))")
	public void AllClassInController() {};
	
	@Pointcut("execution(* th.co.orcsoft.training.service..*.*(..))")
	public void AllClassInService() {};
	
	
	@Before("AllClassInController()")
		public void checkRequestController() {
		System.out.println("Check Request");
	}
}
