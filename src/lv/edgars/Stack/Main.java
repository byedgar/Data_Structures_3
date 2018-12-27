package lv.edgars.Stack;

public class Main {
    public static void main(String[] args) {
        classStack stack = new classStack(100);
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');
        stack.push('F');

        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.getSize());

        int tmpSize = stack.getSize();
        for (int i = 0; i < tmpSize; i++) {
            System.out.println(stack.pop());
        }

        /**
         *Создать программу, которая переворачивает вводимые строки (читает справа налево).
         */
        System.out.println();
        System.out.println("Создать программу, которая переворачивает вводимые строки (читает справа налево).");
        String text = "abc def ghi!";
        String reverse1 = new StringBuffer(text).reverse().toString();
        int textSize = text.length();
        System.out.println("1 variant");
        System.out.print(reverse1);

        classStack text2 = new classStack(textSize);
        for (int i = 0; i < textSize; i++) {
            text2.push(text.charAt(i));
        }
        System.out.println();
        System.out.println("2 variant");
        for (int i = 0; i < textSize; i++) {
            System.out.print(text2.pop());
        }


    }
}
