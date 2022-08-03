import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    fila();
  }

  private static void fila() {
    Scanner leitor = new Scanner(System.in);
    Fila fila = new Fila();
    int valor, escolha = -1;
    do {
      fila.printa_lista();
      escolha = escolha_fila();
      switch (escolha) {
        case 1:
          System.out.printf("Insira um número:\n> ");
          valor = leitor.nextInt();
          fila.adiciona_no_fim(valor);
          break;
        case 2:
          System.out.printf("Número removido: ");
          valor = fila.remove_do_inicio();
          System.out.printf("%d\n", valor);
          break;
      }
    } while (escolha != 0);
  }

  private static void lista() {
    Scanner leitor = new Scanner(System.in);
    Lista lista = new Lista();
    int valor, posicao, escolha = -1;
    do {
      lista.printa_lista();
      escolha = escolha_lista();
      switch (escolha) {
        case 1:
          System.out.printf("Insira um número:\n> ");
          valor = leitor.nextInt();
          lista.adiciona_no_inicio(valor);
          break;
        case 2:
          System.out.printf("Insira um número:\n> ");
          valor = leitor.nextInt();
          lista.adiciona_no_fim(valor);
          break;
        case 3:
          System.out.printf("Insira um número:\n> ");
          valor = leitor.nextInt();
          System.out.printf("Insira a posição:\n> ");
          posicao = leitor.nextInt();
          lista.adiciona_na_posicao(posicao, valor);
          break;
        case 4:
          System.out.printf("Número removido: ");
          valor = lista.remove_do_inicio();
          System.out.printf("%d\n", valor);
          break;
        case 5:
          System.out.printf("Número removido: ");
          valor = lista.remove_do_fim();
          System.out.printf("%d\n", valor);
          break;
        case 6:
          System.out.printf("Insira a posição:\n> ");
          posicao = leitor.nextInt();
          System.out.printf("Número removido: ");
          valor = lista.remove_da_posicao(posicao);
          System.out.printf("%d\n", valor);
          break;
      }
    } while (escolha != 0);
  }

  private static int escolha_lista() {
    int escolha = -1;
    Scanner leitor = new Scanner(System.in);
    do {
      System.out.printf("Escolha entre as opções:\n");
      System.out.printf(" 0. Sair do programa\n");
      System.out.printf(" 1. Adicionar elemento no começo\n");
      System.out.printf(" 2. Adicionar elemento no fim\n");
      System.out.printf(" 3. Adicionar elemento na posição\n");
      System.out.printf(" 4. Remover elemento do começo\n");
      System.out.printf(" 5. Remover elemento do fim\n");
      System.out.printf(" 6. Remover elemento da posição\n> ");
      escolha = leitor.nextInt();
      if (escolha < 0 || escolha > 7) {
        System.out.printf("Opção inválida!\n");
      }
    } while (escolha < 0 || escolha > 7);
    return escolha;
  }

  private static int escolha_fila() {
    int escolha = -1;
    Scanner leitor = new Scanner(System.in);
    do {
      System.out.printf("Escolha entre as opções:\n");
      System.out.printf(" 0. Sair do programa\n");
      System.out.printf(" 1. Adicionar elemento no fim\n");
      System.out.printf(" 2. Remover elemento do começo\n> ");
      escolha = leitor.nextInt();
      if (escolha < 0 || escolha > 3) {
        System.out.printf("Opção inválida!\n");
      }
    } while (escolha < 0 || escolha > 3);
    return escolha;
  }
}
