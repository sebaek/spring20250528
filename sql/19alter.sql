USE mydatabase;
CREATE TABLE table22
(
    col1 INT         NOT NULL UNIQUE,
    col2 VARCHAR(10) NOT NULL DEFAULT ''
);

INSERT INTO table22
    (col1, col2)
VALUES (3, 'son');
INSERT INTO table22
    (col1, col2)
VALUES (5, 'lee');

# ALTER TABLE : 테이블 수정
# 컬럼 추가
# 컬럼 TYPE 제약사항 변경
# 컬럼명 변경

ALTER TABLE table22
    ADD COLUMN col3 DATETIME NOT NULL DEFAULT NOW();
DESC table22;
SELECT *
FROM table22;
ALTER TABLE table22
    ADD COLUMN col4 INT;
ALTER TABLE table22
    ADD COLUMN col5 INT NOT NULL;

ALTER TABLE table22
    ADD COLUMN col6 VARCHAR(10) NOT NULL;
ALTER TABLE table22
    ADD COLUMN col7 VARCHAR(10) NOT NULL UNIQUE;
ALTER TABLE table22
    ADD COLUMN col8 INT;

ALTER TABLE table22
    ADD COLUMN col9 INT
        AFTER col1;
ALTER TABLE table22
    ADD COLUMN col10 INT
        FIRST;

# 연습
# table22 에 새로운 컬럼 2개 추가

