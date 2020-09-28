# **SWE-Challenge1**

Good day to everyone who is viewing my submission got this SWE mini project.
This is the first time i am working with java and spring boot so i hope this is working as intended 
and it meets the specifications providided.

## **Acceptance Criteria 1**
For acceptance criteria 1, the application is supposed to read a CSV file and store them in a database.
The CSV file included in my project (input.csv) can be found at SWE-Challenge1\demo\demo\input.csv. This file
can be freely editted for whichever test case required. For this submission, the data included in the CSV file
would be name and the corresponding salary.

## **Acceptance Criteria 2**
For acceptance criteria 2, the application is supposed to expose an endpoint that returns users with a valid salary(0<=salary<=4000)
For this criteria, i wasn't sure whether (0<=salary<=4000) is the only criteria to meet for application. Therefore i created several
endpoints for different criterias.

endpoint #1 (/users)
- This endpoint returns all users with salary > 0

endpoint #2 (/usersParam)
- This endpoint takes in 2 parameters (start/end) and will return all users with salary the ranges between the start and end value.

endpoint #3 (/users/Ascending)
- This endpoint returns the list of users sorted by their salary in ascending order.

endpoint #4 (/users/Descending)
- This endpoint returns the list of users sorted by their salary in descending order.
