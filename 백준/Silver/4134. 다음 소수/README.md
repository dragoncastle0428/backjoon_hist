# [Silver IV] 다음 소수 - 4134 

[문제 링크](https://www.acmicpc.net/problem/4134) 

### 성능 요약

메모리: 31120 KB, 시간: 84 ms

### 분류

브루트포스 알고리즘, 수학, 정수론, 소수 판정

### 제출 일자

2024년 5월 7일 11:57:02

### 문제 설명

<p>
	정수 n(0 ≤ n ≤ 4*10<sup>9</sup>)가 주어졌을 때, n보다 크거나 같은 소수 중 가장 작은 소수 찾는 프로그램을 작성하시오.</p>

### 입력 

 <p>
	첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.</p>

### 출력 

 <p>
	각각의 테스트 케이스에 대해서 n보다 크거나 같은 소수 중 가장 작은 소수를 한 줄에 하나씩 출력한다.</p>

 ### 해결방법
 
 <p>
	다소 과한 방법이긴 했는 밀러 - 라빈 소수 판별법을 사용해서 풀게 되었다. 
 	더 쉬운 방법으로는 2부터 root(n)까지 나눠보고 맞으면 출력하는 방식이다.</p>
