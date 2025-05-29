import java.util.Objects;

public class Ninja {

   private final String nome;
   private final String email;
   private final int telefone;

   public Ninja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return getTelefone() == ninja.getTelefone() && Objects.equals(getNome(), ninja.getNome()) && Objects.equals(getEmail(), ninja.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail(), getTelefone());
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
