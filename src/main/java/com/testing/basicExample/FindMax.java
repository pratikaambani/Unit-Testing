package com.testing.basicExample;

/**
 * Created by AmbaniP on 30/07/2017.
 */
public class FindMax {

    public static int findMax(int arr[]){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

}
