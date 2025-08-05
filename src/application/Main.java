package application;

// Declaração da classe principal do programa
public class Main {
	
	// Método principal que inicia a execução
	public static void main(String [] args){
		
		// Cria 4 objetos da classe Item, cada um com nome, preço e ID
		Item item1 = new Item("Carne", 25, 1);
		Item item2 = new Item("Frango", 23.99, 2);
		Item item3 = new Item("Coca-Cola", 21.99, 3);
		Item item4 = new Item("Kuat", 20.99, 4);
		
		
		// Cria um novo objeto da classe Carrinho
		Carrinho c = new Carrinho();
		
		// Adiciona 4 itens ao carrinho
		c.adicionarItem(item2);
		c.adicionarItem(item1);
		c.adicionarItem(item3);
		c.adicionarItem(item4);
		
		// Remove um item do carrinho pelo seu ID (ID 4)
		c.removerItem(4);
		
		// Adiciona um item que já existe no carrinho (ID 3)
		c.adicionarItem(item3);
		
		// Chama o método para calcular e exibir o preço total do carrinho
		c.calcularPreco();
	}

}