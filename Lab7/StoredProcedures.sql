USE DB_Lab7;

DELIMITER //
CREATE PROCEDURE insertIntoRegion(IN name varchar(45), IN code varchar(45))
BEGIN
    INSERT INTO `region`(`name`, `code`) 
    VALUES (name, code);
END
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE selectFromStudentHasDebt(IN student_full_name varchar(90))
BEGIN
	IF (student_full_name IS NULL) 
    THEN
		SELECT 
			(SELECT CONCAT(name, " ", surname) FROM `student` WHERE id = student_id) AS full_name, 
			(SELECT subject FROM `debt` WHERE id = debt_id) AS subject
		FROM `student_has_debt`;
	ELSE
		SELECT full_name, subject
        FROM (
			SELECT 
				(SELECT CONCAT(name, " ", surname) FROM `student` WHERE id = student_id) AS full_name, 
				(SELECT subject FROM `debt` WHERE id = debt_id) AS subject
			FROM `student_has_debt`
		) AS new_student_has_debt
		WHERE full_name = student_full_name;
    END IF;
END
//
DELIMITER ;
