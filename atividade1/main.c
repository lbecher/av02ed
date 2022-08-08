#include "atividade1.h"

int main() {
  tipo_grafo *gr;
  int escolha = 0, max, i, v1, v2;
  float peso;

  printf("Inicializando o grafo!\nQual o número máximo de vértices do seu grafo?\n> ");
  scanf("%d", &max);

  gr = cria(max);

  do {
    do {
      printf("\nEscolha a opcao que deseja realizar:\n 1. inserir conexão no grafo\n 2. imprimir grafo\n 3. finalizar programa\n> ");
      scanf("%d", &escolha);
      if (escolha < 0 || escolha > 3) {
        printf("\nEscolha inválida!\n");
      }
    } while (escolha < 0 || escolha > 3);

    switch (escolha) {
      case 1:
        printf("Qual vértice deseja conectar?\n> ");
        scanf("%d", &v1);
        printf("Qual vértice é o adjacente de %d?\n> ", v1);
        scanf("%d", &v2);
        printf("Qual o peso?\n> ");
        scanf("%f", &peso);
        insere_aresta(gr, v1, v2, peso);
        break;
      case 2:
        imprime(gr);
        break;
      case 3:
        printf("Até logo!\n");
        break;
    }
  } while (escolha != 3);
  return 0;
}
