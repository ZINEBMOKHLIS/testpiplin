import com.example.demo.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatortest {
    SimpleCalculator  calculator=new SimpleCalculator();
    @Test
      void twoPlusTwoShouldEqualFour(){
        int expected;
        int numberA;
        int numberB;
        assertEquals(expected=4, calculator.add(numberA=2,numberB=2));

    }
}
