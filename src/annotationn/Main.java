package annotationn;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
//        if (cat.getClass().isAnnotationPresent(VeryImportant.class)){
//            System.out.println("class is annoted");
//        }else{
//
//        }

       for (Method method : cat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmd.class)){
                try {
                    RunImmd annotation = method.getAnnotation(RunImmd.class);
                    for (int i=0;i< annotation.times();i++){
                    method.invoke(cat);
                    }

                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

//        for (Field field : cat.getClass().getDeclaredFields()) {
//            if (field.isAnnotationPresent(ImportantString.class)){
//                Object fieldObject = field.get(cat);
//                if (fieldObject instanceof String stringValue){
//                    System.out.println(stringValue.toUpperCase(Locale.ROOT));
//                }
//            }
//        }


    }
}
