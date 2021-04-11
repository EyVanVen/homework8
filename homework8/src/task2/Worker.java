package task2;

import java.util.*;

public class Worker {
    String fullName, post;
    int year;

    public void yearChek(){
        Scanner in = new Scanner(System.in);
        try {
            year = in.nextInt();
        } catch (Exception e){
            System.out.println("Invalid format. Please, retry");
            yearChek();
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + fullName + '\'' +
                ", post='" + post + '\'' +
                ", experience='" + (2021 - year) + '\'' +
                '}';
    }
}