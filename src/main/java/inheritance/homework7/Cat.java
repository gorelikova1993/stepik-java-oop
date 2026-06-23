package inheritance.homework7;

 class Cat extends Pet {
     private String color;

     public Cat(String nickname, int age, String color) {
         super(nickname, age);
         this.color = color;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     @Override
     public String toString() {
         return super.toString() + ";" + color;
     }

     @Override
     void getNoise() {
         System.out.println("Мяу-мяу!");
     }


 }
