package bean_life_cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AdminService {

    private Admin admin;
    private DataBase dataBase;


    public AdminService() {
    }

    @PostConstruct
    public void init() {
        dataBase.saveAdmin(admin);
    }

    @Autowired
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Autowired
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @PreDestroy
    public void close() {
        System.out.println("DB is closing...");
    }
}
