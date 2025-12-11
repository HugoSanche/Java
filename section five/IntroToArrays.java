public class IntroToArrays {
    public static void main(String[] Args){
        String[] state={"Ciudad de Mexico", "Puebla", "Campeche","Jalisco"};
        int values;
        float price;
        char initiales;

        
        System.out.println("Array "+state); //
        System.out.println(state[0]);
        System.out.println(state[1]);
        System.out.println(state[2]);
        System.out.println(state[3]); 
        //System.out.println(state[4]); //error

        System.out.println("The size of the array "+state.length);
        for(int i=0; i<state.length; i++){
            System.out.println("The index of the array is "+i+" and the values is "+state[i]); 
        }
    }
}
