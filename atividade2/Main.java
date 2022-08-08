import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int escolha;
    Scanner leitor = new Scanner(System.in);
    do {
      System.out.printf("Escolha entre as opções:\n");
      System.out.printf(" 1. entrar no modo fila\n");
      System.out.printf(" 2. entrar no modo de teste da lista\n> ");
      escolha = leitor.nextInt() - 1;
      if (escolha != 0 || escolha != 1) {
        System.out.printf("Opção inválida!");
      }
    } while (escolha != 0 || escolha != 1);
    if (escolha == 0) { fila(); }
    else { lista(); }
  }

  private static void fila() {
    Scanner leitor = new Scanner(System.in);
    Fila fila = new Fila();
    Dado dado = null;
    int escolha = -1;
    do {
      fila.printa();
      escolha = escolha_fila();
      switch (escolha) {
      case 1:
        System.out.printf("Insira um número:\n> ");
        dado = new Dado(leitor.nextInt());
        fila.adiciona_no_fim(dado);
        break;
      case 2:
        dado = fila.remove_do_inicio();
        if (dado != null) {
          System.out.printf("Número removido: ");
          System.out.printf("%d\n", dado.get_dado());
        } else {
          System.out.printf("ERRO: não foi possível remover como solicitado!\n");
        }
        break;
      }
    } while (escolha != 0);
  }

  private static void lista() {
    Scanner leitor = new Scanner(System.in);
    Lista lista = new Lista();
    Dado dado = null;
    int posicao, escolha = -1;
    do {
      lista.printa();
      escolha = escolha_lista();
      switch (escolha) {
      case 1:
        System.out.printf("Insira um número:\n> ");
        dado = new Dado(leitor.nextInt());
        lista.adiciona_no_inicio(dado);
        break;
      case 2:
        System.out.printf("Insira um número:\n> ");
        dado = new Dado(leitor.nextInt());
        lista.adiciona_no_fim(dado);
        break;
      case 3:
        System.out.printf("Insira um número:\n> ");
        dado = new Dado(leitor.nextInt());
        System.out.printf("Insira a posição:\n> ");
        posicao = leitor.nextInt();
        lista.adiciona_na_posicao(posicao - 1, dado);
        break;
      case 4:
        dado = lista.remove_do_inicio();
        if (dado != null) {
          System.out.printf("Número removido: ");
          System.out.printf("%d\n", dado.get_dado());
        } else {
          System.out.printf("ERRO: não foi possível remover como solicitado!\n");
        }
        break;
      case 5:
        dado = lista.remove_do_fim();
        if (dado != null) {
          System.out.printf("Número removido: ");
          System.out.printf("%d\n", dado.get_dado());
        } else {
          System.out.printf("ERRO: não foi possível remover como solicitado!\n");
        }
        break;
      case 6:
        System.out.printf("Insira a posição:\n> ");
        posicao = leitor.nextInt();
        dado = lista.remove_da_posicao(posicao - 1);
        if (dado != null) {
          System.out.printf("Número removido: ");
          System.out.printf("%d\n", dado.get_dado());
        } else {
          System.out.printf("ERRO: não foi possível remover como solicitado!\n");
        }
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
