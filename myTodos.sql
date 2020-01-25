CREATE TABLE IF NOT EXISTS todos ( 
	id INTEGER AUTO_INCREMENT, 
    description VARCHAR(100) NOT NULL, 
    deadline DATE, 
    ownerID INTEGER, 
    PRIMARY KEY (id) 
    );
    

CREATE TABLE IF NOT EXISTS persons (
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL     
  );
  

INSERT INTO persons (name)
     VALUES
		("Eszter"),
        ("Dani");
        
ALTER TABLE todos 
	ADD project VARCHAR(20);

INSERT INTO todos (description, deadline, ownerID, project)
  VALUES 
	("rent helmets for kids", 30/01/2020, 1, "skiing"),
    ("buy euros", 30/01/2020, 2, "skiing"),      
    ("write absence note for school", 28/01/2020, 1, "skiinig");
    
SET SQL_SAFE_UPDATES = 0;

UPDATE todos
  SET deadline = '2020-01-30';

UPDATE todos
  SET project = "skiing" WHERE id = 3;

ALTER TABLE todos
	ADD done BOOLEAN
    AFTER id;

ALTER TABLE todos
	ADD createdDate date
    AFTER id;

ALTER TABLE todos ADD
	completedDate date;
    
UPDATE todos
	SET done = false,
    createdDate = '2020-01-25';
    
UPDATE todos
	SET done = true,
    completedDate = '2020-01-25'
WHERE id = 3;