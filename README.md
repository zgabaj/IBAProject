# IBAProject

I am using apache tomcat standalone container version:8.0.35

Level 1-2
- create maven project in Netbeans 
- create SimpleServlet 
- add dependency plugin because of [WARNING] Warning: selected war files include a WEB-INF/web.xml which will be ig
nored
- configure web.xml

Level 3
- create hello.jsp for checking x parametrf from URL 
- add dependency for jstl
- change url pattern in web.xml to "/hello"
- change SimpleServlet : set attribute for loop in hello.jsp 

Level 4
- add dependency for spring framework
- refactor SimpleServlet to SpringController : two methods for mapping url with parmeter and without
- add spring-config.xml file 
- change web.xml configuration 
- some small changes in hello.jsp

Level 5
- create simple class Student and GenderEnum
- refactor SpringController to StudentController : tow methods for GET and POST request method
- add tow new jsp :  one for input form and one for output
- delete hello.jsp
- add folder for jsp files and change config in spring-config.xml
- change servlet name and url pattern in web.xml

Level 6
- add dependency hibernate-validator
- add anotations to Student atributes
- create folder for css style and link css to input jsp
- create propertie for error messages
- change input jsp 
- setup anotation , message source and css resource in spring-config.xml
- StudenController changes : add dateFormat , valide student and check if an error occurs

Level 7
- create StudentService and StudentServiceImpl
- add Id attribute to Student and change equals and hash method
- change mapping in spring-config.xml to "/"
- add new jsp files : studentEdit, studentsList
- smole changes in studentInput and studentOutput jsps
- add StartupListener to setup map for students and studentManager
- change studentCntroller : "/student" show studens info , "/add" for adding new student
                            from "/student" you can add new student, edit or view student data

Level 8
- change return value of ShowAllStudent method in StudentServce interface to Collection
- create DAO interface and DAOImpl
- create StudentServiceDBImpl 
- add anotations in Student class
- fix error meassage for wrong date format 
- change student controller to use new StudentService to sotre data in database
- create sql script for table student
- create hibernate.cfg.xml and log4j.xml configuration files
- add database configuration to spring-config.xml
- smole changes in jsp files

Level 9
- fix wrong layout in jsps
- add css style for error mesages
- create js folder and add jquery library, validation plugin and datepicker
- create js script, studentValidation.js for validation for input 
- add mapping for resources in spring-config.xml
