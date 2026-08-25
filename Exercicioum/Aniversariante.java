public class Aniversariante {
    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (outroObjeto instanceof Aniversariante) {
            Aniversariante aniversariante = (Aniversariante) outroObjeto;
            return this.nome.equals(aniversariante.nome)
                    && this.dataAniversario.equals(aniversariante.dataAniversario);
        }
        return false;
    }
}
