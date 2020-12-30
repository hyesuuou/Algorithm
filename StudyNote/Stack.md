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
