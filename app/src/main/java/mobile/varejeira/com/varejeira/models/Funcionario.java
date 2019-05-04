package mobile.varejeira.com.varejeira.models;

public class Funcionario extends Usuario{

    //private Empresa empresa;
    private String horarioTrabalho;
    private String dataNascimento;
    private String nicho;

    public Funcionario(String nome, String sexo, String telefone, String email, String cpf, String horarioTrabalho, String dataNascimento, String nicho) {
        super(nome, sexo, telefone, email, cpf);
        this.horarioTrabalho = horarioTrabalho;
        this.dataNascimento = dataNascimento;
        this.nicho = nicho;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }
}
