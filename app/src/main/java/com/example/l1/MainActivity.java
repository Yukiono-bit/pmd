package com.example.l1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 *The class of the main activity and the functions implemented according to the task.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * A function to find the maximum element in an array.
     *
     * @param arr - array
     * @return - returns the maximum element
     */
    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Function to find the minimum element in an array.
     *
     * @param arr - array
     * @return - returns the minimum element
     */
    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}