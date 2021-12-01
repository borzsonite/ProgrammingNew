package my_BeanPostProcessor_ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext am = new AnnotationConfigApplicationContext(Dollar.class, Euro.class, CurrencyBeanPostProcessor.class);
        System.out.println(am.getBean(Dollar.class));
        System.out.println(am.getBean(Euro.class));
    }
}
