# WHERE : 행(레코드, 데이터, record, row)을 선택(filter)

# 9개 행
SELECT *
FROM Employees;

# 1개 행
SELECT *
FROM Employees
WHERE EmployeeID = 3;

# 3개 행
SELECT *
FROM Employees
WHERE EmployeeID < 4;

#4개의 행
SELECT *
FROM Employees
WHERE BirthDate BETWEEN '1950-01-01' AND '1959-12-31';

#5개 행
SELECT *
FROM Employees
WHERE Notes LIKE '%BA%';


# 연산자
# = : 같다
SELECT *
FROM Customers;

SELECT *
FROM Customers
WHERE Country = 'UK';

# 연습 : 미국인 고객들 조회
SELECT *
FROM Customers
WHERE Country = 'USA';

# 연습 : 특정 도시에 있는 고객들 조회
SELECT *
FROM Customers
WHERE City = 'London';

SELECT *
FROM Customers
WHERE City = 'london';

SELECT *
FROM Customers
WHERE City = 'LONDON';

# 비교연산자
# !=, <> : 같지 않다.
# >, >=, <, <=
SELECT *
FROM Customers
WHERE City != 'london';

SELECT *
FROM Customers
WHERE City <> 'london';

# 연습 : 미국에 있지 않는 고객들 조회
#        스웨덴에 있지 않는 고객들 조회
SELECT *
FROM Customers
WHERE Country <> 'USA'; # 78 rows
SELECT *
FROM Customers
WHERE Country != 'Sweden';
# 89 rows

# >, >=, <, <=
SELECT *
FROM Customers
WHERE CustomerID < 5; # 수형식은 따옴표 안써도됨 (보통안씀)
SELECT *
FROM Customers
WHERE CustomerID <= 5;
SELECT *
FROM Customers
WHERE CustomerID > 88;
SELECT *
FROM Customers
WHERE CustomerID >= 88;
SELECT *
FROM Customers
WHERE CustomerName >= 'T';
SELECT *
FROM Customers
WHERE CustomerName >= 't';
SELECT *
FROM Customers
WHERE CustomerName < 'D';
SELECT *
FROM Customers
WHERE CustomerName < 'd';

# 연습 :
# Products (상품) 테이블 조회
# Price(가격)이 50 미만인 상품들
# Price(가격)이 80 이상인 상품들

# Orders (주문) 테이블 조회
# OrderDate(주문날짜) 가 1998년 1월 1일 이후(포함)인 데이터 조회
# OrderDate(주문날짜) 가 1996년 12월 31일 이전(포함)인 데이터 조회