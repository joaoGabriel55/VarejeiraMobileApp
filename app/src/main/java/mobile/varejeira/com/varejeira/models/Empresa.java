package mobile.varejeira.com.varejeira.models;

import java.util.List;

public class Empresa {

    private Integer id;
    private String nomeEmpresa;
    private String proprietario;
    private List<Funcionario> listaFuncionarios;
    private String cnpj;
    private String descricao;

    public Empresa(String nomeEmpresa, String proprietario, List<Funcionario> listaFuncionarios, String cnpj, String descricao) {
        this.nomeEmpresa = nomeEmpresa;
        this.proprietario = proprietario;
        this.listaFuncionarios = listaFuncionarios;
        this.cnpj = cnpj;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
