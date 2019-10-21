package com.spartaglobal.mavenexample1.collectionexamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeQueues{

    private Deque<String>carpark = new LinkedList<>();

    public ExampleDeQueues () {
        carpark.add("car1");
        carpark.add("car2");
        carpark.add("car3");
    }


        public void workingwithourDequeue(){
//        for (String car : carpark){
//            System.out.println(car);
            System.out.println(carpark.peekLast());
            System.out.println(carpark.peek());
        }

    }

