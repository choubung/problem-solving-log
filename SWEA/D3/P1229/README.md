2025.11.03.
<br>

## 🤨 접근
### 🧬 로직

<aside>
- 암호문의 길이를 입력받는다
- 암호문 길이만큼 원본 암호문을 각각의 요소로 입력받는다
- 명령어의 개수를 입력받는다
- 명령어의 개수만큼 반복한다
    - 명령어 종류를 입력받는다
    - 명령어 적용 시작 지점(x)를 입력받는다
    - 명령어 적용 개수(y)를 입력받는다
        - 만약 명령어가 D이면
            - x부터 y개만큼 지우기
        - 만약 명령어가 I이면
            - x+0부터 x+y까지 숫자 삽입하기
    - 결과를 출력한다.
</aside>

### 📑 새로운 문법(API)
- **List**

    <aside>

  `.add(Object obj)` : 맨 뒤에 요소 추가

  `.add(int index, Object obj)` : index에 obj 추가

  `.remove(int index)` : index번째 요소 삭제 (뒤의 요소들을 하나씩 땡김)

  `.remove(int index, ArrayList arr)` : index 위치에 arr 리스트 전체를 삽입

  `.subList(int startIdx, int endIdx)` : 시작 위치부터 끝 위치 전까지의 범위 지정

  `.clear()` : 삭제

    </aside>
<br>

## 🤯 실수
### StringBuilder
- `toString()` 사용 시 괄호 잊지 말기

### remove() 사용 미숙
- 삭제 시 뒤의 요소들이 하나씩 앞으로 옮겨진다는 걸 간과했다
<br>

## ✨ 소회
- 확실히 ArrayList에 엄청 약하다…! 자바 내장 API를 열심히 공부하자