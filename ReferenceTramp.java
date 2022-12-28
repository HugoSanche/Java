import java.util.Arrays;

public class ReferenceTramp {
    public static void main(String[] Args)
    {
        String[] namesOfYear={"Hugo","Karina","Lizeth"};
        String[]newNamesOfYear= namesOfYear;

        newNamesOfYear[1]="Veronica"; //check how change the index 1 by "veronica" in two arrays
        System.out.println(Arrays.toString(namesOfYear));
        System.out.println(Arrays.toString(newNamesOfYear));

        //How copy one array to other
        String[] products={"Computer","Cell Fhone","Head Phones"};

        //this is the correct form to copy one array to other
        String[] newProductos=Arrays.copyOf(products, products.length);

        newProductos[1]="Tablets";
        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(newProductos));
    }
}
