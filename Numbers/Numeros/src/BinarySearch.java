import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] array={2,30,4,10,40,14};
        int target=10;
        Arrays.sort(array);
        int result=binarySearch(array,target);
        if(result==-1){
            System.out.println("No se encontro el elemento");
        }
        System.out.println("Se encontro el elemento en la posicion "+result);
    }
    public static int  binarySearch(int array[],int target){
        int left=0;
        int rigth=array.length-1;
        while(left<=rigth){
            int mid=left+(rigth-left)/2;
            if(array[mid]==target){
                return mid;
            }
            if (array[mid]<target){
                left=mid+1;
            }else {
                rigth=mid-1;
            }
        }
        return -1;
    }
}
