package exemplo2;

public class Banco {

    private String nome;
    private String cpf;
    private double saldo;

    public Banco(String novoNome, String novoCpf, double novoSaldo) {
//        This faz referencia a um atributo da mesma classe
        this.nome = novoNome;
        this.cpf = novoCpf;
        this.saldo = novoSaldo;
    }

    public Banco() {
//        This faz referencia a um atributo da mesma classe
        this.nome = "Sem Nome";
        this.cpf = "Sem Cpf";
        this.saldo = 0;
    }

    //    Estudar get e set para atributos encapsulados
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

}