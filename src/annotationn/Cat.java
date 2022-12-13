package annotationn;

@VeryImportant
public class Cat {

    @ImportantString
    private String name;
    private int age;

    public Cat() {
    }

    @RunImmd(times = 3)
    public void getCatSound(){
        System.out.println("mea");
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
