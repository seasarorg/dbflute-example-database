
-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema delimiter data loading
-- = = = = = = = = = =/
CREATE TABLE WHITE_DELIMITER (
	DELIMITER_ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
	NUMBER_NULLABLE INTEGER,
	STRING_CONVERTED VARCHAR(200) NOT NULL,
	STRING_NON_CONVERTED VARCHAR(200),
	DATE_DEFAULT DATETIME NOT NULL
) ;
