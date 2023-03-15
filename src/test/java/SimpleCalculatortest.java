import com.example.demo.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatortest {
    @Test
    void twoPlusTwoShouldEqualFour(){
        var calculator=new SimpleCalculator();
        int numberA;
        int numberB ;
        int expected;
        assertEquals(expected=4, calculator.add( numberA= 2,numberB= 2));
    }
}
