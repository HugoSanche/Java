package exampletwo;

public class UsuarioDTO {
    private final String nombre;
    private final String apellidos;
    private final String email;
    private final String telefono;
    private final String fechaNacimiento;
    private final String estadoCivil;

    public UsuarioDTO(String nombre, String apellidos, String email, String telefono, String fechaNacimiento, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
    }
    public UsuarioDTO(Builder builder){
        this.nombre = builder.nombre;
        this.apellidos = builder.apellidos;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.estadoCivil = builder.estadoCivil;
    }

    public static class Builder{
        private  String nombre;
        private  String apellidos;
        private  String email;
        private  String telefono;
        private String fechaNacimiento;
        private  String estadoCivil;

        public UsuarioDTO.Builder nombre( String nombre) {
            this.nombre=nombre;
            return this;
        }

        public UsuarioDTO.Builder apellidos(String apellidos) {
            this.apellidos=apellidos;
            return this;
        }

        public UsuarioDTO.Builder email(String email) {
            this.email=email;
            return this;
        }

        public UsuarioDTO.Builder telefono(String telefono) {
            this.telefono=telefono;
            return this;
        }

        public UsuarioDTO.Builder fechaNacimiento(String fechaNacimiento) {
            return this;
        }

        public UsuarioDTO.Builder estadoCivil(String estadoCivil) {
            this.estadoCivil=estadoCivil;
            return this;
        }

        public UsuarioDTO build(){
            return new UsuarioDTO(this);
        }
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
