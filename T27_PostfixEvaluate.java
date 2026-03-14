import java.util.Stack;

class T27_PostfixEvaluate {
    static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c))
                stack.push(c - '0');
            else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("4532+3-*+"));
    }
}