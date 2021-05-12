package com.attobyte.company;

import java.io.*;
import java.util.Scanner;

public class Quiz {

    File file;

    Quiz(File file){
        this.file = file;
    }

    int points = 0;
    //this function conducts quiz and manages the poitns system and all..
    public void conductQuiz() throws IOException {
        Qparser qp = new Qparser(file);
        Scanner takeAnswer = new Scanner(System.in);
        qp.splitArray();
        String answer;
        Randomisation rn = new Randomisation(qp.qSize());
        int randomIndex[] = rn.ranGen();
        for(int i=0;i < randomIndex.length;i++){
            qp.displayQ(randomIndex[i],(i+1));
            answer=takeAnswer.nextLine();
            if(answer.equalsIgnoreCase(qp.getAnswer())){
                points++;
            }
        }
        System.out.println("You got "+points+" out of "+qp.qSize());
        points=0;
    }
}
