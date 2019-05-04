package mobile.varejeira.com.varejeira.models;

public class Venda {

    private Integer id;
    private String dataAtual;
    private Usuario Cliente;
    private Funcionario vendedor;

    public Venda(Integer id, String dataAtual, Usuario cliente, Funcionario vendedor) {
        this.id = id;
        this.dataAtual = dataAtual;
        Cliente = cliente;
        this.vendedor = vendedor;
    }
}
