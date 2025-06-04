# OR
SELECT *
FROM Customers
WHERE City = 'Barcelona'
   OR City = 'Bern'
   OR City = 'Lisboa';

# IN
SELECT *
FROM Customers
WHERE City IN ('Barcelona', 'Bern', 'Lisboa');

# 연습 (IN)
# 미국, 영국, 스웨덴에 있는 고객들 조회
SELECT *
FROM Customers
WHERE Country IN ('usa', 'uk', 'sweden');
# 22

# 1,2,5 카테고리ID인 상품들 조회
SELECT *
FROM Products
WHERE CategoryID IN (1, 2, 5);
#31
# 일본, 독일에 있는 공급자 조회(Suppliers)
SELECT *
FROM Suppliers
WHERE Country IN ('germany', 'japan');
# 5개


# AND
SELECT *
FROM Products
WHERE Price >= 50.00
  AND Price <= 59.99;

# BETWEEN AND
SELECT *
FROM Products
WHERE Price BETWEEN 50.00 AND 59.99;
# 두 값 모두 포함

# 연습 : 1950년대 태어난 직원들 조회
#        1997년 7월에 주문한 주문 데이터 조회 (Orders)




