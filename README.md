# GymManagmentSystem

<p>This is a Springboot project for Java Progamming language. Gym Managment System project contains 4 package: pojo, service, repository and controller.in pojo we have Trainer class, Member class and Equipments class. At first a trainer is created to database and then when we want to create a member we should create it only by defining the trainer's id. So every member should have a trainer.You can create, edit, delete or show all trainers.</p>

## Requirements
<h3>For building and running the application you will need:</h3>
<ul>
<li><a href="https://www.oracle.com/java/technologies/downloads/#java8">JDK 1.8</a></li>
<li><a href="https://www.jetbrains.com/idea/download/#section=windows">IntelliJ IDEA</a></li>
<li><a href="https://insomnia.rest/download">Insomnia</a></li>
<li><a href="https://www.apachefriends.org/download.html">XAMPP</a></li>
<li><a href="https://www.phpmyadmin.net/downloads/">phpMyAdmin</a></li>

</ul>

## Steps To Run The Project
<p>At first you should download IntelliJ IDEA Ultimate and then from the <a href="https://start.spring.io">speing initializr</a> you choose your project, I have chose the Maven, language: Java, Spring Boot 27.8.</br> 
The dependencies are:
<ul>
<li>Spring Web</li>
<li>Spring Data Jpa</li>
<li>MySql Driver</li>
<li>Spring Boot Dev Tools</li>
</ul>

## DDL script
<p>To connect the prpject will database, you should do some changes and write things in application.properties and be sure you have dependency:<br>
<groupId>com.mysql</groupId><br>
<artifactId>mysql-connector-j</artifactId><br>
<br>
And in application.properties should add:<br><br>
spring.jpa.database-platform=com.mysql.cj.jdbc.Driver<br>
spring.jpa.hibernate.ddl-auto=update<br>
spring.datasource.url=jdbc:mysql://localhost:3306/database_name<br>
spring.datasource.username=root<br>
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver<br>
spring.jpa.show-sql=true<br>
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect<br>
<br>Then you should create the database in phpmyAdmin and write the database name, after all this you can create the @REST operations and from Insomnia you can write and then it creates automatically the tables and insert records. 
</p>
