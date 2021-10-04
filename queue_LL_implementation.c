#include <stdio.h>
#include <stdlib.h>
struct node{
  int data;
  struct node *next;
};
struct queue{
  struct node *front;
  struct node *rear;
};
struct queue *create(){
  struct queue *q=(struct queue*)malloc(sizeof(struct queue));
  q->front=q->rear=NULL;
  return q;
}
struct node *newNode(){
  struct node *n=(struct node*)malloc(sizeof(struct node));
  int info;
  printf("\nEnter a number to be inserted\n");
  scanf("%d",&info);
  n->data=info;
  n->next=NULL;
  return n;
}
void enqueue(struct queue *q){
  struct node *insert=newNode();
  if(q->rear==NULL){
    q->front=q->rear=insert;
    return;
  }
  q->rear->next=insert;
  q->rear=insert;
}
void dequeue(struct queue *q){
  if(q->front==NULL){
    printf("\nQueue underflow\n");
    return;
  }
  struct node *temp=q->front;
  q->front=q->front->next;
  if(q->front==NULL){
    q->rear=NULL;
    return;
  }
  printf("\n%d dequeued\n",temp->data);
  free(temp);
}
void print_queue(struct queue *q){
  printf("\n");
  struct node *p=q->front;
  while(p!=NULL){
    printf("%d ",p->data);
    p=p->next;
  }
  printf("\n");
}
int main(){
  struct queue *q=create();
  char ch;
  printf("Enter a character to perform the following operations\n");
  printf("\ne->enqueue,d->dequeue,p->print queue,q->quit\n");
  ch=getche();
  while(ch!='q'){
    switch(ch){
      case 'e': ;
      enqueue(q);
      break;
      case 'd': ;
      dequeue(q);
      break;
      case 'p': ;
      print_queue(q);
      break;
      case 'q': ;
      break;
      default:
      printf("\nWrong choice\n");
      break;
    }
    printf("Enter a character to perform the operations\n");
    ch=getche();
  }
}
