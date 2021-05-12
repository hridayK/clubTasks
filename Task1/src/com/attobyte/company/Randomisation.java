package com.attobyte.company;

import java.util.*;

public class Randomisation {

    int size;

    Randomisation(int size){
        this.size=size;
    }

    //This returns an array which carries randomly arranged indexes of the question elements ensuring there is no repition of questions when they appear in a random order
    public int ranGen()[]{
        int ranarr[] = new int[size];
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<size;i++){
            nums.add(i);
        }

        Random random = new Random();
        int w=0;
        while(nums.size()>0){
            int x = random.nextInt(nums.size());
            ranarr[w] = nums.get(x);
            nums.remove(x);
            w++;
        }

        return ranarr;
    }

}
