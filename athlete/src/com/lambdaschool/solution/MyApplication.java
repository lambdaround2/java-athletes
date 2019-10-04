package com.lambdaschool.solution;

public class MyApplication implements Processor
{

    private AthleteCreation athleteSrv;

    public MyApplication(AthleteCreation athlete)
    {
        this.athleteSrv = athlete;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        athleteSrv.displayAthlete();
        System.out.println("************\n");
    }
}