package mergesort;

import java.util.Arrays;

public class MergeSort {
    public int[] merge(int ar1[],int ar2[]){
        int combined[] = new int[ar1.length+ar2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]<ar2[j]){
                combined[index] = ar1[i];
                i++;
            }
            else{
                combined[index] = ar2[j];
                j++;
            }
            index++;
        }
        while(i<ar1.length){
            combined[index] = ar1[i];
            index++;
            i++;
        }
        while(j<ar2.length){
            combined[index] = ar2[j];
            index++;
            j++;
        }
        return combined;
    }

    public int[] mergeSort(int[] array){
        if(array.length == 1)
            return array;
        int midIndex = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array,midIndex,array.length));
        return left;
    }
}
