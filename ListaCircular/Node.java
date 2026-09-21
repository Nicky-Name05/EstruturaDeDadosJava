package ListaCircular;

public class Node {
	private int info = 0;
	private Node prox;
	private Node ante;
	
	public Node() {
	}
	public Node(int info) {
		this.info = info;
		prox = null;
		ante = null;
	}
	public Node(int info, Node prox, Node ante) {
		this.info = info;
		this.ante = ante;
		this.prox = prox;
	}
	
	public int getInfo() {
		return info;
	}
	
	public void setInfo(int info) {
		this.info = info;
	}
	
	public Node getProx() {
		return prox;
	}
	
	public void setProx(Node prox) {
		this.prox = prox;
	}
	public Node getAnte() {
		return ante;
	}
	public void setAnte(Node ante) {
		this.ante = ante;
	}
	
	public void exibir() {
		System.out.println("Info: " + info);
	}
}
