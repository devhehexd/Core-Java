import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        String[] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        Stack<String> stack = new Stack<>(); //후입선출
        for (String element : array) {
            stack.push(element);
        }
        //System.out.println(stack.peek()); //가르키기만 하기때문에 변화가 없음
        //System.out.println(stack.pop()); //뽑기때문에 없어짐

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
