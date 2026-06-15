package classes.homework3;

public class BusinessTrip {
    final int daily = 25;
    String fi;
    int transportCost;
    int numberOfDays;

    public int getTotal() {
        return transportCost + numberOfDays * daily;
    }
    public void show() {
        System.out.println("Суточные = " + daily);
        System.out.println("Фамилия Имя = " + fi);
        System.out.println("Транспортные расходы = " + transportCost);
        System.out.println("Количество дней = " + numberOfDays);
        System.out.println("Итого расходы = " + getTotal());
    }
 }
