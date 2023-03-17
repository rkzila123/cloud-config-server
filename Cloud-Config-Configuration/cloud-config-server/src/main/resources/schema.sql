DROP TABLE IF EXISTS PROPERTIES;
    
CREATE TABLE PROPERTIES (
  PROP_ID INTEGER  PRIMARY KEY AUTO_INCREMENT,
  APPLICATION_ID VARCHAR(25) NOT NULL,
  PROFILE VARCHAR(25) NOT NULL,
  LABEL VARCHAR(25) DEFAULT NULL,
  CONFIG_KEY VARCHAR(1000) NOT NULL,
  CONFIG_VALUE VARCHAR(2000) NOT NULL   
);