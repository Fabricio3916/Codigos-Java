import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    private List<T> bolsa;

    public BolsaNinja() {
        this.bolsa = new ArrayList<>();
    }

    public void mostrarEquipamentos(){
        for(T equipamentos : bolsa){
            System.out.println(equipamentos);
        }
    }

    public void adicionarEquipamentos(T equipamento){
        bolsa.add(equipamento);
    }

    public List<T> getBolsa() {
        return bolsa;
    }

    public void setBolsa(List<T> bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "BolsaNinja: ";
    }
}
