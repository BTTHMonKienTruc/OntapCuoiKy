package iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory;

import iuh.fit.ktruc.designpattern.abstractFactoryPattern.shape.Shape;

/**
 * Create an Abstract class to get factories for Normal and Rounded Shape
 * Objects.
 * 
 * @author Admin Tạo một lớp Trừu tượng để nhận các nhà máy cho các Đối tượng
 *         Hình dạng Bình thường và Hình tròn.
 */
public abstract class AbstractFactory {
	abstract public Shape getShape(String shapeType);
}