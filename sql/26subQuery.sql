# sub query : 쿼리 안의 쿼리
USE mydatabase;

# 한 번도 주문된 적 없는 상품 목록
SELECT p.ProductID, p.ProductName
FROM w3schools.OrderDetails od
         RIGHT JOIN w3schools.Products p on od.ProductID = p.ProductID
WHERE od.OrderDetailID IS NULL
ORDER BY p.ProductID;

# 1. 주문된 적 있는 상품 ID
SELECT ProductID
FROM w3schools.OrderDetails;

# 2. 위 쿼리결과 에 없는 상품 ID 들
SELECT ProductID, ProductName
FROM w3schools.Products
WHERE ProductID NOT IN (SELECT ProductID
                        FROM w3schools.OrderDetails);

# 상품과 카테고리 정보 조회
SELECT Products.ProductID, ProductName, CategoryName
FROM w3schools.Products
         JOIN w3schools.Categories c on Products.CategoryID = c.CategoryID;

SELECT ProductID,
       ProductName,
       (SELECT CategoryName
        FROM w3schools.Categories c
        WHERE c.CategoryID = p.CategoryID) CategoryName
FROM w3schools.Products p;

# 연습
# 1996-08-01 에 주문 처리한 직원명 조회
# JOIN, Sub Query
SELECT o.OrderDate, e.FirstName, e.LastName
FROM w3schools.Orders o
         JOIN w3schools.Employees e
              ON o.EmployeeID = e.EmployeeID
WHERE OrderDate = '1996-08-01';
SELECT OrderDate,
       (SELECT e.FirstName
        FROM w3schools.Employees e
        WHERE e.EmployeeID = o.EmployeeID)
FROM w3schools.Orders o
WHERE OrderDate = '1996-08-01';

# 연습
# 상품의 평균가격보다 높은 상품들 조회
# sub query

