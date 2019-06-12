package Collections;

import java.util.Scanner;
import java.util.Stack;

//	Ввести с консоли число, занести его цифры в стек.

public class turn {



    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите количество элементов");
        int num = scanner.nextInt();
        System.out.println("введите элементы");

        Stack stack = new Stack();
        for (int i = 0; i < num; i++)
            stack.push(scanner.nextInt());

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
































