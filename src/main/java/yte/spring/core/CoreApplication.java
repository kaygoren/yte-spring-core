package yte.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import yte.spring.core.components.LazyInitBean;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(CoreApplication.class, args);

		ctx.getBean(LazyInitBean.class);
	}

}
