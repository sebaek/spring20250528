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
CREATE TABLE table5
(
    id   VARCHAR(8),
    name VARCHAR(20)
);
INSERT INTO table5
    (id, name)
VALUES ('asdfghjk', 'qwertyyuip');
INSERT INTO table5
    (id, name)
VALUES ('가나다라마바사아', 'qwertyyuip');
INSERT INTO table5
    (id, name)
VALUES ('가나다라마바♥️', 'qwertyyuip');
INSERT INTO table5
    (id, name)
VALUES ('가나다라마바사아자', 'qwertyyuip');
SELECT *
FROM table5;



# NUMBER
# INTEGER (소숫점없는)
# DECIMAL (소숫점있는)
CREATE TABLE table6
(
    col1 INT,
    col2 BIGINT # 2^63 - 1
);
INSERT INTO table6
    (col1, col2)
VALUES (2342432, 234234234);
INSERT INTO table6
    (col1, col2)
VALUES (2147483647, 2147483647);
INSERT INTO table6
    (col1, col2)
VALUES (2147483648, 2147483647);

# 연습
# score(정수), length(큰정수) 컬럼이 있는 table7 번 만들기
# 두 개의 레코드 입력(성공)
# 한 개의 레코드 입력 실패


# DATE,TIME