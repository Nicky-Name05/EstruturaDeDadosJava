package ListaDuplamenteEncadeada;

public class ListaDupla implements ListaDuplaTAD{
	private int tamanho = 0;
	private Node head;
	private Node tail;
	
	public int Tamanho() {
		// TODO Auto-generated method stub
		return tamanho;
	}

	@Override
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return tamanho == 0;
	}

	public void inserirInicio(int valor) {
		// TODO Auto-generated method stub
		if(head == null) {
			head = new Node(valor);
			tail = head;
		}
		else {
			Node temp = head;
			head = new Node(valor, temp, null);
			temp.setPrev(head);
		}
		tamanho++;
	}

	public void removerInicio() {
		// TODO Auto-generated method stub
		if(estaVazia()) {
			System.out.println("Lista Vazia");
			return;
		}
		head = head.getNext();
		head.setPrev(null);
		tamanho--;
	}
	
	public Node busca(int valor) {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp != null) {
			if(temp.getValor() == valor) {
				System.out.print("Existe: ");
				temp.exibir();
				return temp;
			}
			temp = temp.getNext();
		}

		System.out.println("Não exite");
		return null;
	}

	public void remover(int valor) {
		// TODO Auto-generated method stub
		Node temp = busca(valor);
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		tamanho--;
	}

	public void exibir() {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp != null) {
			temp.exibir();
			temp = temp.getNext();
		}
	}

	public void inserir(int valor) {
		// TODO Auto-generated method stub
		if(tail == null) {
			tail = new Node(valor);
			head = tail;
		}
		else {
			Node temp = tail;
			tail = new Node(valor, null, temp);
			temp.setNext(tail);
		}
		tamanho++;
	}

	@Override
	public void removerFim() {
		// TODO Auto-generated method stub
		if(estaVazia()) {
			System.out.println("Lista Vazia");
			return;
		}
		tail = tail.getPrev();
		tail.setNext(null);
		tamanho--;
	}

}
