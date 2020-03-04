#include <stdio.h> 
#include <sys/types.h> 
#include <unistd.h> 
void main() x
{ 
    int pid=fork(); 
    if(pid<0)
        printf("Process creation failed"); 
    else if(pid==0)
        printf("\nChild process executing\n PID: %d\nParent PID: %d\n",getpid(),getppid()); 
    else 
        printf("\nParent process executing\n PID: %d\n",getpid());
} 
