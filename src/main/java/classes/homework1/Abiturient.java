package classes.homework1;

public class Abiturient {
    String surname;
    String name;
    int math;
    int physics;
    int lang;

     public double average() {
         return (math + physics + lang) / 3.0;
     }
     public void print() {
         System.out.print(surname + " " + name + " " + "математика = " + math + " физика = " + physics + " язык = " + lang
         + " средний балл = " );
         System.out.printf("%.1f\n",average());
     }

}
