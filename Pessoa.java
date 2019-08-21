package locadora;

abstract class Pessoa {
    private String nome;
    
    public Pessoa(String n){
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
