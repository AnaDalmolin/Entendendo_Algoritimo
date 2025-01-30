package exerciciopag36.model;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Contato() {}

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String setNome(String nome){
        return this.nome = nome;
    }
    
    public String setTelefone(String telefone){
        return this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
    }
}
