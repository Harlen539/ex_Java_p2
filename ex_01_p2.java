import java.util.Scanner;

public class ex_01_p2 {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        do {
            System.out.println("Insira seu nome:");
            String nome = sc2.nextLine();
            System.out.println(nome);

            System.out.println("Insira sua idade:");
            int idade = sc.nextInt();
            System.out.println(idade);

            System.out.println("para ver novamente, digite 1");
            r = sc.next();
        } while (r.equalsIgnoreCase("5"));

    }
}