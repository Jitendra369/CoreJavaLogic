package generic.classGenric;

public class Dog extends Animal{

    private String leg;

    public Dog() {
    }

    public Dog(String leg) {
        this.leg = leg;
    }

    public String getTotalLeg(){
        return "dog has four leg";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "leg='" + leg + '\'' +
                '}';
    }
}
