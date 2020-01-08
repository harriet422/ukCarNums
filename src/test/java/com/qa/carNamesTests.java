package com.qa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class carNamesTests {
    @Test
    public void input_the_number_70() {
        //arrange
        int input = Integer.parseInt("70");
        int expResult = Integer.parseInt("21");
        carNames crna = new carNames();
        //act
        int result = crna.findNextNumber(input);
        //assert
        assertEquals(expResult, result);
    }
}