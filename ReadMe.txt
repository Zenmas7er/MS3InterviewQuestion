MS3 Interview Coding Problem

The problem was to create a program that would read in a CSV file, populate a SQLite Database, and print out the number of
total records available along with the number of successes and failures. The successes should be written directly to the database,
while the failures should be written to a separate CSV file that logs all of the failures.

The trick behind this challenge was that reading a CSV file and writing its contents to either another CSV file or to a SQLite database
is not something that is covered in the standard Java library. I went about this by downloading the OpenCSV and SQLite JDBC libraries.

In order to solve this programming challenge, I used the standard csvreader and csvwriter provided with the opencsv library along with a
single prepared statement from the SQLite JDBC SQL library. On the database side, the only DDL statement I used was a CREATE TABLE
line that was then used to make a basic SQLite Table. From there, I used a List<String[]> to read in all elements of each line of the CSV file.
Each entry that was inserted into the List was then checked in a loop in order to find out which entry was a success or a failure using multiple
if-else statements that check if each index of the String was empty or not. If the line fails any of the if-else statements, then it is stored onto
a special CSV file the records all of the failures. The successes are then used to populate the SQLite database using a prepared statement that
inserts the values into the database. During each iteration of the loop, I also count the total number of times the CSV file is read along with the
total number of successes and failures depending on whether the current entry is a success or a failure using a three variables that track the
total number of records, along with the successes and failures. When the loop is done, these variables are then written into a log file using the
Java logger and handler libraries.

As of this writing, this program is run within an IDE, so you only need to open the project in your IDE.