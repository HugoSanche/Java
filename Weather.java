import javax.xml.parsers.DocumentBuilder;

class Weather{
    public static void main(String[] Args){
        double noon=77;
        double evening=61;
        double midnight=55;
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }
    /**
     * function name: fahrenheitToCelcios
     * @param fahrenheit (double)
     * @param celcius    (double)
     * @return           (double)
     * 
     * inside the function 
     * 1. convert celcius to fahrenheit
     */
    public static double fahrenheitToCelsios(double fahrenheit, double celcius){
        double c=(fahrenheit-32)*5/9;
        return c;
    }
    /**
     * function name: printTemperatures
     * @param fahrenheit
     * 
     * inside function 
     * 1. print the temperature fahrenheit
     * 2. call the fahrenheitToCelcius and print it
     */
    public static void printTemperatures(double fahrenheit){
        System.out.println("F: "+fahrenheit);
        System.out.println("C: "+fahrenheitToCelsios(fahrenheit, 35.5)+"\n");
    }
}