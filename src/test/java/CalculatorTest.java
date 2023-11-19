import org.example.calculator.Calculator;
import org.example.calculator.exeptions.NegativeArgumentException;
import org.example.calculator.exeptions.ZeroPurchaseCostException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    @DisplayName("calculating discount test")
    void testCalculatingDiscount(){
        assertEquals(11, Calculator.calculatingDiscount(10,1));
        assertThrows(NegativeArgumentException.class, ()->Calculator.calculatingDiscount(-1,2));
        assertThrows(NegativeArgumentException.class, ()->Calculator.calculatingDiscount(-2,1));
        assertThrows(NegativeArgumentException.class, ()->Calculator.calculatingDiscount(2,-1));
        assertThrows(ZeroPurchaseCostException.class, ()->Calculator.calculatingDiscount(0,2));

    }
}
