package javaeight;

public class Employee {
    private String name;
    private int age;
    private boolean eligible;

    public Employee() {
    }

    public Employee(String name, int age, boolean eligible) {
        this.name = name;
        this.age = age;
        this.eligible = eligible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eligible=" + eligible +
                '}';
    }
}
