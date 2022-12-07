package iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.rectangle;

import org.springframework.stereotype.Component;

import iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.Shape;

@Component
public class Rectangle implements Shape {

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Inside Rectangle::draw() method.";
	}

}
