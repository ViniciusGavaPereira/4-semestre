public class Leaf implements Component{
    
    private String nome;
    private double preco;
    private double desconto;

    public Leaf(){};

    public Leaf(String nome,double preco ){
        this.nome = nome;
        this.preco = preco;

    };

    public Leaf(String nome,double preco,double desconto ){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    };

    @Override
    public double getPreco(){
        return preco;

    }

    @Override
    public String toString() {
        return "Leaf [nome=" + nome + ", preco=" + preco + "]";
    }

    
}
