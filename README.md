# **SWE-Challenge1**

Good day to everyone who is viewing my submission got this SWE mini project.
This is the first time i am working with java and spring boot so i hope this is working as intended 
and it meets the specifications provided.

## **Acceptance Criteria 1**
For acceptance criteria 1, the application is supposed to read a CSV file and store them in a database.
The CSV file included in my project (input.csv) can be found at SWE-Challenge1\demo\demo\input.csv. This file
can be freely editted for whichever test case required. For this submission, the data included in the CSV file
would be name and the corresponding salary.

## **Acceptance Criteria 2**
For acceptance criteria 2, the application is supposed to expose an endpoint that returns users with a valid salary(e.g. 0<=salary<=4000)
I created multiple endpoints under /users as i was exploring the different options avaiable from spring boot.

endpoint #1 (/users)
- This endpoint returns all users with salary > 0

endpoint #2 (/users)
- This endpoint takes in 2 parameters (start/end) and will return all users with salary the ranges between the start and end value.

endpoint #3 (/users)
- This endpoint takes in 1 parameter (Sort) and returns the list in the sorted order specified. In this case, the parameter should
either be "Ascending" or "Descending".

