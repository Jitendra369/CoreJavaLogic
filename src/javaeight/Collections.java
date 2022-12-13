package javaeight;

import javaeight.service.EmployeService;
import javaeight.service.MyConsumer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Collections {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i=0;i<=10;i++){
            numberList.add(i);
        }

        numberList.forEach(i-> System.out.println(i));
//        new Thread(new Runnable(){
//            @Override
//            public void run(){
//
//            }
//        });



//        printing the list
//        Iterator<Integer> iterator = numberList.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }

//        List<Employee> list = new EmployeService().getEmployee();


//        list.forEach(new Consumer<Employee>() {
//            @Override
//            public void accept(Employee employee) {
//                System.out.println(employee.getName());
//            }
//        });

//        numberList.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });


    }
}
