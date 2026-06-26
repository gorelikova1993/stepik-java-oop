package exceptions.homework7;

public class Queue {
    private char[] array;
    private int tail;

    public Queue(int n) {
        array = new char[n];
        tail = -1;
    }

    public void add(char c) throws QueueException {
        if (tail == array.length - 1) throw new QueueException("Буфер заполнен!");
        array[++tail] = c;
    }

    public char poll() throws QueueException {
        if (tail == -1) throw new QueueException("Извлечение из пустой очереди!");
        char tmp = array[0];
        for (int i = 0; i < tail; i++) {
            array[i] = array[i + 1];
        }
        tail--;
        return tmp;
    }

    public void print() {
        for (int  i = 0; i <= tail; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public void clear() {
        tail = -1;
    }
}
