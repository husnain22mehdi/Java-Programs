package com.company;

//Creating our own class IntegerSet
public class IntegerSet {
    //Declaring reference type field
    boolean [] arr;

    //No arg constructor for initializing the array
    IntegerSet(){
        arr = new boolean[100];
    }
    //Parameterized constructor initializing the array and calling insertElement method
    IntegerSet(int...x){
        arr = new boolean[100];
        insertElement(x);
    }

    //Method for inserting elements in the array
    public void insertElement(int ... a){
        for (int i : a){
            arr[i] = true;
        }
    }
    //Method for deleting elements in the array
    public void deleteElement(int ... a){
        for (int i : a){
            arr[i] = false;
        }
    }

    //Method for taking union of two arrays
    public static boolean [] Union(boolean [] a, boolean [] b){
        boolean [] res_arr = new boolean[100]; //Creating res_arr to store the union array
        for (int i = 0 ; i < 100; i++){
            res_arr[i] = a[i] || b[i];
        }
        return res_arr;
    }
    //Method for taking intersection of two arrays
    public static boolean [] Intersection(boolean [] a, boolean [] b){
        boolean [] res_arr = new boolean[100]; //Creating res_arr to store the intersection array
        for (int i = 0 ; i < 100; i++){
            res_arr[i] = a[i] && b[i];
        }
        return res_arr;
    }

    //Method for comparing two arrays
    public static boolean isEqualto(boolean [] a, boolean [] b){
        boolean result = true;
        for (int i = 0 ; i < 100; i++){
            if (a[i] != b[i]){
                result = false;
                break;
            }
        }
        return result;
    }

}
