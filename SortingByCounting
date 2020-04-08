/**
 * @author: Alex Silkin
 * @data: 4/8/2020
 * @description: Sorting by counting in O(n^2)
 * Not required to use anywhere
 */

public class SortingByCounting {

    public static void main(String[] args){

        int[] n = {62,31,84,96,19,47};

        n = ComparisonCountingSort(n);
        printArray(n);
    }

    public static void printArray(int[] data){
        System.out.print(">>> Current array state: ");
        System.out.print("[ ");
        for(int i =0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.print(" ]\n");
    }

    public static int[] ComparisonCountingSort(int[] a){
        // Space for time complexity trade off
        //
        int[] Count = new int[a.length];
        int[] S = new int[a.length];

        // Set count to zero
        for(int i =0; i < a.length; i++){
            Count[i] = 0;
        }
        System.out.println(">>> Initialize counter to 0");
        printArray(Count);

        for(int i = 0; i < a.length - 1; i++){
            for(int j = i+1; j < a.length;j++){
                if(a[i] < a[j]){
                    Count[j] = Count[j] + 1;
                }
                else{
                    Count[i] = Count[i] + 1;
                }
            }
            System.out.println(">>> Counting");
            
            printArray(Count);
        }

        for(int i =0; i < a.length;i++){
            S[Count[i]] = a[i];
        }
        
        System.out.println(">>> Sorted array");
        
        return S;
    }
}
