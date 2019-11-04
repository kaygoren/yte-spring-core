package yte.spring.core.components;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {
	public void print() {
		System.out.println("Ben bir constroctur bean'iyim");
	}
}
