package com.spartaglobal.mavenexample1.collectionexamples;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueues {

    private Queue<String>stringsQueue = new LinkedList<>();

    public ExampleQueues(){
        stringsQueue.add("one");
        stringsQueue.add("two");
        stringsQueue.add("three");

    }

    public void queueRunner (){
        System.out.println(stringsQueue.peek());
        System.out.println(stringsQueue.poll());
        System.out.println(stringsQueue.remove());
        for (String iteminqueue: stringsQueue){
            System.out.println(iteminqueue);
        }
    }
}
