package com.company;

//Creating test class IntegerSetTest
public class IntegerSetTest {

    //Main Method
    public static void main(String[] args) {

        //Creating object of IntegerSet class to initialize an empty set
        IntegerSet set1 = new IntegerSet();

        //Creating another object of IntegerSet class for checking the insert and delete methods
        IntegerSet set2 = new IntegerSet(0,2,4);

        System.out.println("1.) VALIDATING INSERT AND DELETE METHOD");
        System.out.println("---------------------------------------");
        //Initial Set
        System.out.println("The initial set contains the elements:\n 0 2 4");
        //Invoking insertElement method
        set2.insertElement(3);
        //Printing elements of resultant set
        System.out.println("The resultant set after insertion contains the elements:");
        for (int i = 0; i < 100; i++){
            if (set2.arr[i]){
                System.out.printf(" %d", i);
            }
        }

        System.out.println();

        //Initial Set
        System.out.println("\nThe initial set contains the elements:\n 0 2 3 4");
        //Invoking deleteElement method
        set2.deleteElement(0,3);
        //Printing elements of resultant set
        System.out.println("The resultant set after deleting contains the elements:");
        for (int i = 0; i  < 100; i++){
            if (set2.arr[i]){
                System.out.printf(" %d", i);
            }
        }

        System.out.println("\n");

        //Creating two more objects of the IntegerSet for the validation of the union and intersection methods
        IntegerSet set3 = new IntegerSet(0,1,2,3,4,5);
        IntegerSet set4 = new IntegerSet(0,2,4,6,8,10);
        System.out.println("2.) VALIDATING UNION AND INTERSECTION METHOD");
        System.out.println("--------------------------------------------");
        //Printing Set A
        System.out.println("Set A");
        System.out.println("-----");
        for (int i = 0; i  < 100; i++){
            if (set3.arr[i]){
                System.out.printf(" %d", i);
            }
        }
        //Printing Set B
        System.out.println("\nSet B");
        System.out.println("-----");
        for (int i = 0; i  < 100; i++){
            if (set4.arr[i]){
                System.out.printf(" %d", i);
            }
        }
        System.out.println();

        //Invoking static Union method
        boolean [] union_arr = IntegerSet.Union(set3.arr,set4.arr);
        //Printing elements of union set
        System.out.println("\nUnion between Set A and Set B:");
        System.out.println("------------------------------");
        for (int i = 0; i  < 100; i++){
            if (union_arr[i]){
                System.out.printf(" %d", i);
            }
        }
        //Invoking static Intersection method
        boolean [] intersection_arr = IntegerSet.Intersection(set3.arr,set4.arr);
        //Printing elements of intersection set
        System.out.println("\nIntersection between Set A and Set B:");
        System.out.println("-------------------------------------");
        for (int i = 0; i  < 100; i++){
            if (intersection_arr[i]){
                System.out.printf(" %d", i);
            }
        }
        System.out.println("\n");

        System.out.println("3.) VALIDATING EQUALITY METHOD");
        System.out.println("------------------------------");
        //Invoking isEqualto method for checking the equality of two sets
        boolean check_equality = IntegerSet.isEqualto(set3.arr,set4.arr);
        //Printing the result whether the sets are equal or not
        if (check_equality){
            System.out.println("Set A is equal to Set B.");
        }else{
            System.out.println("Set A is not equal to Set B.");
        }
    }
}
