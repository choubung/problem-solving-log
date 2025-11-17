2025.11.17.
<br>

## 🤨 접근
### 🧬 로직
- nums, profit, outcome, count, max
- 맨 뒤 숫자를 max로 둠
- i는 뒤부터 앞으로
  - 만약 nums[i]가 max보다 작거나 같으면
    - count++
    - outcome += num[i]
  - 만약 nums[i]가 max보다 크면
    - profit += count*max - outcome
    - max = nums[i], outcome = 0, count = 0;
- profit += count*max - outcome
- 
<br>

## 🤯 실수
### 오버플로우
- 연산 과정에서 발생할 오버플로우를 고려하지 않고 자료형을 int로 정해 문제가 생김...
- long으로 바꿔주니 바로 pass 되었다.

  <br>

## 🛠️ 리팩토링
- count와 income을 따로 저장하지 않고, for문 안에서 바로 바로 매수/매도를 해 주면 코드가 더 간결해질 수 있다.

## ✨ 소회
- 알고리즘 때 그리디 배운 게 생각이 나긴 나는구나…!
- 오버플로우 나는 문제를 별로 안 풀어봐서 오류의 원인일 거라고는 생각도 못 했다.. 당연히 내 로직에 문제가 있는 줄…
- 오늘은 코드 작성 전에 로직을 정리했다. 확실히 이러니 코딩할 때 구현에만 집중하면 돼서 편한 것 같다.