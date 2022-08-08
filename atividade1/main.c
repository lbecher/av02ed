#include "atividade1.h"

int main() {
  Grafo *gr;
  int escolha = 0, max, i;
  tipo_vertice v1, v2;
  float peso;
  printf("Inicializando o grafo!\nQual o número máximo de vértices do seu "
         "grafo?\n");
  scanf("%d", &max);
  gr = cria(max);
  do {
    printf("Escolha a opcao que deseja realizar:\n1- inserir conexão no "
           "grafo\n2- imprimir grafo \n3- finalizar programa\n");
    scanf("%d", &escolha);
    if (escolha < 0 || escolha > 3) {
      printf("\n\nEscolha inválida. Digite 1, 2 ou 3\n");
    }
    switch (escolha) {
    case 1:
      printf("Qual vértice deseja conectar?\n");
      scanf("%d", &v1);
      printf("Qual vértice é o adjacente de %d?\n", v1);
      scanf("%d", &v2);
      printf("Qual o peso?\n");
      scanf("%f", &peso);
      insere_conexao(gr, v1, v2, peso);
      printf("Conexão inserida!\n");
      break;
    case 2:
      imprime(gr);
      break;
    case 3:
      printf("Até logo");
      break;
    }
  } while (escolha != 3);
  return 0;
}
