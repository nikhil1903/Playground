#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int b=1;
  while(n!=0)
  {
    b=b*n;
    n--;
  }
  printf("%d",b);
	//Type your code
	return 0;
}