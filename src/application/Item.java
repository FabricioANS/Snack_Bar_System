package application;

// Declaração da classe Item
public class Item {
	
	// Atributos privados da classe Item
	private int codigo;
	private String nome;
	private double preco;
	
	// Construtor da classe Item, usado para criar novos objetos
	// Ele recebe nome, preço e código como parâmetros
	public Item (String nome, double preco, int codigo) {
		this.nome = nome; // Atribui o nome recebido ao atributo da classe
		this.preco = preco; // Atribui o preço recebido ao atributo da classe
		this.codigo = codigo; // Atribui o código recebido ao atributo da classe
	}

	// Método "getter" para obter o nome do item
	public String getNome() {
		return nome;
	}

	// Método "setter" para modificar o nome do item
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método "getter" para obter o preço do item
	public double getPreco() {
		return preco;
	}

	// Método "setter" para modificar o preço do item
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// Método "getter" para obter o código do item
	public int getCodigo() {
		return codigo;
	}

	// Método "setter" para modificar o código do item
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Método para exibir as informações do item no console
	public void apresentar() {
		System.out.println("Nome do Item: "+nome+", Preço: "+preco+", com o Código: "+codigo);
	}

}