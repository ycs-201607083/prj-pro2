use jsp2;

CREATE TABLE board
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    title    VARCHAR(1000) NOT NULL,
    content  VARCHAR(5000) NOT NULL,
    writer   VARCHAR(100)  NOT NULL,
    inserted DATETIME      NOT NULL DEFAULT NOW()
);

SELECT *
FROM board;

INSERT INTO board
    (title, content, writer)
VALUES ('첫번째', '내용 무', '작성자?');