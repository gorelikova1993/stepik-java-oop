package exceptions.homework8;

public class Stack {
    private char[] array;
    private int top;

    public Stack(int size) {
        array = new char[size];
        top = - 1;
    }

    public void push(char c) throws StackException {
        if (top == array.length - 1) throw new StackException("Стек заполнен!");
        array[++top] = c;
    }

    public char pop() throws StackException {
        if (top == -1) throw new StackException("Попытка извлечь из пустого стека!");
        return array[top--];
    }

    public void print() throws StackException {
        if (top == -1) throw new StackException("Стек пуст");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void clear() {
        top = -1;
    }
}
