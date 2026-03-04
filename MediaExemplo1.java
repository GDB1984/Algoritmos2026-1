import java.util.Scanner;

public class MediaExemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o nome do(a) estudante.");
            String nome = entrada.nextLine();

        System.out.println("Digite a primeira nota.");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota.");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2)/2;

        System.out.println("A média do(a) estudante " + nome + " é: "+ media);

        entrada.close();
        }
    }