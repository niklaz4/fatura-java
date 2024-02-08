public class Fatura {

    private String numero;
    private String descricao;
    private int quantidade;
    private double precoItem;

    public Fatura(String numero, String descricao, int quantidade, double precoItem) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("Número da fatura inválido");
        }
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição da fatura inválida");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade de itens deve ser maior que zero");
        }
        if (precoItem <= 0) {
            throw new IllegalArgumentException("Preço por item deve ser maior que zero");
        }
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("Número da fatura inválido");
        }
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição da fatura inválida");
        }
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade de itens deve ser maior que zero");
        }
        this.quantidade = quantidade;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem <= 0) {
            throw new IllegalArgumentException("Preço por item deve ser maior que zero");
        }
        this.precoItem = precoItem;
    }

    public double getTotalFatura() {
        return quantidade * precoItem;
    }

}