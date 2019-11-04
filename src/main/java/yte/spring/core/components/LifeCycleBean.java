package yte.spring.core.components;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean {

	public LifeCycleBean() {
		System.out.println("Constructor çağrıldı");
	}

	@PostConstruct
	public void init() {
		System.out.println("PostConstruct çağrıldı");
	}

	public void print() {
		System.out.println("Print çağrıldı");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy çağrıldı");
	}
}
