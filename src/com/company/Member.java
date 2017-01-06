package com.company;

import java.util.Scanner;

public class Member extends Regular{

    public Member(double w, int s, double h)
    {
        super(w, s, h);
    }


    public int aquaticCost = 10;
    public int classCost = 8;
    public double retailDiscount = 0.8;
    public double trainerRate = 20;
    public boolean cusType = false;

    Scanner input = new Scanner(System.in);
    public void Aquatics(int a)
    {
        System.out.println("Did you use any aquatic facilities today?");
        String aq = input.nextLine();
        if(aq.equalsIgnoreCase("yes"))
        {
            cRate += a;
        }
    }

}
