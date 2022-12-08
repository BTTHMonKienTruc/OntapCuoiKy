package iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory;

import iuh.fit.ktruc.designpattern.abstractFactoryPattern.shape.Rectangle;
import iuh.fit.ktruc.designpattern.abstractFactoryPattern.shape.Shape;
import iuh.fit.ktruc.designpattern.abstractFactoryPattern.shape.Square;
/**
 * Với hinh binh thuong
 * @author Admin
 *
 */
public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }	 
		return null;
	}

}
