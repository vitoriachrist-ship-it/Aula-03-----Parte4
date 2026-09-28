public class Aluguel {
    private int codigo;
    private String dataInicio;
    private String dataFim;
    private Imovel imovel;
    private Cliente cliente;

    public Aluguel(int codigo, String dataInicio, String dataFim, Imovel imovel, Cliente cliente) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.imovel = imovel;
        this.cliente = cliente;
    }

    public void exibeDados() {
        System.out.println("\n==========================================");
        System.out.println("         CONTRATO DE ALUGUEL              ");
        System.out.println("==========================================");
        System.out.println("Código do Aluguel: " + codigo);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Fim: " + dataFim);
        System.out.println("------------------------------------------");
        imovel.exibeDados();
        System.out.println("------------------------------------------");
        cliente.exibeDados();
        System.out.println("==========================================");
    }
}