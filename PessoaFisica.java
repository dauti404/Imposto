class PessoaFisica {
    private String nome;
    private double renda;
    private double imposto;
    private double total;

    public PessoaFisica(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirPessoaFisica() {
        System.out.println("Nome do contribuinte: " + nome);
        System.out.println("Renda:                R$ " + renda);
        if (renda == 0 || renda <=1400) {
            System.out.println("Porcentagem de IR: 0%");
        } else if (renda >= 1400.01 || renda <= 2100.00) {
            System.out.println("Porcentagem de IR: 10%");
            imposto = renda * 0.10;
        }

        if (renda >= 2100.01 || renda <= 2800.00) {
            System.out.println("Porcentagem de IR: 15%");
            imposto = renda * 0.15;
        }
        if (renda >= 2800.01 || renda <= 3600.00) {
            System.out.println("Porcentagem de IR: 25%");
            imposto = renda * 0.25;
        }
        if (renda >= 3600.01) {
            System.out.println("Porcentagem de IR: 30%");
            imposto = renda * 0.30;
        }

        total =  renda - imposto;       

        System.out.println("Total do imposto:      R$ " + imposto);
        System.out.println("Total:                 R$ " + total);
    }
}
