use jsp2;

CREATE TABLE member
(
    id        VARCHAR(20) primary key,
    password  VARCHAR(20) NOT NULL,
    nick_name VARCHAR(30) NOT NULL,
    inserted  DATETIME    NOT NULL DEFAULT NOW()
);

DROP TABLE member;

SELECT *
FROM member;