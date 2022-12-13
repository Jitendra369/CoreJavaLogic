package lambdaexpression;

public class Mian {
    public static void main(String[] args) {
        int a =5;

//        override this method
//        int calculateArea(int sideLength);
        Square s = (int x)-> x * x;
        int i = s.calculateArea(a);
        System.out.println(i);

    }
}
