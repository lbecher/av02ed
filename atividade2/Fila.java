public class Fila extends Lista {
	
	public Fila() {
		super();
	}
	
	public int get_topo() {
		return this.get_tamanho();
	}
	
	@Override
	public void adiciona_no_inicio(Dado dado) {
		System.out.printf("Método não implementado para Fila!\n");
	}
	
	@Override
	public void adiciona_na_posicao(int i, Dado dado) {
		System.out.printf("Método não implementado para Fila!\n");		
	}
	
	@Override
	public Dado remove_do_fim() {
		System.out.printf("Método não implementado para Fila!\n");
		return null;
	}
	
	@Override
	public Dado remove_da_posicao(int i) {
		System.out.printf("Método não implementado para Fila!\n");
		return null;
	}
}
