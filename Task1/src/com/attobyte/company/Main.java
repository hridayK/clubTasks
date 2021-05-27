package com.attobyte.company;

import com.google.gson.Gson;

import java.io.File;
import java.util.Scanner;

public class Main {

    int points =0;

    QuestionModel qm = new QuestionModel();

    Gson gson = new Gson();

    Scanner answer = new Scanner(System.in);

    void takeGeo() throws Exception{

        File f = new File("geog.json");
        String data=qm.sendData(f);
        Geography obj[] = gson.fromJson(data,Geography[].class);
        Randomisation randomisation = new Randomisation(obj.length);
        int randomOrder[] = randomisation.ranGen();

        for(int i=0;i<obj.length;i++){
            obj[randomOrder[i]].prinIt();
            //input answer
            String ians = answer.nextLine();
            if(obj[randomOrder[i]].getAnswer().equalsIgnoreCase(ians))
                points++;
        }
        System.out.println("You scored "+points+" out of "+obj.length);
        points=0;
        Scanner cho = new Scanner(System.in);
        System.out.println("\nWould you like to ...\n1) Take the same quiz\n2) Go the the next topic\n3) Go back");
        int choice = cho.nextInt();
        restart:{
        switch (choice){
            case 1:
                takeGeo();
                break;
            case 2:
                takeGk();
                break;
            case 3:
                break;
            default:
                System.out.println("\nIncorrect input enter again...\n");
                Thread.sleep(1000);
                break restart;
        }}
    }

    void takeGk() throws Exception{

        File f = new File("gk.json");
        String data=qm.sendData(f);
        GeneralKnowledge obj[] = gson.fromJson(data,GeneralKnowledge[].class);
        Randomisation randomisation = new Randomisation(obj.length);
        int randomOrder[] = randomisation.ranGen();

        for(int i=0;i<obj.length;i++){
            obj[randomOrder[i]].prinIt();
            //input answer
            String ians = answer.nextLine();
            if(obj[randomOrder[i]].getAnswer().equalsIgnoreCase(ians))
                points++;
        }
        System.out.println("You scored "+points+" out of "+obj.length);
        points=0;
        Scanner cho = new Scanner(System.in);
        System.out.println("\nWould you like to ...\n1) Take the same quiz\n2) Go the the next topic\n3) Go back");
        int choice = cho.nextInt();
        restart:{
            switch (choice){
                case 1:
                    takeGk();
                    break;
                case 2:
                    takeGeo();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nIncorrect input enter again...\n");
                    Thread.sleep(1000);
                    break restart;
            }}
    }

    public static void main(String[] args) throws Exception{

        Main main = new Main();
        Tutorial ttl = new Tutorial();
        Scanner sc = new Scanner(System.in);

        boolean keepiton = true;
        goback:{
            while (keepiton){
                System.out.println("MAD Club Task1 .... \n1.) Tutorial\n2.) Start Game\n3.) Exit");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        ttl.displayIt();
                        break;
                    case 2:
                        System.out.println("choose a topic:-\n1.) Geography\n2.) General Knowledge\n3.) Go Back");
                        int n = sc.nextInt();
                        if(n==1)
                            main.takeGeo();
                        else if(n==2)
                            main.takeGk();
                        else
                            break goback;
                        break;
                    case 3:
                        keepiton=false;
                        break;
                    default:
                        System.out.println("\nIncorrect input enter again...\n");
                        Thread.sleep(1000);
                        break goback;
                }
            }
        }
    }
}
