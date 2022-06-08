public class Contribuicao {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Carol", 100000, 500);

        System.out.printf("%S%S%.2f", pf1.getNome(), " vai pagar o valor de: R$",pf1.calcularImposto());

        PessoaJuridica pj1 = new PessoaJuridica("SoulCode", 500000, 45);
        System.out.printf("%S%S%.2f", pj1.getNome(), " vai pagar o valor de: R$",pj1.calcularImposto());
    }
}
