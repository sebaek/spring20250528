USE w3schools;

create table w3schools.Products
(
    ProductID   int auto_increment
        primary key,
    ProductName varchar(255)   null,
    SupplierID  int            null,
    CategoryID  int            null,
    Unit        varchar(255)   null,
    Price       decimal(10, 2) null,
    constraint Products_ibfk_1
        foreign key (CategoryID) references w3schools.Categories (CategoryID)
);

create index CategoryID
    on w3schools.Products (CategoryID);



ALTER TABLE Products
    ADD FOREIGN KEY (CategoryID) REFERENCES Categories (CategoryID);


# 연습
# Products 테이블 SupplierID가 Suppliers의 SupplierID 를
# 참조하는 외래키가 되도록 alter table 실행
# diagram 보기

