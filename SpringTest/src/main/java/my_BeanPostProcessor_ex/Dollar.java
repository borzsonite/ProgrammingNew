package my_BeanPostProcessor_ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Currency
public class Dollar {

    @CurrencyField
    private int[] value ={34, 33, 37, 31};

    @Value(value = "$US")
    private String sign;

    @Override
    public String toString() {
        return "Dollar{" +
                "value=" + Arrays.toString(value) +
                '}';
    }
}
