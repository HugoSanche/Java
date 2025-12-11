public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int resultado = removeDuplicates(nums);
        System.out.println(resultado);

    }


    //Debes de llevar el control del valor maximo
    //El valor maximo lo vas a almacenar en el valor p.
    //P siempre tendra la posicion en donde se va a guardar el valor maximo
    public static int removeDuplicates(int[] nums) {

        int max=nums[0];
        int p=1;
        for (int i=1; i<nums.length; i++){
            if (nums[i]>max){
                nums[p]=nums[i];
                max=nums[p];
                p++;
            }
        }
        return p;
    }

}
