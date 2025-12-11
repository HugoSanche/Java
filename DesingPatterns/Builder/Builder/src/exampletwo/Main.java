package exampletwo;

public class Main {
    public static void main(String[] args) {
        UsuarioDTO usuarioDTO=new UsuarioDTO.Builder()
                .nombre("Hugo")
                .apellidos("Baltazar")
                .fechaNacimiento("16/07/1980")
                .estadoCivil("Soltero")
                .email("hboss@hotmail.com")
                .telefono("577667")
                .build();
        System.out.println(usuarioDTO.toString());
    }

}
