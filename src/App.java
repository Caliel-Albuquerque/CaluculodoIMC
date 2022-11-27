import Entidades.Homem;
import Entidades.Mulher;
import Entidades.PessoaIMC;


import java.util.ArrayList;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------CALCULO IMC------");

        int j = 0;

        System.out.println("Digite a quantidade de pessoas que você deseja criar: ");
        Scanner tamArray = new Scanner(System.in);
        int arrayTam = tamArray.nextInt();

        System.out.println("Qual você quer criar: 1 - HOMEM | 2 - MULHER");
        Scanner tipoPessoa = new Scanner(System.in);
        int pessoaTipo = tipoPessoa.nextInt();

        switch (pessoaTipo) {

            case 1:
                ArrayList listaHomem = new ArrayList<Homem>();

                for (int i = 0; i < arrayTam; i++) {

                    System.out.println("\nDigite o nome do rapaz: ");
                    Scanner nomePessoa = new Scanner(System.in);
                    String nome = nomePessoa.nextLine();

                    System.out.println("Digite a data de aniversario: ");
                    Scanner dataNiver = new Scanner(System.in);
                    String niverPessoa = dataNiver.nextLine();

                    System.out.println("Digite o peso: ");
                    Scanner pesoPessoa = new Scanner(System.in);
                    Double peso = pesoPessoa.nextDouble();

                    System.out.println("Digite a altura: ");
                    Scanner pessoaAltura = new Scanner(System.in);
                    Double altura = pessoaAltura.nextDouble();

                    listaHomem.add(i, (new Homem(nome, niverPessoa, peso, altura)));
                }

                while (j < listaHomem.size()) {

                    System.out.println(listaHomem.get(j));

                    j++;
                }

                break;

            case 2:
                ArrayList listaMulher = new ArrayList<Mulher>();

                for (int i = 0; i < arrayTam; i++) {

                    System.out.println("\nDigite o nome da mulher: ");
                    Scanner nomePessoa = new Scanner(System.in);
                    String nome = nomePessoa.nextLine();

                    System.out.println("Digite a data de aniversario: (dd/mm/aaaa)");
                    Scanner dataNiver = new Scanner(System.in);
                    String niverPessoa = dataNiver.nextLine();

                    System.out.println("Digite o peso: ");
                    Scanner pesoPessoa = new Scanner(System.in);
                    Double peso = pesoPessoa.nextDouble();

                    System.out.println("Digite a altura: ");
                    Scanner pessoaAltura = new Scanner(System.in);
                    Double altura = pessoaAltura.nextDouble();

                    listaMulher.add(i, (new Mulher(nome, niverPessoa, peso, altura)));
                }

                while (j < listaMulher.size()) {

                    System.out.println(listaMulher.get(j));

                    j++;
                }
            break; 

            default:  
                System.out.println("Digite 1 ou 2");
            break;

        }

        PessoaIMC[] pessoasArray = new Homem[arrayTam];

    }
}
