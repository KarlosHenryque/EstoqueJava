package estoque;

import java.util.Scanner;

public class ProgramaEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Entre com os dados:");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Valor: ");
		double valor = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		
		ProdutoEstoque produto = new ProdutoEstoque(nome, valor, quantidade);
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println("Entre com o numero de produtos para entrar em estoque:");
		 quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		System.out.println();
		
		System.out.println("Quantidade atualizada: " +produto);
		System.out.println();
		
		System.out.println("Entre com o numero de produtos para tirar de seu estoque:");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Quantidade atualizada: " +produto);

		sc.close();

	}

}
