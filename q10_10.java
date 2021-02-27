public class q10_10 {
    public static void main(String[] args) {
    }


}

class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {

        int[] temp = new int[elements.length - 1];
        int returnVal = elements[0];

        System.arraycopy(elements, 1, temp, 0, elements.length - 1);
        elements = temp;
        size--;
        return returnVal;
    }
}
