package searching_07;

public class binarySearchVariation {

    public static int search(int [] arr, int target){
        int low = 0;
        int high = arr.length-1;
        
        int value = -1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){

                value = mid;
                high = mid-1;
                
            }else if(arr[mid] < target){

                low = mid + 1;
            }else{

                high = mid-1;
            }
        }
        return value;
    }

    public static int lastOuccrence(int [] arr, int target){
        int low = 0; 
        int high = arr.length -1;
        int value = -1;

        while(low <= high){
            int mid = low + (high-low)/2; 
            if(arr[mid] == target){
                value = mid;
                low = mid + 1; 
            }else if(arr[mid] <target){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return value;
    }

    public static int searchRotated(int[] arr, int target) {

    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        
        if (arr[low] <= arr[mid]) {

            
            if (target >= arr[low] && target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        else {

            if (target > arr[mid] && target <= arr[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    return -1;
}
    public static void main(String [] args){
        int arr[] = {2,3,4,5,3,4,5};
        int target = 4;

        System.out.println(search(arr,target) + " ");
        System.out.println(lastOuccrence(arr,target) + " ");
        System.out.println(searchRotated(arr,target) + " ");
    }
}
