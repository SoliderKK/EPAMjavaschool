package com.epam.homework1;

import java.util.Scanner;

public class TrafficLight {
    static private void LightCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time");
        int light = Integer.parseInt(scanner.nextLine()) % 10;
        if(light <= 1){
            System.out.println("red");
        }
        else if(light <= 4){
            System.out.println("yellow");
        }
        else {
            System.out.println("green");
        }
    }

    public static void main(String[] args) {
        TrafficLight.LightCheck();
    }

}
