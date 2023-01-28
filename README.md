# GymManagmentSystem

<p>This is a Springboot project for Java Progamming language. Gym Managment System project contains 4 package: pojo, service, repository and controller.in pojo we have Trainer class, Member class and Equipments class. At first a trainer is created to database and then when we want to create a member we should create it only by defining the trainer's id, as a @Path Variable. So every member should have a trainer.You can create, edit, delete or show all trainers.</p>

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
<p>At first you should download IntelliJ IDEA Ultimate and then from the <a href="https://start.spring.io">spring initializr</a> you choose your project, I have chose the Maven, language: Java, Spring Boot 27.8.
</p><br> 
<p>
<img src="springI.png">
</p>

### Dependencies:
<ul>
<li>Spring Web</li>
<li>Spring Data Jpa</li>
<li>MySql Driver</li>
<li>Spring Boot Dev Tools</li>
</ul>

## DDL script
<p>To connect the prpject will database, you should do some changes and write things in application.properties and be sure you have dependency:<br>
<p>
 <img src="dependency.png">
</p>

<br>
And in application.properties should add:<br><br>
<p>
 <img src="properties.png">
</p>
<br><p>Then you should create the database in phpmyAdmin and write the database name, after all this you can create the @REST operations and from Insomnia you can write and then it creates automatically the tables and insert records. </p>

## REST
<p>You can build REST services with both XML and JSON. However, we will build with JSON.</p>

### REST and HTTP
<p>REST is built on top of HTTP (Hypertext Transfer Protocol). HTTP is the language of the web.<br>

HTTP has a few important verbs.</p>
<ul>
<li>POST: Create a new resource</li>
<li>GET: Read an article</li>
<li>PUT: Update an existing resource</li>
<li>DELETE: Delete a resource</li>

### Make First JPA Entity 
<p>The first step is to create a JPA Entity. First let's create a trainer entity with a primary key id.</p>
<p>
 <img src="trainer.png">
</p>
<h3>Important things to note:</h3>
<ul>
<li>@Entity: Specifies that the class is an entity. This annotation is applied to the entity class.</li>
<li>@Id: Specifies the primary key of an entity.</li>
<li>@GeneratedValue:  It provides for the specification of generation strategies for the values of primary keys.</li>
<li>public Trainer(): JPA-firendly default function Object()</li>
</ul>

### Make First Repository
<p>Now let's create an Interface TrainerRepository</p>
<p>
 <img src="trainerr.png">
</p>

### Make Service and DefaultService
<p>We create now a Service that is an Interface and a DefaultService, a class that will inherit the interface </p>
<p>
 <img src="trainers.png" width="50%"height="350"><img src="trainerdf.png"width="50%">
 
</p>

### Make Controller
<p>At the end we should create a Controller that will connect with HTTP Requests.</p>
<p>
 <img src="trainerc.png">
</p>

## REST API
<p>The REST API to the example app is described below. We will use Insomnia the examples to test.</p>

### Get list of Trainers
<br>
<h3>POST Request</h3>
<p>
<img src="post.png" width="50%" height="290"><img src="postResponse.png"width="50%">
</p>
<h3>GET Request</h3>
<p>
<img src="get.png" width="50%"height="340"><img src="getResponse.png"width="50%">
</p>
<h3>PUT Request</h3>
<p>
<img src="put.png" width="50%"height="340"><img src="putResponse.png"width="50%">
</p>
<h3>DELETE Request</h3>
<p>
<img src="delete.png" width="50%"height="200"><img src="deleteResponse.png"width="50%">
</p>

