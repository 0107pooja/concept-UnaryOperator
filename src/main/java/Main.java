import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int number1=205;
        int number2=200;

        int number3=40;
        int number4=50;

        UnaryOperators unaryOperators=new UnaryOperators();

        unaryOperators.PreIncrementNumber(number1);
        unaryOperators.PostIncrementNumber(number2);
        unaryOperators.PostDecrementNumber(number3);
        unaryOperators.PreDecrementNumber(number4);

    }
}





