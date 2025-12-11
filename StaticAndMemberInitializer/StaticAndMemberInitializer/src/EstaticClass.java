public class EstaticClass{

    public static Integer sum(Integer x, Integer y){
        return x+y;
    }

    public static void main(String [] args){

        Integer result=EstaticClass.sum(10,10);

        System.out.println(result);
    }

}