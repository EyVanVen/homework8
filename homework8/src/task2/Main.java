package task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Worker [] worker_parameters = new Worker [5];


        Worker wr = new Worker();
        Worker wr2 = new Worker();
        Worker wr3 = new Worker();
        Worker wr4 = new Worker();
        Worker wr5 = new Worker();

        System.out.println("Full name:");
        wr.fullName = in.nextLine();
        System.out.println("Post:");
        wr.post = in.nextLine();
        System.out.println("Year of employment:");
        wr.yearChek();

        System.out.println("Full name:");
        wr2.fullName = in.nextLine();
        System.out.println("Post:");
        wr2.post = in.nextLine();
        System.out.println("Year of employment:");
        wr2.yearChek();

        System.out.println("Full name:");
        wr3.fullName = in.nextLine();
        System.out.println("Post:");
        wr3.post = in.nextLine();
        System.out.println("Year of employment:");
        wr3.yearChek();

        System.out.println("Full name:");
        wr4.fullName = in.nextLine();
        System.out.println("Post:");
        wr4.post = in.nextLine();
        System.out.println("Year of employment:");
        wr4.yearChek();

        System.out.println("Full name:");
        wr5.fullName = in.nextLine();
        System.out.println("Post:");
        wr5.post = in.nextLine();
        System.out.println("Year of employment:");
        wr5.yearChek();

        String [] worker_names = {wr.fullName, wr2.fullName, wr3.fullName, wr4.fullName, wr5.fullName};

        Arrays.sort(worker_names);
        System.out.println(Arrays.toString(worker_names));

        for (int j = 0; j < worker_parameters.length; j++){
            if (worker_names[j] == wr.fullName){
                worker_parameters[j] = wr;
            }
        }

        for (int j = 0; j < worker_parameters.length; j++){
            if (worker_names[j] == wr2.fullName){
                worker_parameters[j] = wr2;
            }
        }

        for (int j = 0; j < worker_parameters.length; j++){
            if (worker_names[j] == wr3.fullName){
                worker_parameters[j] = wr3;
            }
        }

        for (int j = 0; j < worker_parameters.length; j++){
            if (worker_names[j] == wr4.fullName){
                worker_parameters[j] = wr4;
            }
        }

        for (int j = 0; j < worker_parameters.length; j++){
            if (worker_names[j] == wr5.fullName){
                worker_parameters[j] = wr5;
            }
        }



        System.out.println(Arrays.toString(worker_parameters));
    }
}
