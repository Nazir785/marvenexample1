package com.spartaglobal.mavenexample1.collectionexamples;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {
    private List<String> hobbies = new ArrayList<>();

    public ExampleLists() {
                workingwithourList();
    }
    private void workingwithourList(){
        hobbies.add("football");
        hobbies.add("swimming");
        hobbies.add("Boxing");

    }

    public void printlist(){
        System.out.println("we are using iterator ....");
        for (Iterator<String>iterator  = hobbies.iterator(); iterator.hasNext();){
   String element= iterator.next();
   System.out.println(element);


   }
    }
}
