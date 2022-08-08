public class Fila extends Lista {
  // construtor
  public Fila() {
    // executa o construtor da superclasse
    super();
  }
  
  // métodos
  public int get_topo() {
    return this.get_tamanho();
  }
  
  // métodos que serão sobrescritos
  // pois não são utilizados na fila
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
