import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um * 1 – Adição * 2 – Subtração * 3 – Multiplicação * 4 – Divisão ");
        int escolha = sc.nextInt();
        System.out.println("Informe o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo número:");
        int num2 = sc.nextInt();
        
        if (escolha == 1){
            int soma = num1 + num2;
            System.out.println("A soma é: " + soma);
        }else if (escolha == 2){
            int subtracao = num1 - num2;
            System.out.println("A subtracao é: " + subtracao);
        }else if (escolha == 3){
            int multiplicacao = num1 * num2;
            System.out.println("A subtracao é: " + multiplicacao);
        }else{
            int divisao = num1 / num2;
            System.out.println("A subtracao é: " + divisao);
        }
    }
    
}