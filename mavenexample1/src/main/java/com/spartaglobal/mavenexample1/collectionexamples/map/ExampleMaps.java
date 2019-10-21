package com.spartaglobal.mavenexample1.collectionexamples.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExampleMaps {

    private Map<Integer, String> studentsInClass= new HashMap<>();

    public ExampleMaps(){
        studentsInClass.put(1,"Ed");
        studentsInClass.put(2,"Nick");
        studentsInClass.put(3,"Naz");

    }


    public String returnValue (int KeyNum){
        return studentsInClass.get(KeyNum);
    }

    public void loopThroughMap(){
        Collection<String> value = studentsInClass.values();
        for (String data: value){
            System.out.println(data);
        }

//        studentsInClass.keySet();
//        studentsInClass.
   }
}
