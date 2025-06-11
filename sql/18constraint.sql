USE mydatabase;
# 제약사항(Constraint) : 컬럼에 입력 가능한 값을 제한

# NOT NULL : null 허용 안함
# UNIQUE : 중복 허용 안함
# DEFAULT : 값 안주면 기본값

# NOT NULL
CREATE TABLE table14
(
    col1 INT,
    col2 INT NOT NULL # null 허용 안됨
);
INSERT INTO table14
    (col1, col2)
VALUES (5, 1);

INSERT INTO table14
    (col1, col2)
VALUES (null, 1);

INSERT INTO table14
    (col2)
VALUES (11);

INSERT INTO table14
    (col1, col2)
VALUES (11, null);

INSERT INTO table14
    (col1)
VALUES (11);

SELECT *
FROM table14;

# 연습
# (name varchar not null), (address varchar) table15 만들기


# Primary Key : 주키(PK), 키
# Foreign Key : 외래키(FK), 참조키