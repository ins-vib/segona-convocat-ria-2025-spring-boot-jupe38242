DELETE FROM equips;
DELETE FROM jugadors;
DELETE FROM categories;

INSERT INTO categories (id, nom) VALUES (1, 'Motel');
INSERT INTO categories (id, nom) VALUES (2, '1 estrella');
INSERT INTO categories (id, nom) VALUES (3, '2 estrelles');
INSERT INTO categories (id, nom) VALUES (4, '3 estrelles');
INSERT INTO categories (id, nom) VALUES (5, '4 estrelles');
INSERT INTO categories (id, nom) VALUES (6, '5 estrelles');


INSERT INTO jugadors (id, nom, posicio, id_equip) VALUES 
(1, 'Joel', 'Porteria', 1),
(2, 'Joel', 'Porteria', 1);

INSERT INTO equips (id, nom) VALUES 
(1, 'Barça'),
(2, 'Madrid');

INSERT INTO partits (id, id_equipLocal, id_equipVisitant, data, golsLocal, golsVisitant, resultatsLocal, resultatsVisitant) VALUES 
(1, 1, 2, '2025-06-20', 5, 3, 10, 6),
(2, 2, 1, '2025-05-30', 3, 6, 2, 7);