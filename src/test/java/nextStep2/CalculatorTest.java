package nextStep2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator cal;
    @BeforeEach
    void setup(){
        cal = new Calculator();
    }
    @Test
    void add() {
        assertEquals(7,cal.add(3,4));
    }
}