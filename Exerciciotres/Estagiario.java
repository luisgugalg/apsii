public class Estagiario extends Funcionario {
    private double valorBolsaAuxilio;
    private int cargaHorariaSemanal;

    public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao,
                      double valorBolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    
    public double calcularSalario() {
        return valorBolsaAuxilio;
    }

    
    public double calcularDesconto() {
        return 0.00;
    }
}
