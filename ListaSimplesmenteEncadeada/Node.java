package ListaSimplesmenteEncadeada;

public class Node {
	private int valor;
	private Node next;
	
	public Node() {}
	
	public Node(int valor) {
		this.valor = valor;
		next =  null;
	}
	
	public Node(int valor, Node next) {
		this.valor = valor;
		this.next = next;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void exibir() {
		System.out.println("Valor: " + valor);
	}
}
