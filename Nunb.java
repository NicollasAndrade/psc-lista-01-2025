import java.util.Scanner;

public class Nunb {
    
    public static void main(String[] args) {
    
        int n1,n2,res;


        Scanner scn = new Scanner(System.in);

          System.out.println("=====divisao");
          System.out.println("Digite o primeiro número ");
          n1 = scn.nextInt();

          System.out.println("Digite o segundo número");
          n2 = scn.nextInt();

          res = n1/n2;

          System.out.println("O resultado e "+ res);
    }
}
