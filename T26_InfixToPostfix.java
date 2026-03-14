import java.util.Stack;

class T26_InfixToPostfix {
    static int precedence(char c) {
        if (c == '+' || c == '-')
            return 1;
        if (c == '*' || c == '/')
            return 2;
        return -1;
    }

    static String convert(String exp) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (stack.peek() != '(')
                    result += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty() &&
                        precedence(c) <= precedence(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
        }

        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert("A=5*7-6/2-(5*2)"));
    }
}