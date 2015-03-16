# dbcreviwer
Little weekend project to review DBCRs automatically.

## Introduction.
First of all I would like to explain how I got the idea to do this little weekend project.

I was in the office reviewing some DBCRs and was a very repetitive task, checking the style of the SQL scripts, trying to find defects on them. Then I thought that I can save time and focus on the logic of the scripts if I had a tool to help me with the repetitive tasks.

So I decided to start with this little project.

## What is a DBCR?

DBCR stands for DataBase Change Request.

A DBCR is a script or a set of scripts. Usually these scripts are in plain SQL language.

## What dbcreviwer should do?

In an abstract pint of view dbcreviwer should do the following tasks:

1. load a file or folder to analyze scripts.
2. Show reports of files analized.
3. Add, modify or delete rules to analyze scripts.
