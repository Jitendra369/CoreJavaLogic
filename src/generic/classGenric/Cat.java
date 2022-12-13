package generic.classGenric;

public class Cat extends  Animal{

    private String leg;

    public Cat(String leg) {
        this.leg = leg;
    }

    public String getCatLeg(){
        return "cat has four leg";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "leg='" + leg + '\'' +
                '}';
    }
}
