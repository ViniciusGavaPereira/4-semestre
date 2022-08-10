public class PessoaJuridica extends Pessoa {
    
    public PessoaJuridica(String nome, long cnpj){
        super(nome);
        this.cnpj = cnpj;
    }

    private long cnpj;

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    
}
