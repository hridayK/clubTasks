package com.attobyte.company;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

abstract public class Topic {

    @SerializedName("question")
    private String q;
    @SerializedName("option1")
    private String a;
    @SerializedName("option2")
    private String b;
    @SerializedName("option3")
    private  String c;
    @SerializedName("option4")
    private String d;
    @SerializedName("answer")
    private String ans;

     Topic(String q, String a, String b, String c, String d, String ans){
        this.q=q;
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.ans=ans;
     }

     public void prinIt(){
         System.out.println(q+"\n"+a+"\n"+b+"\n"+c+"\n"+d);
     }

     public String getAnswer(){
         return ans;
     }
}
