package com.attobyte.company;

import java.io.*;
import java.util.*;

public class Main {

    //files from which the questions,options and answers get parsed from
    File q1 = new File(".\\questions\\geography.txt");
    File q2 = new File(".\\questions\\generalKnowledge.txt");

    Quiz geo = new Quiz(q1);
    Quiz gk = new Quiz(q2);

    /* takeGeo and takeGk were made to add the feature of repeating the same quiz or jumping to the other
    * I tried implementing the feature by using break as goto but it didn't really sit well in presence of the switch statement  */
    void takeGeo() throws IOException {
        geo.conductQuiz();
        System.out.println("\n1.)retry\n2.)next topic\n3.)Go Back");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==1)
            takeGeo();
        else if(n==2)
            takeGK();
        else
            System.out.println("\n");
    }

    void takeGK()throws IOException{
        gk.conductQuiz();
        System.out.println("\n1.)retry\n2.)next topic\n3.)Go Back");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==1)
            takeGK();
        else if(n==2)
            takeGeo();
        else
            System.out.println("\n");
    }

    public static void main(String[] args) throws Exception {

        Tutorial ttl = new Tutorial();

        Main object = new Main();
        Scanner sc = new Scanner(System.in);

        boolean keepiton = true;
        int choice;
        goback:{
            while (keepiton) {
                System.out.println("Welcome ot MAD club task 1....\n1.)Tutorial\n2.)Take the quiz\n3.)Exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        ttl.displayIt();
                        break;
                    case 2:
                        System.out.println("Please choose from the given topic:\n1.)Geography\n2.)General Knowledge\n3.)Go Back");
                        int n = sc.nextInt();
                        if (n==1)
                            object.takeGeo();
                        else if(n==2)
                            object.takeGK();
                        else if(n==3)
                            break goback;
                        else{
                            System.out.println("\ninorrect input\n");
                            break goback;
                        }
                        break;
                    case 3:
                        keepiton=false;
                        break;
                    default:
                        System.out.println("\nincorrect input\n");
                        break goback;
                }
            }
        }
    }
}