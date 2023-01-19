package basic.super_key_init_param;

public class Employe extends Person {
    private int id;

    public Employe(String firstName, String lastName, int id) {
        super(firstName, lastName);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                '}';
    }
}
