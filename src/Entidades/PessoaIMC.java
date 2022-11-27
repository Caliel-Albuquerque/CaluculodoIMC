package Entidades;

public abstract class PessoaIMC extends Pessoa{
    protected double peso;
    protected double altura;

    

    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }



    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }



    public void setAltura(double altura) {
        this.altura = altura;
    }



    public double getAltura() {
        return altura;
    }

    public double calculaIMC(double peso, double altura){
        double resultImc = peso/(altura*altura); 

        return resultImc;
    }


    public abstract String resulIMC();


    @Override
    public String toString() {
        return "\nNome: " +  this.getNome() +"\nData de Nascimento: " + this.getDataNascimento() + "\nPeso: " + this.getPeso()+"Kg" + "\nAltura: " + this.getAltura() +"\nResultado: "+ this.resulIMC();
    }
    
    
    
}
