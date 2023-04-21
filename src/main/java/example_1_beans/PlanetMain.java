package example_1_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlanetMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Planet mySaturnPlanet = (Planet) context.getBean("planet");
        mySaturnPlanet.orbit();
    }
}
