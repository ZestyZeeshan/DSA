//package recursion;

public class binaryUsingRecurssion {
    public static void main (String[] args){
        int arr[]={2,4,6,8,10};
        int target=8;
        System.out.println(binary(arr, target, 0, arr.length));

    }
    public static int binary(int [] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
        return mid;
        if(target>arr[mid]){
            return (binary(arr, target, mid+1, e));
        }
        return(binary(arr, target, s, e-1));
    }
}
