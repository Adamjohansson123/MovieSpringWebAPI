# Assignment 3 Experis Academy 

API that represents a Movie Information System. It displays information about movie franchises, movies and characters.
API developed with Springboot and database implemented in PostgreSQL.

## Entities :
- Franchise
- Movie
- Character  

## Testing the API :
This API storage data in a PostgreSQL database. To test the data you need to create a new empty database on pgAdmin called "Hollywood". Once the database is connected you need to enter your username and password at the 'spring.datasource.username:' field and 'spring.datasource.password:' field at 'application.properties' file located at 'src/main/resources' directory of this project (OBS! Be sure that 'localhost:' port written at 'spring.datasource.url:' field matches your local PostgreSQL port). When credentials are entered and saved in the 'application.properties' file then you can run this Spring Boot project and test its endpoints with the seeded data in the database and the Postman collection file located at the 'assets' directory inside this project (Replace with desired ID numbers where {id} is found on request's url).  

## Database Diagram : 
![](https://github.com/Adamjohansson123/MovieSpringAPI/blob/main/assets/psql-diagram.png?raw=true)



