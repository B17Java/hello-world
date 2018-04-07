package com.level1.b17;
import com.level3.b17.Creater;
public class HelloWorld1 {
    public static void main(String[] args) {
        System.out.println("Introduce yourself!");
        Creater.make();
        Human st1 = new Human("Oleksandr", "Kuzmenko");
        st1.setEmail("okuzmenkoa@gmail.com");
        System.out.println(st1);

        Human st2 = new Human("Aleksey", "Shchehlov");
        st2.setEmail("alexey8800@gmail.com");
        st2.setPhone("+380931685958");
        Human st3 = new Human("Volodymyr", "Grinchenko");
        st3.setEmail("vlad5855051@gmail.com");
        System.out.println(st3);

    }
}
