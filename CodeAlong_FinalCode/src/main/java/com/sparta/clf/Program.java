package com.sparta.clf;

public class Program {
    public static void main(String[] args)
    {
        int timeOfDay = 21;
        var myGreeting = greeting(timeOfDay);
        System.out.println(myGreeting);
    }

    public static String greeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12)
        {
            greeting = "Good morning!";
        }
        else if (timeOfDay > 12 && timeOfDay <= 18)
        {
            greeting = "Good afternoon!";
        }
        else
        {
            greeting = "Good evening!";
        }
        return greeting;
    }
}
