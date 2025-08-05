package application;

// Importa a classe ArrayList, que é usada para criar uma lista dinâmica de objetos
import java.util.ArrayList;

// Declara a classe Carrinho
public class Carrinho {
	
	// Declara um atributo privado 'itens' que é uma lista de objetos do tipo Item
	private ArrayList<Item> itens;
	
	// Construtor da classe Carrinho
	public Carrinho() {
		// Inicializa a lista de itens quando um novo objeto Carrinho é criado
		itens = new ArrayList<>();
	}
	
	// Método para adicionar um item à lista
	public void adicionarItem(Item item) {
		itens.add(item); // Adiciona o objeto 'item' ao final da lista
		System.out.println(item.getNome()+" foi adicionado ao carrinho."); // Exibe uma mensagem de confirmação
	}
	
	// Método para remover um item da lista pelo seu código
	public void removerItem(int codigo) {
		// Loop para percorrer a lista de itens
		for (int i=0; i<itens.size(); i++) {
			// Verifica se o código do item na posição 'i' é igual ao código fornecido
			if (itens.get(i).getCodigo() == codigo) {
				System.out.println(itens.get(i).getNome()+" foi removido do carrinho!"); // Exibe uma mensagem de remoção
				itens.remove(i); // Remove o item da lista na posição 'i'
			}
		}
	}
	
	// Método para calcular o preço total de todos os itens no carrinho
	public void calcularPreco() {
		
		double valor = 0; // Inicializa a variável 'valor' para armazenar a soma dos preços
		// Loop para percorrer a lista de itens
		for (int i=0; i<itens.size(); i++) {
			// Adiciona o preço do item atual à variável 'valor'
			valor += itens.get(i).getPreco();
			
		}
		// Imprime o valor total formatado com duas casas decimais
		System.out.printf("Total é : %.2f%n",valor);
		
	}
}