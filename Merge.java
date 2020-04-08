import java.util.Arrays;

/**
 * @description Merge sort algorithm
 * @author Alex Silkin
 * Last modified: 4/7/2020
 * */

public class Merge {

    public static void main(String[] args){
        /* Data to sort*/
        int[] data = {38,27,43,3,9,82,10,0};
        int[] dataSetTwo = {0,0,-9,100,22,14,5};

        /* Run a merge sort algorithm*/
        MergeSort(data);
        MergeSort(dataSetTwo);

        /* Print the result*/
        PrintArray(data);
        PrintArray(dataSetTwo);

    }

    public static void PrintArray(int[] a){
        /* Print the array to the console*/
        System.out.print("[ ");
        for (int i =0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("] \n");
    }

    public static int[] MergeSort(int[] data){
        /*
         *  Sorts array A[0..A.length] by recursive mergesort
         *  Input: An array A[0..A.length] of orderable elements
         *  Output: Array A[0..A.length] sorted in nondecreasing order
        */

        // Half of the array index
        int half = data.length/2;

        // Temp arrays
        int[] b = {};
        int[] c = {};

        if(data.length > 1){

            // Left half of data[]
            b = Arrays.copyOfRange(data,0,half);

            // Right half of the data[]
            c = Arrays.copyOfRange(data, half, data.length);

            MergeSort(b);
            MergeSort(c);
            Merge(b,c,data);
        }

        return data;
    }

    public static int[] Merge(int[] b, int[] c, int[] a){
        /*
        *  Merge two sorted arrays into one sorted array
        *  Input: Arrays B[0..p] and C[0..q]
        *  Output: Sorted array A[0..A.length] of the elements of B and C
        * */
        int i=0;
        int j=0;
        int k=0;

        // This is length of the array b
        int p = b.length;

        // This is length of c
        int q = c.length;

        // Sort arrays
        while(i < p && j < q ){
            if(b[i] < c[j]) {
                a[k] = b[i++];
            }
            else {
                a[k] = c[j++];
            }
            k++;
        }

        if(i == p){
            System.arraycopy(c,j,a,k,q-j);
        }
        else{
            System.arraycopy(b,i,a,k,p-i);
        }
        return a;
    }
}
