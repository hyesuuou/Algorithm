# 입출력
### Java의 입출력

- 압력 : Scanner / 출력 : System.out

    ```java
    Scanner sc = new Scanner(System.in);
    ```

- 더 빠른 방법 : BufferedReader 사용

    ```java
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ```

- 출력이 많은 경우 StringBuilder를 사용해서 한 문자열로 만들어 출력을 한 번만 사용하거나,  BufferedWriter 를 사용한다.

### C의 입출력

- 입력 : scanf / 출력: printf
---
# 문제풀이요령
### 1. 테스트 케이스 형식으로 주어지는 경우

각각의 줄을 독립적인 문제로 생각하고 푼다. (한줄한줄 입력받고 출력한다.)

```c
// t로 주어진 경우
int t;
scanf("%d", &t);
while (t-- > 0){
	// 코드
}
```

```c
int t;
scanf("%d",&t);
for (int i=0; i<t; i++){
	// 코드
}
```

### 2. 입력이 몇 개인지 주어지지 않은 경우

입력을 EOF 까지 받는다.

- JAVA 의 경우

    ```java
    while (scanner.hasNextInt()){ }
    ```

- C 의 경우 : scanf의 리턴값은 성공적으로 입력받은 변수의 개수임을 이용한다.

    ```java
    while (scanf("%d %d", &a,&b) == 2)
    ```
