import java.util.Stack;

public class parentesis {
    private static boolean verificador(String s) {
        Stack<Character> apertura = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                apertura.push(c);
            }
            else if (c == ')' && !apertura.isEmpty() && apertura.peek() == '(') {
                apertura.pop();
            } else if (c == '}' && !apertura.isEmpty() && apertura.peek() == '{') {
                apertura.pop();
            } else if (c == ']' && !apertura.isEmpty() && apertura.peek() == '[') {
                apertura.pop();
            }
            else {
                return false;
            }
        }
        return apertura.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(verificador("([])[]"));
        System.out.println(verificador("{[]}"));
    }
}
