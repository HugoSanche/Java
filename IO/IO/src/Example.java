import java.io.*;

public class Example {
    public static void main(String[] args) {
        //NOTE.- BufferedWriter --> FileWriter  Write a file
        //       BufferedReader --> FileReader  Read a file

        String[] nombres ={"Camila", "Alberto","Rodrigo","Andres","Patrica","HUGO"};

        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("Hola.txt"));
            writer.write("Inicio de la lista de nombres");
            writer.write("\nNombres de invitados");
            addInvitados(writer,nombres);
            writer.close();

            BufferedReader reader =new BufferedReader(new FileReader("hola.txt"));
            String line;
            String buscaAmigo="rodrigo";
            boolean asiste=false;
            while((line=reader.readLine())!=null){
                System.out.println(line);
                if (line.toLowerCase().equals(buscaAmigo)){
                    asiste=true;
                }
            }
            if (asiste){
                System.out.println("Mi amigo "+buscaAmigo+" asistira a la fiesta");
            }else{
                System.out.println("Mi amigo "+buscaAmigo+" no asistira a la fiesta\"");
            }

            reader.close();
        }catch (IOException e)
        {
            System.out.println(e);
        }finally {

        }


    }
    public static void addInvitados(BufferedWriter file, String[] nombres){
        for(String nombre:nombres){
            try {
                file.write("\n"+ nombre);
            }catch (IOException e)
            {
                System.out.println(e);
            }

        }
    }
}
