package basic.super_key_init_param;

public class Test {
    public static void main(String[] args) {
        Employe employe = new Employe("jitebndra", "kadu", 1234);
        System.out.println("first name "+
                employe.getFirstName()+ "last Name "+
                employe.getLastName()+
                employe.getId());


    }
}
