import java.util.Scanner;

public class AppController {

    //controller

    private static AppController instance;
    private Scanner scan;

    private AppController() {
        scan = new Scanner(System.in);
    }

    public static AppController getInstance() {
        if (instance == null) {
            instance = new AppController();
        }
        return instance;
    }

    public void cadastrarConta() {
        System.out.println("Digite o número da conta");
        int numero = scan.nextInt();
        System.out.println("Digite o número da agência");
        int agencia = scan.nextInt();
        System.out.println("Digite o CPF");
        String cpf = scan.next();
        scan.nextLine(); 
        System.out.println("Digite a senha");
        String senha = scan.nextLine(); 

        ContaBancaria conta = new ContaBancaria(numero, agencia, 0.0, cpf, senha, "teste@email.com");

        System.out.println("DADOS DA CONTA:");
        System.out.println(conta.toString());

        System.out.println(conta.sacar(10));
        System.out.println("DADOS DA CONTA:");
        System.out.println(conta.toString());

        System.out.println(conta.depositar(50));
        System.out.println("DADOS DA CONTA:");
        System.out.println(conta.toString());
    }

    public void cadastrarPessoa() {
        System.out.println("Digite o seu nome completo:");
        String nome = scan.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = scan.nextLine();
        System.out.println("Digite seu email: ");
        String email = scan.nextLine();
        System.out.println("Digite seu telefone: ");
        int telefone = scan.nextInt();

        Pessoa pessoa = new Pessoa(nome, cpf, email, telefone);
        System.out.println("DADOS DA PESSOA:");
        System.out.println(pessoa.toString());
    }

    public void closeScanner() {
        scan.close();
    }
}
