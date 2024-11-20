package estoque;

public class ProdutoEstoque {
	
	public String nome;
	public double valor;
	public int quantidade;
	
	public ProdutoEstoque(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public double totalEstoque() {
		return valor * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProdutos (int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "Produto Data = " + nome + ", Valor = R$:" + valor + ", Quantidade = " + quantidade + ", Total: " +totalEstoque();
	}
	
}
