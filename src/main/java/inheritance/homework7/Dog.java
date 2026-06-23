package inheritance.homework7;

 class Dog extends Pet {
     private String breed;

     public Dog(String nickname, int age, String breed) {
         super(nickname, age);
         this.breed = breed;
     }

     public String getBreed() {
         return breed;
     }

     public void setBreed(String breed) {
         this.breed = breed;
     }

     @Override
     public String toString() {
         return super.getNickname() + ";" + super.getAge() + ";" + breed;
     }

     @Override
     void getNoise() {
         System.out.println("Гав-гав!");
     }
 }
