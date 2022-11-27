package Entidades;

public class Pessoa {
    protected String nome; 
    protected String dataNascimento;
    public Pessoa() {
    }

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", data de Nascimento=" + dataNascimento;
    }


      
    

}
