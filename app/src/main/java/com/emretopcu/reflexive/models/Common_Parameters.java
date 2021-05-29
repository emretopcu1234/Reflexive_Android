package com.emretopcu.reflexive.models;

public class Common_Parameters {
    public static final int NUMBER_OF_CLASSIC_LEVELS = 20;
    public static final int NUMBER_OF_ARCADE_LEVELS = 4;    // TODO degisecek.
    public static final int NUMBER_OF_SURVIVAL_LEVELS = 4;  // TODO degisecek.
    public static final int NUMBER_OF_LEADERBOARD_USERS = 20;
    public static final int NUMBER_OF_SURVIVAL_CHANCES = 3;

    public static final int SENSITIVITY_TIME = 100; // ms
    public static final int SENSITIVITY_UI = 50;    // ms
    public static final int COUNT_DOWN_LENGTH = 100000; // ms

    public static int CURRENT_CLASSIC_LEVEL;
    public static final int[] CLASSIC_TARGET = {10,15,30,40,50,60,70,80,90,100,100,100,100,100,100,100,100,100,100,100};    // TODO düzenlenecek.
    public static final int[] CLASSIC_TIME = {20,25,50,50,60,40,45,45,60,30,20,50,15,30,45,30,20,20,15,10};    // TODO düzenlenecek.
    public static final int[] CLASSIC_FRAGMENT_TYPE = {0,0,0,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2}; // 0->4x4, 1->5x5, 2->6x6  // TODO düzenlenecek.
    public static final int[] CLASSIC_FIRE_INTERVAL = {500,400,125,100,75};    // ms  TODO devamı doldurulacak.
    public static final int[] CLASSIC_NUMBER_OF_FIRING_BUTTONS = {5,4,5,5,6};   // TODO devamı doldurulacak.
    public static final int[] CLASSIC_GREEN_LIMIT = {4,4,4,4};  // TODO devamı doldurulacak.
    public static final int[] CLASSIC_YELLOW_LIMIT = {6,6,6,6}; // TODO devamı doldurulacak.
    public static final int[] CLASSIC_TOTAL_LIMIT = {10,10,10,10};  // TODO devamı doldurulacak.

//    public static final int[] ARCADE_TARGET = {10,20,30,40};   // TODO düzenlenecek.
//    public static final int[] ARCADE_TIME = {25,20,30,25};     // TODO düzenlenecek.
//    public static final int[] ARCADE_FRAGMENT_TYPE = {1,0,1,2};    // TODO düzenlenecek.
//    public static final int[] ARCADE_FIRE_INTERVAL = {400,300,250,200};    // ms  TODO devamı doldurulacak.
//    public static final int[] ARCADE_NUMBER_OF_FIRING_BUTTONS = {6,5,4,5};   // TODO devamı doldurulacak.
//    public static final int[] ARCADE_GREEN_LIMIT = {5,5,4,4};  // TODO devamı doldurulacak.
//    public static final int[] ARCADE_YELLOW_LIMIT = {7,7,6,6}; // TODO devamı doldurulacak.
//    public static final int[] ARCADE_TOTAL_LIMIT = {10,10,10,10};  // TODO devamı doldurulacak.

    public static final int[] ARCADE_TARGET = {10,20,30,40,50,60,60,60,60,60,60,60,60,60,70,70,70,80,80,90};   // TODO düzenlenecek.
    public static final int[] ARCADE_TIME = {25,20,30,25,15,10,15,10,15,10,15,10,15,10,15,10,15,10,15,10};     // TODO düzenlenecek.
    public static final int[] ARCADE_FRAGMENT_TYPE = {1,0,1,1,2,2,1,2,2,1,2,2,1,2,2,1,2,2,2,2};    // TODO düzenlenecek.
    public static final int[] ARCADE_FIRE_INTERVAL = {400,300,250,200,125,125};    // ms  TODO devamı doldurulacak.
    public static final int[] ARCADE_NUMBER_OF_FIRING_BUTTONS = {6,5,4,5,6,5};   // TODO devamı doldurulacak.
    public static final int[] ARCADE_GREEN_LIMIT = {5,5,4,4,4,4};  // TODO devamı doldurulacak.
    public static final int[] ARCADE_YELLOW_LIMIT = {7,7,6,6,6,6}; // TODO devamı doldurulacak.
    public static final int[] ARCADE_TOTAL_LIMIT = {10,10,10,10,10,10};  // TODO devamı doldurulacak.

    public static final int[] SURVIVAL_TIME = {25,20,30,25};     // TODO düzenlenecek.
    public static final int[] SURVIVAL_FRAGMENT_TYPE = {0,0,1,2};  // TODO devamı doldurulacak.
    public static final int[] SURVIVAL_FIRE_INTERVAL = {1200,1000,800,400};    // ms  TODO devamı doldurulacak.
    public static final int[] SURVIVAL_NUMBER_OF_FIRING_BUTTONS = {1,1,1,2};   // TODO devamı doldurulacak.
    public static final int[] SURVIVAL_GREEN_LIMIT = {5,5,4,4};  // TODO devamı doldurulacak.
    public static final int[] SURVIVAL_YELLOW_LIMIT = {7,7,6,6}; // TODO devamı doldurulacak.
    public static final int[] SURVIVAL_TOTAL_LIMIT = {10,10,10,10};  // TODO devamı doldurulacak.

//    public static final int[] SURVIVAL_TIME = {25,20,30,25,15,10,15,10,15,10,15,10,15,10,15,10,15,10,15,10};     // TODO düzenlenecek.
//    public static final int[] SURVIVAL_FRAGMENT_TYPE = {0,0,1,2};  // TODO devamı doldurulacak.
//    public static final int[] SURVIVAL_FIRE_INTERVAL = {400,300,250,200,125,125};    // ms  TODO devamı doldurulacak.
//    public static final int[] SURVIVAL_NUMBER_OF_FIRING_BUTTONS = {6,5,4,5,6,5};   // TODO devamı doldurulacak.
//    public static final int[] SURVIVAL_GREEN_LIMIT = {5,5,4,4,4,4};  // TODO devamı doldurulacak.
//    public static final int[] SURVIVAL_YELLOW_LIMIT = {7,7,6,6,6,6}; // TODO devamı doldurulacak.
//    public static final int[] SURVIVAL_TOTAL_LIMIT = {10,10,10,10,10,10};  // TODO devamı doldurulacak.

}

