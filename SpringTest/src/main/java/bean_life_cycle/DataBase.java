package bean_life_cycle;

import org.springframework.stereotype.Component;

@Component
public class DataBase {

    public boolean saveAdmin(Admin admin) {
        System.out.println(admin + " saved to db...");
        return true;
    }

    public void close() {
        System.out.println("connection closed...");
    }
}
