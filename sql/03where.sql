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
# 1,2,5 카테고리ID인 상품들 조회
# 일본, 독일에 있는 공급자 조회(Suppliers)

