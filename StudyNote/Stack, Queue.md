# Stack 스택

스택은 **한쪽 끝에서만 자료를 넣고 뺄 수 있는 자료구조**로, **후입선출** 구조(LIFO : Last-In, First-Out)를 갖는다. **마지막에 있는 것만 의미를 갖는다**면 스택을 사용하여 효과적으로 구현할 수 있다.

cf ) Java는 stack 라이브러리가 존재하니 이를 사용하는 것이 좋다.

### 구현하기

- **일차원 배열**로 구현하며, size는 스택의 크기를 나타낸다.

    ```c
    int stack[10000];
    int size = 0;
    ```
- top 포인터: 스택에 가장 나중에 삽입된 원소를 가리키며, 그 위치에 해당하는 배열의 인덱스값을 갖는다.

    ```c
    int top = -1
    ```
- push : 스택에 자료를 추가하는 연산이다.

    ```c
    void push(int data){
    	stack[size] = data;
    	size += 1;
    }
    ```

- pop : 스택의 자료를 삭제하는 연산이다.

    ```c
    int pop(){
    	if (top<0){ // if(empty()) --> empty stack 인 경우
    		return -999;  // 쓰레기값 
    	}
    	return stack [top--];
    }

    // empty와 size 를 사용하면
    int pop(){
    	if(empty()) return -1;
    	else {
    		size -=1;
    		return stack[size-1];
    	 }
    }

    ```
---
# Queue 큐

큐는 **한쪽 끝에서만 자료를 넣고 다른 한쪽 끝에서만 자료를 빼낼 수 있는 자료구조**로, **선입선출**(FIFO : First-In, Last-out) 구조를 갖는다. 스택과 달리, 순차적으로 자료를 다뤄야 할 때 사용하면 좋고, 그래프 유형, BFS 유형에서 많이 사용된다.

cf ) Java의 경우에는 이미 정의된 java.util.Queue를 사용하자 !

### Queue 의 구현

- 큐는 일차원 배열 하나로 구현할 수 있다.

    ```c
    int queue[10000];
    ```

- 포인터를 두 개(begin, end) 사용하며, [begin,end) 구간에 데이터가 존재한다. (begin 포함, end 는 포함하지 않음)

    ```c
    int begin = 0;    
    int end = 0;      
    ```

- push : 큐의 end부분에 자료를 넣는 연산이다.

    ```c
    // end 포인터가 가리키는 부분에 데이터를 넣고, end를 1만큼 증가시킨다.
    void push(int data){
    	queue[end] = data;
    	end += 1;
    }
    ```

- pop : 큐에 가장 먼저 들어간 자료를 빼는 연산이다.

    ```c
    // begin 부분의 값을 의미 없는 값으로 바꾸고, begin을 1만큼 증가시킨다.
    int pop(){
    	queue[begin] = 0;
    	begin += 1;
    }
    ```

- empty :  큐가 비어있는지 아닌지를 판단할 수 있는 연산이다. begin과 end가 같으면 비어있다고 판단하고, 다르면 비어있지 않다고 판단한다.

    ```c
    bool empty(){
    	if (begin == end) return true;
    	else return false;
    }
    ```

- size : 큐에 자료가 몇개나 저장되어있는지 알아보는 연산이다.

    ```c
    int size(){
    	return end-begin;
    }
    ```

cf . 참고 -수업때 배운 queue 구현 코드

```c
#define QUEUE_SIZE 100
int queue[QUEUE_SIZE];
int rear = -1;
int front = -1;
void addq(int item);   // push
int deleteq();   // pop

void main(){
	// .. 코드 
}

void addq(int item){
	if(rear == QUEUE_SIZE -1){   // 큐가 꽉 찬 경우
		printf("QUEUE Full. Item not added.");
		return;
	}
	queue[++rear] = item;
}

int deleteq(){
	if (front == rear){      // 두 값이 같아지면 빈큐가 된다.
		printf("Queue Empty");
		return -999;
	}
	return queue[++front];
}
```
