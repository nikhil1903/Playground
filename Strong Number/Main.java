#include <stdio.h>
int main() {
  int n;
  int d;
  scanf("%d",&n);
  int s=0;
  d=n;
  int m=1;
  int a;
  while(n!=0)
  {a=n%10;
   while(a!=0)
   {m=m*a;
    a--;
   }
   s=s+m;
   n=n/10;
   m=1;}
  if(d==s)
  printf("Yes");
else
  printf("No");
  
	//Type your code
	return 0;
}