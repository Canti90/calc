import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        float result;

        char operation;
        boolean exitFromCycle;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите первое число:");
            firstNumber = sc.nextInt();

            System.out.println("Выберите операцию '+' '-' '*' '/' :");

            while (true){

                operation = sc.next().charAt(0);
                if (operation != '+' & operation !=  '-' & operation != '*' & operation != '/'){
                    System.out.println("вы ввели отсутсвующию операцию, введите одну из + - * / ");
                } else break;

            }

            System.out.println("Введите второе число:");
            secondNumber = sc.nextInt();

            if (operation == '+') {
                result = firstNumber + secondNumber;
            } else if (operation == '-') {
                result = firstNumber - secondNumber;
            } else if (operation == '*') {
                result = firstNumber * secondNumber;
            } else result = (float) firstNumber / secondNumber;

            System.out.println("Результат " + operation + " :" + result);

            System.out.println("Введите Y для продолжения, либо любой другой символ для выхода :");
            exitFromCycle = sc.next().equalsIgnoreCase("Y");

        } while (exitFromCycle);


    }
}
