public class UnaryOperators {
        public static int PreIncrementNumber(int number1) {


            System.out.println("Before PreIncrement: " + number1);

            // PreIncrement operator
            int preIncrementedNumber=++number1;

            System.out.println("After PreIncrement = : " + preIncrementedNumber);

            return preIncrementedNumber;
        }


    public static int PostIncrementNumber(int number2) {

        System.out.println("Before PostIncrement: " + number2);

            // PostIncrement operator
           int postIncrementedNumber=number2++;

            System.out.println("After PostIncrement = : " + postIncrementedNumber);
        return postIncrementedNumber;
    }



    public static int PreDecrementNumber(int number3) {

        System.out.println("Before PreDecrement: " + number3);

        //PreDecrement operator
        int preDecrementNumber=--number3;

        System.out.println("After PreDecrement = : " + preDecrementNumber);
        return preDecrementNumber;
    }

    public static int PostDecrementNumber(int number4) {

        System.out.println("Before PostDecrement: " + number4);

        // PostDecrement operator
        int postDecrementNumber=number4--;

        System.out.println("After PostDecrement = : " + postDecrementNumber);
        return postDecrementNumber;
    }

}

