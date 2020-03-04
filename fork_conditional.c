#include <stdio.h> 
#include <sys/types.h> 
#include <unistd.h> 
void main() 
{ 
    int a=0,pid=0;
    pid=fork();
    if (pid == 0){ 
        a+=5; 
        printf("%d, %d\n",a,&a); 
        printf("%d",getpid());
    } 
    printf("%d",getpid());

} 
