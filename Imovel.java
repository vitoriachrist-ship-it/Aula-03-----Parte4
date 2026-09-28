public class Imovel 
{
    private int codigo;
    private String descricao;
    private double precoAluguel;
    private int qtMinMeses;

    public Imovel(int codigo, String descricao, double precoAluguel, int qtMinMeses) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoAluguel = precoAluguel;
        this.qtMinMeses = qtMinMeses;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public int getQtMinMeses() {
        return qtMinMeses;
    }

    public void exibeDados() {
        System.out.println("--- DADOS DO IMÓVEL ---");
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço do Aluguel: R$ " + precoAluguel);
        System.out.println("Qtde. Mínima de Meses: " + qtMinMeses);
    }
}
