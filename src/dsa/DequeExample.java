package dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("1");
        deque.addFirst("2");

        deque.removeFirst();

        deque.addLast("3");
        deque.addLast("4");

        deque.removeLast();

        for (String element : deque) {
            System.out.println(element);
        }
    }
}
