package org.example;

// read https://www.geeksforgeeks.org/list-interface-java-examples/
// Sapratu tik daudz, cik šim uzdevumam vajadzēja, bet tur tālāk aiziet raķešu zinātne ar visiem Stack utt. :D

//TODO add several colors to colorList: "red", "green", ...

//TODO pick 3rd element in the list

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();

        // adding colors

        colorList.add("red");
        colorList.add("yellow");
        colorList.add("green");
        colorList.add("orange");
        colorList.add("black");
        colorList.add("blue");
        colorList.add("purple");

        // picking 3rd element

        System.out.println(colorList.get(2));

        // picking element at index 3

        System.out.println(colorList.get(3));


    }
}
