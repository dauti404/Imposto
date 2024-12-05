public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Leopoldina", 3600.01);

        pf.imprimirPessoaFisica();

        PessoaJuridica pj = new PessoaJuridica("Lipe", 10000.00);

        pj.imprimirPessoaJuridica();
    }
}
