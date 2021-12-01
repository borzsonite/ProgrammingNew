package bean_life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext ap = new AnnotationConfigApplicationContext(Config.class);
        ApplicationContext ap = new AnnotationConfigApplicationContext(Admin.class, DataBase.class, AdminService.class);
        ((AnnotationConfigApplicationContext)ap).close();


    }
}
