import java.util.*;
enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        switch(operation) {
            case ADD:
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                result = num1 / num2;
                break;
        }

        return result;
    }

    public static int printValuesandReturnSum(int[] input){
        int sum = 0;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}