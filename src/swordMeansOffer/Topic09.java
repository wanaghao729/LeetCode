package src.swordMeansOffer;

import java.util.Stack;

//两个栈实现队列
public class Topic09 {
    Stack<Integer> input;
    Stack<Integer> output;
    public Topic09() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void appendTail(int value) {
        input.push(value);
    }

    public int deleteHead() {
        if (input.isEmpty() && output.isEmpty())    return -1;
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                int i = input.pop();
                output.push(i);
            }
        }
        return output.pop();
    }
}
