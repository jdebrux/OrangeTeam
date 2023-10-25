import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {
    @DisplayName("TestOne")
    @Test
    public void testOne(){
        FizzBuzz phizz = new FizzBuzz();
        assertEquals("FizzBuzz, ", FizzBuzz.output_fizz(15));

    }
}
