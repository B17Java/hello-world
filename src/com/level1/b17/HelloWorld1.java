package com.level1.b17;
import com.level3.b17.Creater;
public class HelloWorld1 {
    public static void main(String[] args) {
        System.out.println("Introduce yourself!");
        Creater.make();
        Human st1 = new Human("Oleksandr", "Kuzmenko");
        st1.setEmail("okuzmenkoa@gmail.com");
        System.out.println(st1);



}
