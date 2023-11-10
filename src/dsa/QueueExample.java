package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");
        queue.offer("2");
        queue.offer("3");

        queue.poll();

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

