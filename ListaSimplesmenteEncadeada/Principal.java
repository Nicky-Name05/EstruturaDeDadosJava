package ListaSimplesmenteEncadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lista simplesmente encadeada");
		ListaSimples lista = new ListaSimples();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.exibir();

        lista.inserir(5);

        System.out.println("Após inserir 5 no início: ");
        lista.exibir();

        lista.inserirFim(40);

        System.out.println("Após inserir 40 no fim: ");
        lista.exibir();

        lista.remover(20);

        System.out.println("Após remover 20 (meio): ");
        lista.exibir();

        lista.removerInicio();

        System.out.println("Após removerInicio() (remove 5): ");
        lista.exibir();

        lista.removerFim();

        System.out.println("Após removerFim() (remove 40): ");
        lista.exibir();

        System.out.println("busca 10: ");
        lista.busca(10);
        System.out.println("busca 99: ");
        lista.busca(99);
        System.out.println("Tamanho: " + lista.Tamanho());
        System.out.println("Está vazia? " + lista.estaVazia());
	}

}
