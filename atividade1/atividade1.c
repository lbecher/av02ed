#include "atividade1.h"

Grafo cria(int max) {
  int i;
  Grafo gr = malloc(sizeof *gr);
  gr->n_vertices = max;
  gr->n_aresta = 0;
  gr->conexao = malloc(max * sizeof(no *));
  for (i = 0; i < max; i++) {
    gr->conexao[i] = NULL;
  }
  return gr;
}

void insere_conexao(Grafo gr, int vertice1, int vertice2, float peso) {
  no *p;
  for (p = gr->conexao[vertice1]; p != NULL; p = p->proximo) {
    if (p->nome_vertice == vertice2)
      return;
  }
  p = malloc(sizeof(no));
  p->nome_vertice = vertice2;
  p->peso = peso;
  p->proximo = gr->conexao[vertice1];
  gr->conexao[vertice1] = p;
  gr->n_aresta++;
}

void imprime(Grafo gr) {
  int i;
  no *p;
  printf("Numéro total de vértices= %d; número total de conexões: %d \n \n", gr->n_vertices, gr->n_aresta);
  for (i = 0; i < gr->n_vertices; i++) {
    printf("Vertice %d:",i);
    for (p = gr->conexao[i]; p != NULL; p = p->proximo)
      printf("- %d (%.2f)", p->nome_vertice, p->peso);
    printf("\n");
  }
}

int main() {
  Grafo *gr;
  int escolha = 0, max, i, v1, v2;
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
