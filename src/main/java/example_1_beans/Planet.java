package example_1_beans;

import lombok.Setter;

/**
 * This is a POJO  - Plain old java object.
 * This will represent a "spring bean" which will be created in "Spring
 */
@Setter
public class Planet {
    //Field pavadinimas - "name" beanso propertyje
    //Field reiksme - "value" beanso propertyje
    private String name;

    private Long distanceToEarth;

    public void orbit(){
        System.out.println("Planet " + name + " is orbiting " + distanceToEarth + " kms from earth.");
    }
}
