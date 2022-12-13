package com.resume.upload;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) throws IOException {
//    String path =
        File file = new File("D:\\fileHandling\\file.txt");
        if (file.createNewFile()){
            System.out.println("File is created : name : "+file.getName());
            System.out.println("File is created : name : "+file.getAbsolutePath());
            System.out.println("File is created : name : "+file.getParent());
            System.out.println("File is created : name : "+file.getPath());

        }else{
            System.out.println("unable to create a file");
        }

}
}
