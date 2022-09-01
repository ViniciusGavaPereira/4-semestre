public class MontarCesta {
    public static void main(String[] args) throws Exception {
        Composite cesta = new Composite("Cesta de café da manhã");
    
        Component produto1 = new Leaf("Pão", 2.34);

        Component produto2 = new Leaf("Café", 20); 

        Component produto3 = new Leaf("Presunto", 7, 2.50);

        Component produto4 = new Leaf("Queijo", 8);

        cesta.adicionar(produto1);
        cesta.adicionar(produto2);
        cesta.adicionar(produto3);
     
        Composite caixa = new Composite("Cesta de café da tarde");

        caixa.adicionar(produto4);

        System.out.println(cesta.getPreco());
    }
}
