package com.rahobbs.funfacts;

import android.graphics.Color;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Rachael on 6/1/2015.
 */
public class ColorWheel {
    //member variables

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#e91e63", // pink
    };

    //methods

    public int getColor(){
        String color = "";
        // randomly select a color
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        //convert the random number to a color from array
        color = mColors[randomNumber];
        return Color.parseColor(color);
    }


}
