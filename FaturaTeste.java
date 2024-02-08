public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("1234", "Cabo HDMI", 2, 49.90);

        System.out.println("Número da fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: R$" + fatura.getPrecoItem());
        System.out.println("Total da fatura: R$" + fatura.getTotalFatura());

        fatura.setQuantidade(1);
        fatura.setPrecoItem(59.90);

        System.out.println("\nNova quantidade: " + fatura.getQuantidade());
        System.out.println("Novo preço por item: R$" + fatura.getPrecoItem());
        System.out.println("Novo total da fatura: R$" + fatura.getTotalFatura());
    }
}
