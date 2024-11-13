import java.util.Scanner;

public class App {

    //view

    public static void main(String[] args) {
        AppController controller = AppController.getInstance();
        Scanner scan = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1- Cadastrar uma conta;");
            System.out.println("2- Cadastrar uma pessoa;");
            System.out.println("3- Sair");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    controller.cadastrarConta();
                    break;
                case 2:
                    controller.cadastrarPessoa();
                    break;
                case 3:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (escolha != 3);

        controller.closeScanner();
        scan.close();
    }
}

