package wrapper_classes_generics.homework4;

public class Dog {
    private Collar collar;
    private String nickname;
    private String breed;

    private class Collar {
        private String colour;
        private double size;
        private Collar collar;

        public Collar(String colour, double size) {
            this.colour = colour;
            this.size = size;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }
    }

    public Dog(String nickname, String breed, String color, double size) {
        this.nickname = nickname;
        this.breed = breed;
        this.collar = new Collar(color, size);

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int compareTo(Dog two) {
        if (this.collar.getSize() > two.collar.getSize()) {
            return 1;
        } else if (this.collar.getSize() < two.collar.getSize()) {
            return -1;
        } else {
            return 0;
        }
    }
}
