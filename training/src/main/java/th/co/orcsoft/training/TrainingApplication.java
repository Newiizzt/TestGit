package th.co.orcsoft.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//scan package when service call other package/lazy when run ex. 1/month
//@ComponentScan(basePackages= {"th.co.orcsoft.service"}
//				,lazyInit=true)

public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}

}
