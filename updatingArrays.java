import java.lang.reflect.Array;
import java.util.Arrays;

public class updatingArrays {
    public static void main(String[] Args){
        String[] menu={"Expresso","Iced Coffe","Latte"};

        System.out.println(Arrays.toString(menu));

        //una vez creado un array no puedes cambiar el tamaño
        //si quieres agregar items debes de crear otro array
        String[] newMenu= new String[5];
        for (int i=0; i<menu.length;i++){
            newMenu[i]=menu[i];
        }
        newMenu[3]="House Blend";
        newMenu[4]="Dark Roast";

        System.out.println(Arrays.toString(newMenu));
    }
}
