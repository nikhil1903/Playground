#include <stdio.h>
int main() {
  int n ;
  scanf("%d",&n);
  int l=n%10;
  int s;
  while(n/10!=0)
  {
    n=n/10;
  }
  s=l+n;
  printf("%d",s);
	//Type your code
	return 0;
}