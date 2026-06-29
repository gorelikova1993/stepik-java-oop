package wrapper_classes_generics.homework8;

public class MySet<E> {
    private E[] list;
    private int k; //индекс свободной ячейки

    public MySet() {
        list = (E[]) new Object[10];
        k = 0;
    }

    public MySet(int size) {
        list = (E[]) new Object[size];
        k = 0;
    }

    public void add(E elem) {
        boolean isExisted = false;
        for (int i = 0; i < k; i++) {
            if (list[i].equals(elem)) {
                isExisted = true;
            }
        }
        if (!isExisted) {
            if (k >= list.length) {
                E[] tmp = (E[]) new Object[list.length * 3 / 2 + 1];
                for (int i = 0; i < list.length; i++) {
                    tmp[i] = list[i];
                }
                list = tmp;
            }
            list[k++] = elem;
        }
    }
    public void print() {
        for (int i = 0; i < k; i++) {
            System.out.println(list[i]);
        }
    }
}
