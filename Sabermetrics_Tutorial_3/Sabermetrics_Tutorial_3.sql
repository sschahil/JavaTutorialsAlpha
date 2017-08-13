#TOP 50 LOWEST ERAS (MINUS THE DEAD BALL PERIOD)

SELECT p.playerID,
CONCAT(m.nameFirst, " ", m.nameLast) AS NAME, 
SUM(p.ER)/SUM(p.IPOuts/3)*9 AS ERA, 
SUM(p.IPOuts/3) AS IP,
m.birthYear AS BirthYear
FROM Pitching p, Master m
WHERE p.playerID = m.playerID
GROUP BY playerID
HAVING (IP >= 1000) AND (BirthYear > 1900)
ORDER BY ERA ASC
LIMIT 50;

#Theoretical team runs created career
#(Estimates the Number of Runs a Player is Responsible for)

SELECT b.playerID,
CONCAT(m.nameFirst, " ", m.nameLast) AS NAME, ((b.H+b.BB)+(2.4*(b.AB+b.BB)))*(t.tb+(3*(b.AB+b.BB)))/(9*(b.AB+b.BB))-(.9*(b.AB+b.BB)) AS TTRC
FROM batting b, master m, TOTBASES as t
WHERE b.playerID = m.playerID AND t.playerID = m.playerID
GROUP BY playerID
ORDER BY TTRC
DESC LIMIT 50;

#TOTAL BASES CAREER
#(Single = 1 Base + Double = 2 Bases + Triple = 3 Bases + Homer = 4 Bases)

CREATE VIEW TOTBASES AS 
SELECT playerID,
(SUM(H)+(SUM(2B)*2)+(SUM(3B)*3)+(SUM(HR)*4)) AS TB
FROM batting
GROUP BY playerID;

SELECT playerID, TB FROM TOTBASES;

#Best total bases year
CREATE VIEW TOTBYR AS 
SELECT playerID, yearID, (H+(2B*2)+(3B*3)+(HB*4)) AS TB
FROM batting;

SELECT playerID, TB FROM TOTBYR
WHERE yearID = 2010
ORDER BY TB DESC
LIMIT 50;

#Theortical team runs created ever in a year

SELECT b.yearID, b.playerID,
CONCAT(m.nameFirst, " ", m.nameLast) AS NAME, ((b.H+b.BB)+(2.4*(b.AB+b.BB)))*(t.TB+(3*(b.AB+b.BB)))/(9*(b.AB+b.BB))-(.9*(b.AB+b.BB)) AS TTRC
FROM batting b, master m, TOTBYR as t
WHERE b.playerID = m.playerID AND t.playerID = m.playerID AND b.yearID = t.yearID AND t.yearID = 2011
ORDER BY TTRC
DESC LIMIT 50;

#SHOW ALL VEIWS IN DATABASE

SHOW FULL TABLES
IN bbstats
WHERE TABLE_TYPE LIKE 'VIEW';

#DELETE A DATABASE VIEW

DROP VIEW databaseView;

#BATTING AVERAGE ON BALLS IN PLAY
#(A players skill at getting hits)

SELECT b.playerID, CONCAT(m.nameFirst, " ", m.nameLast) AS NAME, 
yearID, teamID, (b.h-b.HR)/(b.AB-B.SO-b.HR+b.SF) AS BABIP
FROM batting b, master m
WHERE b.playerID = m.playerID AND b.yearID = 2011 AND b.AB > 300
ORDER BY BABIP DESC
LIMIT 50;

#Weighted On Base Average or wOBA
#(OBP doesn't weight for how far they reached base. SLG doesn't consider walks)

SELECT b.playerID, CONCAT(m.nameFirst, " ", m.nameLast) AS NAME, yearID, teamID, 
(0.72*(b.BB=b.IBB))+(0.75*b.hbp)+(0.90*b.h)+(1.84)+(1.24*b.2b)+(1.56*b.3b)+(1.95*b.hr)/b.ab as wOBA
FROM batting b, master m
WHERE b.playerID = m.playerID AND b.yearID = 2011 AND b.AB > 300
ORDER BY wOBA DESC
LIMIT 50;