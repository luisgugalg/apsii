import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
        aniversariantes.add(aniversariante);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomes = new ArrayList<>();
        DataAniversario dataInformada = new DataAniversario(dia, mes);

        for (Aniversariante aniversariante : aniversariantes) {
            if (aniversariante.getDataAniversario().equals(dataInformada)) {
                nomes.add(aniversariante.getNome());
            }
        }

        return nomes;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = aniversariantes.size() - 1; i >= 0; i--) {
            if (aniversariantes.get(i).getNome().equals(nomeAniversariante)) {
                aniversariantes.remove(i);
            }
        }
    }
}
