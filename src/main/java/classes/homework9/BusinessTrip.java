package classes.homework9;

import java.util.Objects;

public class BusinessTrip {
    private final int daily = 25;
    private String fi;
    private int transportCost;
    private int numberOfDays;

    public BusinessTrip() {
    }

    public BusinessTrip(String fi, int transportCost, int numberOfDays) {
        this.fi = fi;
        this.transportCost = transportCost;
        this.numberOfDays = numberOfDays;
    }

    public BusinessTrip(String fi) {
        this.fi = fi;
    }

    public BusinessTrip(BusinessTrip other) {
        this.fi = other.getFi();
        this.transportCost = other.getTransportCost();
        this.numberOfDays = other.getNumberOfDays();
    }

    public int getDaily() {
        return daily;
    }

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public int getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(int transportCost) {
        this.transportCost = transportCost;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }



    public int getTotal() {
        return this.getTransportCost() + this.getNumberOfDays() * daily;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BusinessTrip that = (BusinessTrip) o;
        return this.getTotal() == that.getTotal();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getTotal());
    }

    @Override
    public String toString() {
        return  fi + ";" + numberOfDays +  ";" + transportCost + ";" + this.getTotal();
    }

    public void show() {
        System.out.println("Суточные = " + daily);
        System.out.println("Фамилия Имя = " + fi);
        System.out.println("Транспортные расходы = " + transportCost);
        System.out.println("Количество дней = " + numberOfDays);
        System.out.println("Итого расходы = " + getTotal());
    }
}
