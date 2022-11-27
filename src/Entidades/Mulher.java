package Entidades;

public class Mulher extends PessoaIMC {

    public Mulher(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
        
    }

    @Override
    public String resulIMC() {
        
        double resultMulher = this.calculaIMC(peso, altura);

        String AbaixoPeso = "Abaixo do peso ideal";
        String PesoIdeal = "Peso ideal";
        String PesoAlto = "Acima do Peso Ideal";

        if(resultMulher < 19){
            return AbaixoPeso;
        } else if(resultMulher > 19 & resultMulher < 25.8){
            return PesoIdeal;
        } else{
            return PesoAlto;
        }
    }
    
}
