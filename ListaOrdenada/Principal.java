package ListaOrdenada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaOrdenada lista  = new ListaOrdenada();

        System.out.println("Está vazia? " + lista.estaVazia());
        
        lista.inserir(10);
        lista.inserir(40);
        lista.inserir(20);
        lista.inserir(50);
        lista.inserir(30);
        
        System.out.println("Lista: ");
        lista.exibir();

        System.out.println("Buscar 20: ");
        lista.busca(20).exibir();

        lista.remover(20);

        System.out.println("Após remover 20: ");
        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Está vazia? " + lista.estaVazia());
	}

}
