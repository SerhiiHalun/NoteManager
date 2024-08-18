CREATE TABLE note (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      title VARCHAR(300) NOT NULL,
                      content VARCHAR(1000)
);
insert into note( title, content) values
        ('First Note','This is the content of the first note.'),
        ('Second Note','This is the content of the second note.')
