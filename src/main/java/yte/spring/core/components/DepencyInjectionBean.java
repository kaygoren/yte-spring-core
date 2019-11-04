package yte.spring.core.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepencyInjectionBean {

	@Autowired
	private FieldIjectionBean fieldIjectionBean;

	private SetterInjectionBean setterInjectionBean;

	private ConstructorInjectionBean constructorInjectionBean;

	@Autowired
	public DepencyInjectionBean(final ConstructorInjectionBean constructorInjectionBean) {
		this.constructorInjectionBean = constructorInjectionBean;
	}

	@Autowired
	public void setSetterInjectionBean(final SetterInjectionBean setterInjectionBean) {
		this.setterInjectionBean = setterInjectionBean;
	}

	public void print() {
		fieldIjectionBean.print();
		setterInjectionBean.print();
		constructorInjectionBean.print();
	}
}
