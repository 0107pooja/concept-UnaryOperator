import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnaryOperatorsTest {


    @Test
    void shouldCheckPreIncrementNumber(){
        UnaryOperators unaryOperators=new UnaryOperators();
        int expectedOutput=45;
        int actualOutput = unaryOperators.PreIncrementNumber(45);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldCheckPostIncrementNumber(){
        UnaryOperators unaryOperators=new UnaryOperators();
        int expectedOutput=45;
        int actualOutput = unaryOperators.PostIncrementNumber(45);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldCheckPostDecrementNumber(){
        UnaryOperators unaryOperators=new UnaryOperators();
        int expectedOutput=45;
        int actualOutput = unaryOperators.PostDecrementNumber(45);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldCheckPreDecrementNumber(){
        UnaryOperators unaryOperators=new UnaryOperators();
        int expectedOutput=45;
        int actualOutput = unaryOperators.PreDecrementNumber(45);
        assertEquals(expectedOutput, actualOutput);
    }

}