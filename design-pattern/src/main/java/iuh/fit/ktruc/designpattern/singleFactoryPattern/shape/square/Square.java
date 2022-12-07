package iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.square;

import org.springframework.stereotype.Component;

import iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.Shape;

@Component
public class Square implements Shape {

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Inside Square::draw() method.";
	}

}
