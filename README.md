Java, Spring Framework & Angular
Learning & Development Path
Hands-On Mini Project
Focused on Java Programming Language
2
1 Introduction
1.1 Prerequisites
Initialize a new Maven project following the standard practices when it comes to dependency management 
and logging. Proceed in developing the project by following the order of the requirements steps as they are 
depicted in the following paragraphs.
Next, create a personal GitHub account or use your existing one. Create a new private repository to push the 
project. Add as collaborator the GitHub account cgiannacoulis, jondan97, IoannisKlian.
Note: For each step, you are free to implement the requirements in any way you want. However, keep in mind 
that there are good implementations and bad implementations. So, make sure that your solution follows the best 
practices for package, class, and method structure as well as the best practices for code quality.
1.2 Technology Stack
The technology stack you have at your disposal consists of the following components:
• Java 17
• Maven latest production release
• Oracle 21c Database Server
The development IDE of our choice is IntelliJ IDEA. Nevertheless, if you consider the use of another IDE will help, 
you are free to use that IDE.
You are free to use any library as long as it is declared as a dependency via Maven.
3
2 Functional Requirements
2.1 Product Perspective
Let's assume that you are part of a developing team for a company called ACME, and the business analyst has 
given you a set of requirements that you need to implement for a new e-shop site.
The business team has provided your team with the corresponding set of requirements that you need to 
implement. For your convenience and tracking purposes, requirements are logically grouped into steps. For 
every step/set of requirements, you should push your work to the corresponding GitHub repository by using one 
or more commits while providing proper comment(s).
All source code should be organized into Java packages. The proposed package nomenclature is 
com.acme.eshop.
2.2 Basic Functionality
2.2.1 Description
The system needs to be able to
• create and load a list of products when the system is launched.
• create new customers.
• create an order containing one or more products represented as order items.
All information and action results should be persisted in a database.
2.2.2 Tasks
• Implement or configure logging mechanism functionality.
• Design and implement the corresponding database and tables.
• Create the domain objects of the e-shop system. The proposed nomenclature to follow in class naming 
is Customer, Product, Order, and OrderItem.
• Create an ETL process that generates and loads sample Products during application initialization.
2.3 Ordering and discount policy
2.3.1 Description
Based on the system’s requirements, the customer can buy products either by paying with cash or by using a 
credit card.
Furthermore, customers from the
• B2C (Individual)
• B2B (Business)
• B2G (Government)
4
categories are served. You need to make sure that the system distinguishes purchase methods and customer 
category, as the following price discounts apply when buying a product:
• Individuals get no discount 
• Business users get a 20% discount 
• Government users get a 50% discount
• 10% discount when the customer pays by wire transfer
• 15% discount when the customer uses a credit card
Please note that every customer can have only one order pending i.e. an order that has not been saved to the 
database.
E.g., a government customer purchasing a product using his/her credit card will receive a price reduction of 65% 
(50%+15%).
2.3.2 Tasks
• Design and implement the service layer by making use of one or more dedicated classes. The proposed 
nomenclature is to contain the token “Service” as a suffix e.g. CustomerService, OrderService.
• Implement the purchase scenario by making use of the service class(es), the functionality implemented 
in step 1, and of course the domain classes.
2.4 Reports
2.4.1 Description
Based on the purchases of each customer, the system should support the following reports:
• Total number and cost of purchases for a particular customer
• Total number and cost of purchases for a particular product
• Total number and cost of purchases per customer
• Total number and cost of purchases per customer category
• Total number and cost of purchases per payment method
• Average order cost
• Average order cost per customer
• The customer(s) who purchased the most expensive product and how many times
The content of each report shall be included in the logging mechanism output.
2.4.2 Tasks
• Design and implement a service hosting the reporting functionality.
• Implement at least 3 reports.
5
3 Deliverables
3.1 Delivery Date
The project’s delivery date is the 29nd of July 2022.
3.2 Source Code Delivery
The Github repository hosting your source code is the actual delivery. Although technically, you can push the 
entire source code at once, we urge you to have multiple commits as this approach will allow us to track your 
thinking and the approach you followed to develop the ACME Delivery Service site.
Once ready, you should send an email to:
• c.giannacoulis@codehub.gr
• i.daniil@codehub.gr
• i.klian@codehub.gr
containing:
1. Team’s number
2. Team’s member full name 
3. Github repository URL
