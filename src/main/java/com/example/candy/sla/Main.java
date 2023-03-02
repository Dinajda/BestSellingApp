package com.example.candy.sla;

public class Main {

    public static void main(String[] args) throws Exception {

        Candy.eat();

        for (BestSelling best : BestSelling.getAllBestSelling())
            System.out.println(best);

    }
}