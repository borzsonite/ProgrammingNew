package my_BeanPostProcessor_ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Currency
@Component
public class Euro {

    @CurrencyField
    private int[] value ={64, 63, 67, 61};

    @Value(value = "€EUR")
    private String sign;


    @Override
    public String toString() {
        return "Euro{" +
                "value=" + Arrays.toString(value) +
                '}';
    }
}
