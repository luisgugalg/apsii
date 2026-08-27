public class Principal {

    public static void main(String[] args) {

        exemplo2.Banco b1 = new exemplo2.Banco("João", "123.456.789-00", 1000.0);
        b1.setNome("Maria");
        System.out.println("Nome: " + b1.getNome());
    }
}