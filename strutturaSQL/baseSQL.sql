CREATE TABLE esame (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nomeCorso VARCHAR(30),
  dataEsame DATE,
  studente_matr int,
  professore_id int
);

INSERT INTO esame (nomeCorso, dataEsame, studente_matr, professore_id) VALUE ('Programmatore','2023-12-01', 1, 3);
INSERT INTO esame (nomeCorso, dataEsame, studente_matr, professore_id) VALUE ('Scienze','2023-02-11', 2, 2);
INSERT INTO esame (nomeCorso, dataEsame, studente_matr, professore_id) VALUE ('Storia','2023-04-14', 4, 3);
INSERT INTO esame (nomeCorso, dataEsame, studente_matr, professore_id) VALUE ('Economia','2023-07-06', 3, 4);
INSERT INTO esame (nomeCorso, dataEsame, studente_matr, professore_id) VALUE ('Fisica','2023-03-03', 6, 1);
INSERT INTO esame (nomeCorso, dataEsame, studente_matr, professore_id) VALUE ('Matematica','2023-12-07', 5, 2);