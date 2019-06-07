package th.co.orcsoft.training.service.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("QuickSort")

public class QuickSortServiceImpl implements sortService,InitializingBean,DisposableBean {
	public String sort() {
		return "QuickSort";
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("### BusinessServiceImpl destroy");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("### BusinessServiceImpl init");
		
	}
	
}
