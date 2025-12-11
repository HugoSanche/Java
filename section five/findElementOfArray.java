public class findElementOfArray {
    public static void main(String[] Args){
        //find the highest value
        int [] scores={5412,1052,8421,345,658,6421,9354,9541,6541};
        int highest=0;
        int index=0;
        for (int i=0; i<scores.length; i++){
            if (highest<scores[i]){
                highest=scores[i];
                index=i;
                //System.out.println(highest);
            }
        }
        System.out.println("The highest score is "+highest+" and the values is in the index "+index);
    }
}
