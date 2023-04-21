package groupWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class GroupWorkMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Mikrobange mikrobange = (Mikrobange) context.getBean("Mikrobange");
        Orkaite orkaite = (Orkaite) context.getBean("Orkaite");
        Set<IrenginysSildytiMaista> virtuvesTechnika = new HashSet<>();
        virtuvesTechnika.add(mikrobange);
        virtuvesTechnika.add(orkaite);
        for (IrenginysSildytiMaista irenginysSildytiMaista : virtuvesTechnika) {
            irenginysSildytiMaista.sildytiMaista();

        }

    }
}
