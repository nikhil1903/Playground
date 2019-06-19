#include <stdio.h>
#include<math.h>

int main() {
  int n;
  scanf("%d",&n);
  int count=0;
  int b=0;
  int c=n;
  int d=n;
  
  while(n!=0)
  {
 
   
       n=n/10;
    ++count;
  }
    while(c!=0)
  {
 b=b+pow((c%10),count);
      c=c/10;
  }
  if(d==b)
  {printf("Armstrong Number");
  }
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}