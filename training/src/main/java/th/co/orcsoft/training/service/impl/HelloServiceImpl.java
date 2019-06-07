package th.co.orcsoft.training.service.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
	//if not determine, scope default is SCOPE_SINGLETON
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HelloServiceImpl implements InitializingBean {
	public String sayHelloByName(String name) {
		return "hello ," +name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("HelloServiceImpl was created");
	}
}
