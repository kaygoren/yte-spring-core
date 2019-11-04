package yte.spring.core.components;

import org.springframework.stereotype.Component;

@Component
public class FieldIjectionBean {

	public void print() {
		System.out.println("Ben bir field injection bean'iyim");
	}
}
