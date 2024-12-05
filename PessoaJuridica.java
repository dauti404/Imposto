class PessoaJuridica {
    private String nome;
    private double renda;
    private double imposto;
    private double total;

    public PessoaJuridica(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public void imprimirPessoaJuridica() {
        System.out.println();
        System.out.println("Nome do contribuinte:    " + nome);
        System.out.println("Renda                 R$ " + renda);

        imposto = renda * 0.10;
        total = renda - imposto;
        System.out.println("Porcentagem de IR:    10%");
        System.out.println("Imposto:              R$ " + imposto);
        System.out.println("Total:                R$ " + total);
    }
}
