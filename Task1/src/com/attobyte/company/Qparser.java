package com.attobyte.company;

import java.util.*;
import java.io.*;

public class Qparser{

    File qpaper;
    String lines[];
    String s="";
    String question[];
    String tempAns;

    Qparser(File qpaper){
        this.qpaper = qpaper;
    }

    //makes an array where each element carries a lines of the text file in questions folder
    public void splitArray() throws IOException {
        Scanner scanner= new Scanner(qpaper);
        while(scanner.hasNextLine()){
            s += scanner.nextLine();
        }
        lines = s.split("=");
    }

    //displays questions in the format shown in the quiz it splits the lines into questions options and answers
    public void displayQ(int index, int questionNumber){
        question = lines[index].split(",");
        tempAns = question[question.length-1];
        System.out.print(questionNumber+".)" );
        for(int i=0;i<question.length-1;i++){
            System.out.println(question[i]);
        }
    }

    //returns the number of questions
    public int qSize(){
        return lines.length;
    }

    //returns the answer for the answer displayed by means of the function displayQ
    public String getAnswer(){
        return tempAns;
    }
}
