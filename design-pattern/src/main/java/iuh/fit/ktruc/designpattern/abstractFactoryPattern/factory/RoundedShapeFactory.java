package iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory;

import iuh.fit.ktruc.designpattern.abstractFactoryPattern.shape.RoundedRectangle;
import iuh.fit.ktruc.designpattern.abstractFactoryPattern.shape.RoundedSquare;
import iuh.fit.ktruc.designpattern.abstractFactoryPattern.shape.Shape;

/**
 * Rounded : làm tròn
 * @author Admin
 *
 */
public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		}else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}

}
