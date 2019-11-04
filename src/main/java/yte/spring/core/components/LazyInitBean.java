package yte.spring.core.components;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyInitBean {

	public LazyInitBean() {
		System.out.println("Ben oluşturuldum!");
	}

	public void print() {
		System.out.println("Print çağrıldı!");
	}
}
