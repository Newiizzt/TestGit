package th.co.orcsoft.training.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2) //order class 
public class CheckAuthControllerAspect {
	@Pointcut("execution(* th.co.orcsoft.training.controller.*.*(..))")
	public void AllClassInController() {};
	
	@Pointcut("execution(* th.co.orcsoft.training.service..*.*(..))")
	public void AllClassInService() {};
	
	@Before("AllClassInController()") //check Auth before in Classcontroller 
		public void checkAuthController() {
		System.out.println("Check Auth");
	}
}
