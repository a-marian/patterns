package ar.com.patterns.structural.adapter;

import java.util.List;

/**
 * The client makes a request to the adapter by calling a method on it using the target interface.
 * The adapter translates the request into one or more calls on the adaptee using the adaptee interface.
 * The client receives the results of the call and never knows there is an adpter doing the translation.
**/
public class AdapterMain {

    public static void main(String[] args) {

        int[] nums = new int[]{14,67,45,89,20,12,22,85,99,10};

        Sorter sorter = new SortNumberAdapter();
       int[] result = sorter.sort(nums);

        for (int n: result) {
            System.out.println(n);
        }


    }

}
