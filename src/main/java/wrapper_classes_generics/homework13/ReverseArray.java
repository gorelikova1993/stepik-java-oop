package wrapper_classes_generics.homework13;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseArray implements Iterable<Integer> {
    private int[] array;

    public ReverseArray(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = array.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                if (!hasNext()) throw new NoSuchElementException();
                return array[index--];
            }
        };
    }
}
