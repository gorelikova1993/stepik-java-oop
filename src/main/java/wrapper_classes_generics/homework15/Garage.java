package wrapper_classes_generics.homework15;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Garage implements Iterable<Car>{
    private Car[] cars;

    public Garage(int size) {
        cars = new Car[size];
    }

    public void putCar(Car unit, int i) throws ErrorBoxException {
        if (i > cars.length || i <= 0) throw new ErrorBoxException("ERROR");
        i-=1;
        if (cars[i] != null) {
            throw new ErrorBoxException("ERROR");
        }
        cars[i] = unit;
    }

    public Car getCar(int i) throws ErrorBoxException {
        if (i > cars.length || i <= 0) throw new ErrorBoxException("ERROR");
        i-=1;
        if (cars[i] == null) throw new ErrorBoxException("ERROR");
        Car temp = cars[i];
        cars[i] = null;
        return temp;
    }

    public boolean isFree(int number) {
        if (number > cars.length || number <= 0) {
            return false;
        }
        number-=1;
        return cars[number] == null;
    }

    public int getFreeBoxNumber(){
        for (int i = cars.length - 1; i >= 0; i--) {
            if (cars[i] == null) {
                return i + 1;
            }
        }
        return -1;
    }

    @Override
    public Iterator<Car> iterator() {
        return new Iterator<Car>() {
            private int currentIndex = cars.length - 1;
            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Car next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return cars[currentIndex--];
            }
        };
    }
}
