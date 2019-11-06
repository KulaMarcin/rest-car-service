# rest-car-service ![](leaf.png)

<br>
<br>
<br>

<b>What is rest-car-service?</b>


Rest application created in <b><i>Spring Rest API</i></b> and in <b><i>Java</i></b>. It allows you to manage the table in the database easily. Provides a handling for GET, POST, PUT and DELETE requests.

<br>
<br>

<b>Database</b>


The MySQL database contains one table called <b>car</b> with 7 columns: id, brand, model, color, power, year_of_manufacture and vin_number. The script to create the table is in the <b>sql_script_to_create_car_table</b> directory. The schema name is <b>rest_car_service</b>.

<br>
<br>

<b>Database connection</b>


In the <b>AppConfig.java</b> configuration class, <b>dataSource</b> and <b>sessionFactory</b> objects are created from the <b>persistence-mysql.properties</b> configuration file. Queries to the database are made by using <b><i>Hibernate</b></i>.

<br>
<br>

<b>Dependencies</b>


The application uses <b><i>maven</b></i> to manage dependencies, which is why all required dependencies are in the <b>pom.xml</b> file.

<br>
<br>

<b>Server</b>

The application was launched and tested on a Tomcat 9.0v server.

<br>
<br>

<b>Request handling</b>

The <b>CarRestController</b> class is responsible for handling requests. Here are some sample requests that can be handled:

<br>
<br>

<b>[GET]</b> <i>/rest-car-service/api/cars</i> - returns all records

<b>[GET]</b> <i>/rest-car-service/api/cars?id=6</i> - returns the record with id = 6 

<b>[GET]</b> <i>/rest-car-service/api/cars?brand=Alfa Romeo&model=Brera&color=red</i> - returns the red alfa romeo brera cars

<br>

<b>[POST]</b> <i>/rest-car-service/api/cars</i> - adds a new record to the table. In the body of the request, JSON with values is passed.

<br>

<b>[PUT]</b> <i>/rest-car-service/api/cars</i> - updates the record in the table. In the request body, JSON with the record id and new values is passed.

<br>

<b>[DELETE]</b> <i>/rest-car-service/api/cars?id=6</i> - removes the record with id = 6

<b>[DELETE]</b> <i>/rest-car-service/api/cars?color=red</i> -  removes all records with color = red 

<br>
<br>

<b>Java POJO -> JSON and JSON -> Java POJO</b> 


The application uses <b><i>Jackson</b></i>, which automatically converts the JSON object to Java POJO for [PUT] and [POST] requests, and Java POJO to JSON for [GET] and [DELETE] requests.

<br>
<br>

<b>Exception handling</b> 

The <b>CarNotFoundException</b> class with the @ControllerAdvice annotation allows you to throw exceptions. If an incorrect request is made, or the resource is not found in the table, an exception is thrown, which sends an error message in response.

<br>
<br>

<b>How to run?</b> 


To run the application, you must prepare the database. The scripts for creating the table are located in the <b>sql_script_to_create_car_table</b> directory. Connection parameters (login, password) can be changed in the <b>persistence-mysql configuration</b> file. Next, import the project as an existing maven project. Finally, you can run the application on the server (e.g. Tomcat). Requests can be sent to the server using <b><i>Postman</b></i>.
