/*
import java.io.*;
import java.util.*;

public class Soluton {
    public static void main(String a[]){
        Scanner scanner_input_object = new Scanner(System.in);
        int n = scanner_input_object.nextInt();
        int d = scanner_input_object.nextInt();
        int main_arr[] = new int[n];
        int temp = 0;
        for(int i = 0; i < n; i++){
            main_arr[i] = scanner_input_object.nextInt();
        }
        for(int i = 0; i < d; i++){
            temp = main_arr[0];
            for(int j = 0; j < n; j++){
                if(j == (n-1)){
                    main_arr[j] = temp;
                }
                else{
                    main_arr[j] = main_arr[(j+1)];
                }
            }
        }
        
        
        
        for(int i = 0; i < n; i++){
            System.out.print(main_arr[i] + " ");
        }
        
    }
}

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] leftRotation(int[] a, int d) {
        int arr_len = a.length;
        
        int shift_value = (d);
        int first_incr;
        int temp_count = d;
        int[] temp_arr = new int[temp_count];
        temp_count = 0;
        
        for(int i = 0; i < d; i++){
            temp_arr[i] = a[i];
            //System.out.println("This is value in temp_count " + i + " temp arr is: "+temp_arr[i] );
        }
        for(first_incr = 0; first_incr < (arr_len - d); first_incr++){
            a[first_incr] = a[shift_value];
            //System.out.println("This is value in shift value " + shift_value + " and position is  " +first_incr+ " and value is "+a[first_incr]);
            shift_value = (shift_value + 1);
            //System.out.println("The shift value is " + shift_value);
        }
        for(first_incr = (arr_len - d) ; first_incr < arr_len; first_incr++){
            a[first_incr] = temp_arr[temp_count];
            temp_count = (temp_count + 1);
            //System.out.println("This is value in a " + a[first_incr]);
        }
        
        
        
        
        /*
        int arr_len = a.length;
        
        for(int i = 1; i <= d; i++){
            int temp = a[0];
            for(int j = 0; j <= (arr_len-1); j++){
                if(j < (arr_len-1)){
                    a[j] = a[j+1];   
                   // System.out.println("This is in if: "+a[j]);
                }else{
                    a[j] = temp;
                   // System.out.println("This is in else: "+a[j]);
                }
                
            }            
        }
        */
        return a; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
