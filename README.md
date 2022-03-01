# Spring boot application using MongoDB as database

Follow these instructions to create a free MongoDB Atlas cloud database:

    https://docs.atlas.mongodb.com/getting-started/

The database used in this example is 
    
    books
It has two collections
    
    author
    book

There are two data files in the project:
mongdb-author-data.csv and mongodb-book-data.csv.

I used the Atlast UI to enter the data. Note that the Ids are generated by MongoDB. 
You will need to use the Id values with the ones generated by your instance. 

Need to run using Java 11 or higher. 
Java 8 will encounter a PKIX security certificate error.

My initial userId did not work. 
I had to create a second user, with no special characters in the username or password, and use that one.
Seems to have been the case for others as well:

    https://www.mongodb.com/community/forums/t/bad-auth-authentication-failed/15178

Once set up, you can invoke the application this way:

    localhost:8096/mongobooks/books/book?title=The%20Three%20Musketeers

Or use the Swagger page:

    http://localhost:8096/mongobooks/swagger-ui.html





