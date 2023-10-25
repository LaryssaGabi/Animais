import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // para o usuário digitar valores e criar uma variável
        int i = 0;

        // método try/catch genérico para evitar alguns erros
        try {
            System.out.print("Crie o seu novo animal --->  ");
            String nome = leia.nextLine();
            System.out.print("Informe a classe se é gato, cachoro... --->   ");
            String classe = leia.nextLine();
            System.out.print("Informe a raça ---> ");
            String familia = leia.nextLine();
            System.out.print("Informe a idade ---> ");
            int idade = leia.nextInt();

            Animais primeiros = new Animais(nome, classe, familia, idade);
            System.out.println(primeiros.nasceu());

            while (i != 4) {
                System.out.println("O que o " + primeiros.getNome() + " vai fazer agora? "
                        + "(1) - Comer | (2) - Correr | (3) - Dormir | (4) - Morrer");
                i = leia.nextInt();

                if (i > 0 || i < 5) {
                    switch (i) {
                        case 1:
                            System.out.println(primeiros.comer());
                            System.out.println("------------------------------------------------");

                            break;
                        case 2:
                            System.out.println(primeiros.correr());
                            System.out.println("------------------------------------------------");

                            break;
                        case 3:
                            System.out.println(primeiros.dormir());
                            System.out.println("------------------------------------------------");

                            break;
                        case 4:
                            System.out.println(primeiros.morrer());
                            System.out.println("------------------------------------------------");

                            break;
                    }
                } else {
                    System.out.println("Opção inválida, tente novamente");
                }
            }
            System.out.println("GAME OVER!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

            // para fechar o Scanner
        } finally {
            leia.close();
        }
    }
}
