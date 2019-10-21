package com.spartaglobal.mavenexample1.collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class ExampleSets {
    private Set<String> newSet = new HashSet<String>();

    public void workingwithourset() {
        newSet.add("cheese");
        newSet.add("Rice");
        newSet.add("Bread");
    }
    public void printSet() {

        System.out.println(newSet.contains("bread"));

        for (String shoppingItem : newSet) {
            System.out.println(shoppingItem);
        }
    }}



