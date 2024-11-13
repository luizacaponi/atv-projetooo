public class Pessoa {

    //model

    private String nome;
    private String cpf;
    private String email;
    private int telefone;

    public Pessoa(String nome, String cpf, String email, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Dados da Pessoa:\nNome: " + nome + "\nCPF: " + cpf + "\nEmail: " + email + "\nTelefone: " + telefone;
    }
}
