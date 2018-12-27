package lv.edgars.Brackets;

import java.util.Stack;

public class BracketValidator {
    private String text;
    private static int errorCount;

    public BracketValidator(String text) {
        this.text = text;
    }

    public void check() {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            switch (currentChar) {
                case '(':
                case '{':
                case '[':
                    stack.push(currentChar);
                    break;
                case ')':
                case '}':
                case ']':
                    checkChar(stack, i, currentChar);
                    break;
                default:
                    break;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }

    private void checkChar(Stack<Character> stack, int i, char currentChar) {
        if (stack.isEmpty()) {
            System.out.println("Error: " + currentChar + " at " + i);
            errorCount++;
            return;
        }

        Character ch = stack.pop();
        if ((ch == '(' && currentChar != ')')
                || (ch == '{' && currentChar != '}')
                || (ch == '[' && currentChar != ']')) {

            System.out.println("Error: " + currentChar + " at " + i);
            errorCount++;
        }
    }

    public static void main(String[] args) {
        String textCode = "{0}[1}{2}{3}[4}{5}{6}{7]{8}[9}";
        BracketValidator validator = new BracketValidator(textCode);
        validator.check();
        System.out.println("Error count: " + errorCount );
    }
}