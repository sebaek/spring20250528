USE mydatabase;

# STRING
# VARCHAR(길이)
CREATE TABLE table4
(
    col1 VARCHAR(1),
    col2 VARCHAR(3),
    col3 VARCHAR(5)
);
INSERT INTO table4
    (col1, col2, col3)
VALUES ('a', 'abc', 'abcde');
INSERT INTO table4
    (col1, col2, col3)
VALUES ('ab', 'abc', 'abcde');
INSERT INTO table4
    (col1, col2, col3)
VALUES ('한', 'abc', 'abcde');
INSERT INTO table4
    (col1, col2, col3)
VALUES ('한글', 'abc', 'abcde');
SELECT *
FROM table4;

# 연습
# id (최대8글자), name(최대20글자) 컬럼이 있는 table5 만들기
# 두 개의 레코드 입력(성공)
# 실패하는 레코드 입력 시도


# NUMBER
# DATE,TIME