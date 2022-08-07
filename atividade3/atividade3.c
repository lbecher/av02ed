#include<atividade3.h>

int main() {
  int i, MAX;

  printf("Quantos valores você deseja armazenar no vetor?\n");
  scanf("%d", &MAX);
  int vet[MAX];

  printf("\n");
  for (i = 0; i < MAX; i++) {
    printf("Digite o %dº valor: ",i+1);
    scanf("%d", &vet[i]);
  }

  if(MAX>1)
    ordenacao_shellsort(vet, MAX);

  if(MAX<1){
    printf("Não existem elementos para serem ordenados");
    }else{
        printf("Vetor ordenado: ");
        for (i = 0; i < MAX; i++) {
          printf("%d ", vet[i]);
        }
  };
  
  return 0;
}

void ordenacao_shellsort(int *a, int size) {
  int i, j, value;
  int h = 1;

  //define quantas posições h 
  do {
    h = 3 * h + 1;
  } while (h < size);

  // ordena
  do {
    h /= 3;
    for (i = h; i < size; i++) {
      value = a[i];
      j = i - h;

      while (j >= 0 && value < a[j]) {
        a[j + h] = a[j];
        j -= h;
      }
      a[j + h] = value;
    }
  } while (h > 1);
}
