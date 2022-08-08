#include "atividade3.h"

int main() {
  int i, MAX;

  printf("Quantos valores você deseja armazenar no vetor?\n> ");
  scanf("%d", &MAX);
  int vet[MAX];

  printf("\n");
  for (i = 0; i < MAX; i++) {
    printf("Digite o %dº valor: ", i + 1);
    scanf("%d", &vet[i]);
  }

  ordenacao_shellsort(vet, MAX);

  printf("\nVetor ordenado: ");
  for (i = 0; i < MAX; i++) {
    printf("%d ", vet[i]);
  }
  printf("\n");

  return 0;
}
