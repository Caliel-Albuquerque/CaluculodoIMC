package Entidades;

public class Homem extends PessoaIMC {

    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
        
    }


    
    @Override
    public String resulIMC() {
        
       double resultHomem =  this.calculaIMC(peso, altura);

        String AbaixoPeso = "Abaixo do peso ideal";
        String PesoIdeal = "Peso ideal";
        String PesoAlto = "Acima do Peso Ideal";

        if(resultHomem < 20.7){
            return AbaixoPeso;
        } else if(resultHomem > 20.7 & resultHomem < 26.4){
            return PesoIdeal;
        } else{
            return PesoAlto;
        }

        
    }
    

}
