import java.util.Objects;

public class Ninja {

    private String nome;
    private String aldeia;
    private int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return Objects.equals(nome, ninja.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
