import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private String nome;

    public Composite(){}

    public Composite( String nome){
        this.nome = nome;

    }
    
    private List<Component> lista = new ArrayList<>();

    public void adicionar (Component component){
        this.lista.add(component);

    }

    public void remover (Component component){
        this.lista.remove(component);

    }


    @Override
    public double getPreco() {
        double total = 0;

        for(Component c: lista){
            total += c.getPreco();

        }

        return total;
    }

    @Override
    public String toString() {
        return "Composite [lista=" + lista + ", nome=" + nome + "]";
    }

    
}
