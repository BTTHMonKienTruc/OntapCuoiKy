package iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.ktruc.designpattern.abstractFactoryPattern.factory.AbstractFactory;
import iuh.fit.ktruc.designpattern.abstractFactoryPattern.shape.Shape;

/**
 * Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes by passing an information such as type.
 * Sử dụng FactoryProducer để lấy AbstractFactory để có được các nhà máy của các lớp cụ thể bằng cách chuyển một thông tin như loại.
 * @author Admin
 *
 */

@RestController
@RequestMapping("abstract-factory")
public class ProducerController {
	@GetMapping("/{os_name}&&{isRounded}")
    public String getShape(@PathVariable("os_name") String osName, @PathVariable Boolean isRounded) {
		System.err.println(isRounded); 
		// isRounded : true( Rounded )    --- false( no Rounded )
		// osName: RECTANGLE -- SQUARE
				
		//get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(isRounded);
	      //get an object of Shape Rectangle  -- tạo đối tượng Shape
	      Shape shape1 = shapeFactory.getShape(osName);
	      //call draw method of Shape Rectangle -- goi phuong thức draw()
	      shape1.draw();
		
		// test all 
//		//get shape factory
//	      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
//	      //get an object of Shape Rectangle  -- tạo đối tượng Shape
//	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
//	      //call draw method of Shape Rectangle -- goi phuong thức draw()
//	      shape1.draw();
//	      //get an object of Shape Square  -- tạo đối tượng Shape
//	      Shape shape2 = shapeFactory.getShape("SQUARE");
//	      //call draw method of Shape Square -- goi phuong thức draw()
//	      shape2.draw();
//	      //get shape factory
//	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
//	      //get an object of Shape Rectangle -- tạo đối tượng Shape
//	      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
//	      //call draw method of Shape Rectangle -- goi phuong thức draw()
//	      shape3.draw();
//	      //get an object of Shape Square  -- tạo đối tượng Shape
//	      Shape shape4 = shapeFactory1.getShape("SQUARE");
//	      //call draw method of Shape Square -- goi phuong thức draw()
//	      shape4.draw();
		
		return "Run abstract-factory ....";
	}
}
