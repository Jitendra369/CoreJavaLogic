package lambdaexpression.advance;

public class MainClass {
    public static void main(String[] args)  {
        Runnable thread1 = () -> {
//            thread body
            for (int i=0;i<10;i++){
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Thread thread = new Thread(thread1);
        thread.setName("threading");
        thread.start();
    }
}
