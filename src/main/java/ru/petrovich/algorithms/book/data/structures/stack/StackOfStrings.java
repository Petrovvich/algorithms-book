package ru.petrovich.algorithms.book.data.structures.stack;

public class StackOfStrings {

    private ListNode first = null;

    public StackOfStrings() {

    }

    void push(String item) {
        ListNode oldFirst = first;
        first = new ListNode(item, oldFirst);
    }

    String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    boolean isEmpty() {
        return first != null;
    }

    int size() {
        return 0;
    }

    private final class ListNode {
        private final String item;
        private final ListNode next;

        public ListNode(String item, ListNode next) {
            this.item = item;
            this.next = next;
        }
    }
}
