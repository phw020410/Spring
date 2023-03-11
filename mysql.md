# MySql

### Create Table
```sql
create table table_name(column_name datatype [DEFAULT expr] [column_constraint] [table_constraint])
```
column_constraint - 컬럼 수준에서 제약 조건을 거는 것
table_constraint - 테이블 수준에서 제약 조건을 거는 것

#### 제약조건
NOT NULL - 해당 컬럼에 null이 들어가면 안됨
UNIQUE - 해당 컬럼 및 컬럼 조합 값이 유일해야 함
PRIMARY KEY - 각 행을 유일하게 식별하도록
REFERENCES TABLE - 외래키로서 부모키와 관계를 가짐
CHECK - 해당 컬럼에 특정 조건을 항상 만족시키도록 함

## 큰 파일은 어떻게 저장할까?
큰 파일의 경우 따로 파일 서버를 만들고,
DB에는 파일을 저장하는 것이 아닌, 찾으려는 파일 서버의 주소
즉, 주소:포트/디렉토리.../파일
이런 식의 url 주소를 저장