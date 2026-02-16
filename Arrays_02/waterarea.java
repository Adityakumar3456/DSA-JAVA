package Arrays_02;

public class waterarea {

    public static int area(int [] arg){
        int left = 0;
        int right = arg.length-1;
        int area =0;

        while(left<right){
            int curarea = Math.min(arg[left],arg[right]) * (right - left);

            area = Math.max(area, curarea);

            if(arg[left] < arg[right]) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }

    public static void main(String [] args ){
        int []arr = {10,2,3,4,6,7};

        System.out.println(area(arr));


    }
}
