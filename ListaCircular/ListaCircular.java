package ListaCircular;

public class ListaCircular implements ListaCircularTAD{
	private int tamanho = 0;
	private Node head;
	private Node tail;
	
	public ListaCircular() {
	}
	
	public Node getHead() {
		return head;
	}

	public int Tamanho() {
		return tamanho;
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public void inserirInicio(int info) {
		if (estaVazia()) {
			head = new Node(info, head, head);
			tail = head;
		}
		else {
			Node temp =  head;
			head = new Node (info, temp, tail);
			temp.setAnte(head);
			tail.setProx(head);
		}
		tamanho++;
	}
	public void removerInicio() {
		if (estaVazia()) System.out.println("Lista Vazia");
		else {
			head = head.getProx();
			head.setAnte(tail);
			tail.setProx(head);
		}
		tamanho--;
	}
	
	public void inserirFim(int info) {
		if (estaVazia()) {
			tail = new Node(info, tail, tail);
			head = tail;
		}
		else {
			Node temp =  tail;
			tail = new Node (info, head, temp);
			temp.setProx(tail);
			head.setAnte(tail);
		}
		tamanho++;
	}
	public void removerFim() {
		if (estaVazia()) System.out.println("Lista Vazia");
		else {
			tail = tail.getAnte();
			tail.setProx(head);
			head.setAnte(tail);
		}
		tamanho--;
	}
	
	public Node buscar(int info) {
		Node temp = head;
		for(int i = 0; i < tamanho; i++) {
			if (temp.getInfo() == info) {
				return temp;
			}
			temp = temp.getProx();
		}
		System.out.println("Info '" + info + "' nao existe");
		return null;
	}
	
	public void remover (int info) {
		Node temp = buscar(info);
		if(temp == null) return;
		temp.getAnte().setProx(temp.getProx());
		temp.getProx().setAnte(temp.getAnte());
		tamanho--;
	}
	
	public boolean igual(ListaCircular lista) {
		if (this.tamanho != lista.Tamanho()) return false;
		Node temp = head;
		Node temp2 = lista.getHead();
		for(int i = 0; i < tamanho; i++) {
			if (temp.getInfo() != temp2.getInfo()) return false;
			temp = temp.getProx();
			temp2 = temp2.getProx();
		}
		return true;
	}
	
 	public void exibir() {
		Node indice = head;
		for(int i = 0; i < tamanho; i++) {
			indice.exibir();
			indice = indice.getProx();
		}
		System.out.println("----");
	}
}
