package strq;

/**
 * Access Code 2.1
 * Ramona Harrison
 * SimpleStringQueue.java
 */

public class SimpleStringQueue implements StringQueue {
    private String stringQueue;

    public SimpleStringQueue() {
        this.stringQueue = "";
    }

    @Override
    public int length() {
        return stringQueue.length();
    }

    @Override
    public void enqueue(String string) {
        stringQueue += string;
    }

    @Override
    public String dequeue(int length) {
        String dequeue = "";
        int i;

        for (i = 0; i < length; i++) {
            dequeue += stringQueue.charAt(i);
        }

        stringQueue = stringQueue.substring(i);
        return dequeue;
    }

    @Override
    public String toString() {
        return this.stringQueue;
    }
}
