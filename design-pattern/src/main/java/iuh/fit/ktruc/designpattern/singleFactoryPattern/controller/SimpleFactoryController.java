package iuh.fit.ktruc.designpattern.singleFactoryPattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.ktruc.designpattern.singleFactoryPattern.factory.ShapeFactory;
import iuh.fit.ktruc.designpattern.singleFactoryPattern.shape.Shape;

@RestController	
@RequestMapping("/simple_factory")
public class SimpleFactoryController {

    @Autowired
    ShapeFactory shapeFactory;

    @GetMapping("/{shape}")
    public String getShape(@PathVariable("shape") String shape) {
        Shape shape1 = shapeFactory.getShape(shape);
        System.err.println(shape1.draw());
        return "Run simple_factory ......";
    }
}
