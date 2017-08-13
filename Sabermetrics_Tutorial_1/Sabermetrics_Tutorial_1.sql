#LOAD SQL DUMP FILE
#(Shawn Lahman's Free BaseBall Database)

#Show Databases
SHOW DATABASES;

#Use Database
USE lahman2016;

#how to kill a query
#1. Open a new Terminal 
#2. SHOW PROCESSLIST;
#3. KILL QUERY id;

#SHOW TABLES AND DESCRIBE THEM
SHOW TABLES;
DESCRIBE batting;

#TEAM NAME AND SALARY
describe salaries; 

#PROOF SABERMETRICS WORKED 2002 ATHLETICS 103 WINS

SELECT s.yearID, s.teamID, 
SUM(s.salary) AS SALARY, 
t.W AS WINS, 
SALARY/t.W AS CPW
FROM salaries s, teams t
WHERE s.yearID = 2002 AND s.teamID = t.teamID
AND s.yearID = t.yearID
GROUP BY s.teamID
ORDER BY SALARY DESC;