package com.spartaglobal.mavenexample1;

import com.spartaglobal.mavenexample1.collectionexamples.ExampleDeQueues;
import com.spartaglobal.mavenexample1.collectionexamples.ExampleLists;
import com.spartaglobal.mavenexample1.collectionexamples.ExampleQueues;
import com.spartaglobal.mavenexample1.collectionexamples.ExampleSets;
import com.spartaglobal.mavenexample1.collectionexamples.map.ExampleMaps;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
//        ExampleSets exampleSets = new ExampleSets();
//        exampleSets.workingwithourset();
//        exampleSets.printSet();

//        ExampleLists exampleLists = new ExampleLists();
//        exampleLists.printlist();


//        ExampleQueues exampleQueues = new ExampleQueues();
//        exampleQueues.queueRunner();
//
//       ExampleDeQueues exampleDeQueues = new ExampleDeQueues();
//        exampleDeQueues.workingwithourDequeue();

       ExampleMaps exampleMaps = new ExampleMaps();
        System.out.println(exampleMaps.returnValue(2));
             exampleMaps.loopThroughMap();
    }
}

//        System.out.println( "Hello World!" );
//
//        JavaAPIExamples javaAPIExamples = new JavaAPIExamples();
//        javaAPIExamples.mathExamples();
//    }

