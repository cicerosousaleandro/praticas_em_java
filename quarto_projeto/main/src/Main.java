import java.util.Locale;  //locale para usar ponto no lugar de vírgula
import java.util.Scanner; //Importar o Scanner

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int a;
        double b;




        x = sc.next();  //Input string
        a = sc.nextInt(); //Input números inteiros
        b = sc.nextDouble(); //Input números com ponto flutuantes.

        System.out.println("Seu nome é: " + x);
        System.out.println("Sua idade é: " + a);
        System.out.println("O motor do seu carro é : " + b);



        sc.close();

    }
}