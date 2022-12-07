package iuh.fit.ktruc.designpattern.singleFactoryPattern.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.Shape;
import iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.circle.Circle;
import iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.rectangle.Rectangle;
import iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.square.Square;

@Component
public class ShapeFactory {

    @Autowired
    Circle circle;
    @Autowired
    Rectangle rectangle;
    @Autowired
    Square square;

    //sử dụng phương thức getShape để lấy đối tượng có kiểu hình dạng
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;

        switch (ShapeType.valueOf(shapeType)) {
            case CIRCLE:
                return circle;
            case RECTANGLE:
                return rectangle;
            case SQUARE:
                return square;
            default:
                return null;
        }
    }
}
