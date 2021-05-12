package com.attobyte.company;

public class Tutorial {
    //this is the tutorial it looks like ur computer is lagging if you use this on intellij but when run on cmd using normal javac, it looks really smooth and cool
    String lines[] = new String[11];
    public void displayIt() throws Exception{
        lines[0]="Welcome to the tutorial,\nthe tutorial aims at showing through the answering format";
        lines[1]=" ";
        lines[2]="When you get a question like...";
        lines[3]="What is the Capital of Uruguay?\na)Paraguay\nb)Montevideo\nc)Asuncion\nd)Bogota";
        lines[4]="You will input the option's alphabet, like this:-\nb";
        lines[5]=" ";
        lines[6]="If there is a question which has multiple answers like:-";
        lines[7]="What is the correct spelling:-\na)Agarwal\nb)Agrawal\nc)Agarwaal\nd)just write the first name and leave the rest";
        lines[8]="You will answer like this:-\nabcd";
        lines[9]=" ";
        lines[10]="There is no negative marking for incorrect answers because JEE gives all of us nightmares till date :-)";
        for(int i=0;i<lines.length;i++){
            if(i==3 || i==7){
                System.out.println(lines[i]);
                Thread.sleep(5000);
            }else{
                for(int j=0;j<lines[i].length();j++){
                    Thread.sleep(150);
                    System.out.print(lines[i].charAt(j));
                }
                System.out.println("");
            }
        }
    }
}
