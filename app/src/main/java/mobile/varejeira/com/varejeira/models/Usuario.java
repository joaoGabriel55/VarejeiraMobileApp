package mobile.varejeira.com.varejeira.models;

public abstract class Usuario {

    private Integer id;
    private String nome;
    private String sexo;
    private String telefone;
    private String email;
    private String cpf;

    public Usuario(String nome, String sexo, String telefone, String email, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
