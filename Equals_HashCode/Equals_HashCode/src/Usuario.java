import java.util.Objects;

public class Usuario {
    private String name;
    private String email;

    public Usuario(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (!Objects.equals(name, usuario.name)) return false;
        return Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Usuario usr=new Usuario("Hugo", "test@gnp.com");

        Usuario usr1=new Usuario("Hugo", "test@gnp.com");

        System.out.println(usr.equals(usr1));

    }
}
