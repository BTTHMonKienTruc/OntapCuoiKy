package iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.circle;

import org.springframework.stereotype.Component;

import iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.Shape;

@Component
public class Circle implements Shape {

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		 return "Inside Circle::draw() method.";
	}

}
