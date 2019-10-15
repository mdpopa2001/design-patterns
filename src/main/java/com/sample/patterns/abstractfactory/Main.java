package com.sample.patterns.abstractfactory;

import com.sample.patterns.factorymethod.Car;
import com.sample.patterns.factorymethod.impl.FamilyCar;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {
        //a specific factory that creates HW Products
        ProductCreator hwProductCreator = new HwProductCreator();
        IProduct product = hwProductCreator.createProduct();
        product.install();

        //a specific factory that creates Products based on the
        //pre-configurated value(e.g. read from a configuration file)
        ProductCreator configurationProductCreator =
                new ConfigurationProductCreator("SW");
        IProduct product2 = configurationProductCreator.createProduct();
        product2.install();


        //a  factory that creates Products based on an identifier;
        ParameterizedCreator parameterizedCreator = new ConcreteParameterizedCreator();
        IProduct product3 = parameterizedCreator.createProduct("HW");
        product2.install();


        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Car car = new FamilyCar();
        Set<ConstraintViolation<Car>> constraintViolations
                    = validator.validate(car);



    }
}
