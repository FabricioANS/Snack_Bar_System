package application;

public class Main {
	
	public static void main(String [] args){
		
		Item item1 = new Item("Carne", 25, 1);
		Item item2 = new Item("Frango", 23.99, 2);
		Item item3 = new Item("Coca-Cola", 21.99, 3);
		Item item4 = new Item("Kuat", 20.99, 4);
		
		
		Carrinho c = new Carrinho();
		
		c.adicionarItem(item2);
		c.adicionarItem(item1);
		c.adicionarItem(item3);
		c.adicionarItem(item4);
		
		c.removerItem(4);
		c.adicionarItem(item3);
		
		c.calcularPreco();
	}

}
