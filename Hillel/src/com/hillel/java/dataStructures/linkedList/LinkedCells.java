package com.hillel.java.dataStructures.linkedList;

/**
 * Created by Mfarsikov on 17.04.2015.
 */
public class LinkedCells {

    private Cell head;
    private int counter;
    private Cell tail;

    public void add(String value) {
        Cell next = new Cell(value);
        if (head == null) {
            head = next;
        }
        if (tail != null) {
            tail.setNext(next);
        }
        tail = next;
        counter++;
    }

    public String get(int index) {

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("size: " + size() + ", index: " + index);
        }
        Cell current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        return current.getValue();
    }

    public String toString() {
        String result = "[";
        Cell current = head;
        while (current != null) {
            result += current.getValue();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }
        result += "]";
        return result;
    }

    public int size() {
        return counter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedCells)) {
            return false;
        }
        LinkedCells other = (LinkedCells) obj;
        if (this.isEmpty() && other.isEmpty()) {
            return true;
        }
        if (this.size() != other.size()) {
            return false;
        }

        Cell thisCurrent = this.head;
        Cell otherCurrent = other.head;

        while (thisCurrent != null) {
            if (!thisCurrent.equals(otherCurrent)) {
                return false;
            }
            thisCurrent = thisCurrent.getNext();
            otherCurrent = otherCurrent.getNext();
        }
        return true;
    }

    private boolean isEmpty() {
        return head == null;
    }
}