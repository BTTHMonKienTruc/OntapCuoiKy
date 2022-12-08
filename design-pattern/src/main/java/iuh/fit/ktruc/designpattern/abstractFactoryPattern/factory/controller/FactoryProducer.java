package iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory.controller;

import iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory.AbstractFactory;
import iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory.RoundedShapeFactory;
import iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory.ShapeFactory;

/**
 * Create a Factory generator/producer class to get factories by passing an
 * information such as Shape Tạo một lớp Trình tạo / nhà sản xuất Factory để
 * nhận các nhà máy bằng cách chuyển một thông tin như Shape
 * 
 * @author Admin
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
