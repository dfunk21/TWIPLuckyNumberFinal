package com.company;

/**
 * Created by df377 on 10/10/16.
 */
public class randomGenerator {

    public String name;
    public int rd;

    public randomGenerator (String r)
    {
        name = r;
        rd = perfectRandom();
    }
    //Above is the constructor

    public int perfectRandom()
    {
        int random = (int)(Math.random() * 46340 + 1);
        int square = (int)(Math.pow(random, 2));
        return square;
    }


}
