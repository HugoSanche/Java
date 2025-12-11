import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,2,9,1,7};

        int[] result=sortBubble(arr);
        System.out.println(Arrays.toString(result));

    }
    public static int[] sortBubble(int[] arr){
        boolean stop=false;
        int temp=0;
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    stop=true;
                }
            }
            if(!stop){
                return arr;
            }
        }
        return arr;
    }
}
