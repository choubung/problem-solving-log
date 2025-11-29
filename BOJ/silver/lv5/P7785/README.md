2025.11.27 | 회사에 있는 사람
<br>

## 🤨 접근
***
### 🧬 로직
- enter인 경우 set에 이름을 넣고, leave이면 뺀다.
- TreeSet을 사용해 정렬을 최적화한다.

### 📑 새로운 문법(API)

```java
TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());
```

- 객체 생성 시 비교자를 넣으면 역순 정렬 설정이 가능함

### 🔑 TreeSet
- **특징**
    - 이진 탐색 트리(Red-Black Tree) 기반
    - 데이터가 **자동으로 정렬**된 상태로 유지
- **시간복잡도:**
    - 삽입/삭제: $O(\log N)$
    - 최종 출력: (이미 정렬되어 있으므로) $O(N)$
      ⇒ 총 $O(N \log N)$

- **장점**
    - 문제에서 요구하는 "사전 순의 역순" 출력을 위해 별도의 정렬 과정을 구현할 필요가 없음(Comparator만 넣으면 끝)

<br>

## 🤯 실수
***
### 역순 정렬
- 처음엔 descendingSet()를 사용했는데 역순으로 정렬되지 않음

<br>

## ✨ 소회
***
- Collections API를 많이 알아두는 게 유용할 것 같다.
- 단순 존재 여부는 HashSet, 정렬까지 필요하면 TreeSet. 필요시 생성자에 Comparator를 넣기