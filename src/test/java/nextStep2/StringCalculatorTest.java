package nextStep2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator cal;
    @BeforeEach
    void setup(){
        cal = new StringCalculator();
    }
    @Test
    void add() {
        try {
            assertEquals(5,cal.add("//;\n3;2"));
            assertEquals(5,cal.add("-1,6"));
            assertEquals(7,cal.add("-1:6,2"));
        }catch (RuntimeException e){

        }

    }
}