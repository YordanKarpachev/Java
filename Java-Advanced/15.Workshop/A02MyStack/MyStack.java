package WorkShopLAB;

import java.util.function.Consumer;

public class MyStack {
    private static class Node {
        public Node(int element, Node prev) {
            this.element = element;
            this.prev = prev;
        }

        private int element;
        private Node prev;
    }


    private int size;

    private Node top;


    public MyStack() {
    }

    public void push(int element) {
        this.top = new Node(element, this.top);
        size++;

    }

    public void forEach(Consumer<Integer> consumer) {

        Node current = this.top;

        while (current != null){
            consumer.accept(current.element);
            current = top.prev;

        }


    }

   public int pop() { //premaxva posledniq element

        int element = this.top.element;

        this.top = this.top.prev;
        this.size--;


        return element;
    }

    public int peek() { // poglejda

        return this.top.element;
    }
}