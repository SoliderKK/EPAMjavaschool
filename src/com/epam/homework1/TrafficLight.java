package com.epam.homework1;

import java.util.Scanner;

public class TrafficLight {
    static private String LightCheck(int light){
        if(light < 0){
            throw new NumberFormatException("Time can not be less than 0");
        }
        if(light <= 1){
            return "red";
        }
        else if(light <= 4){
            return "yellow";
        }
        else if(light <= 9){
            return "green";
        }
        else{
            throw new NumberFormatException("Impossible input");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time");
        int light = scanner.nextInt() % 10;
        System.out.println(TrafficLight.LightCheck(light));
    }

}
