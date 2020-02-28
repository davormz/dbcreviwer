# dbcreviwer
Little weekend project to review DBCRs automatically.

## Introduction.
First of all I would like to explain how I got the idea to do this little weekend project.

I was in the office reviewing some DBCRs (Data bse chaneg request) and was a very repetitive task, it consisted on checking the style of the SQL scripts to make sure they comply with liquibase notation. It was a very repetitive task.

## What is a DBCR?

DBCR stands for DataBase Change Request.

A DBCR is a script or a set of scripts. Usually these scripts are in plain SQL language.

## What dbcreviwer should do?

The dbcreviwer should do the following tasks:

1. load a file or folder to analyze scripts.
2. Show reports of files analized.
3. Add, modify or delete rules to analyze scripts.

## Compile and Run - So far
### How to run it.
After run the command 'mvn install' try:
'java -cp target/dbcreviwer-1.0-SNAPSHOT.jar com.davo.App'
