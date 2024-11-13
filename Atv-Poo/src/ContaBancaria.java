public class ContaBancaria {

    //model
    
    private int numero;
    private int agencia;
    private double saldo;
    private String cpf;
    private String senha;
    private String email;

    public ContaBancaria(int numero, int agencia, double saldo, String cpf, String senha, String email){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldo() {
        return saldo;
    }

    private boolean testarValor(double valor) {
        return valor > 0;
    }

    private boolean valorMenorOuIgualQueSaldo(double valor) {
        return valor <= saldo;
    }

    private boolean valorValidoSaque(double valor) {
        return testarValor(valor) && valorMenorOuIgualQueSaldo(valor);
    }

    public String sacar(double valor) {
        if (valorValidoSaque(valor)) {
            saldo -= valor;
            return "Saque realizado!";
        }
        return "Valor inválido!";
    }

    public String depositar(double valor) {
        if (testarValor(valor)) {
            saldo += valor;
            return "Depósito realizado!";
        }
        return "Valor inválido";
    }

    @Override
    public String toString() {
        return "Conta: " + numero + "\nAgencia: " + agencia + "\nSaldo: R$" + saldo + "\nCPF: " + cpf;
    }
}
