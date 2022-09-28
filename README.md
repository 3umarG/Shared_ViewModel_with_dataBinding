# Shared ViewModel 

## How MVVM works ?
By using a ViewModel that get the Data from APIs , DataBase or other External resources and put them in the View by using DataBinding and LiveData .

## Model :
![Model View ViewModel ](https://i0.wp.com/resocoder.com/wp-content/uploads/2018/08/mvvm-architecture-complete-overview.png?w=492&ssl=1)


## Advantages of MVVM Pattern:
   - Enhance the reusability of code.
   - All modules are independent which improves the testability of each layer.
   - Makes project files maintainable and easy to make changes.

## Disadvantages of MVVM Pattern:
   - This design pattern is not ideal for small projects.
   - If the data binding logic is too complex, the application debug will be a little harder.


## What are Modules I used ??
   - module "pojo" : put all models of resources : local AND remote. 
   - repository : we can see the Repository serves as a mediator between the ViewModel and the sources of data , and it provides this data to the rest of the app
   - ui : contains my ViewModels / Screens
  
  
## What's the Importance of use Repository on MVVM ??
   - provide a clean API for accessing data.
   - gather data from different data sources(different REST APIs, cache, local database storage) and it provides this data to the rest of the app.
   -  serves as a single source of truth.
    keep the local database up to date with the newest fetched data from remote service so that the application can still provide its functionalities with bad Internet connection or no connection at all.
    
    
## Repository Functionalities:
![Repository Functions](https://digitalkraft-consulting.de/wp-content/uploads/2022/01/1-5.png)


## What is DataBinding ??
The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
It also has alot of actions you can use , like you can assign any value to the widget directly in the layout file and control it inside the XML file.


## What is Binding Adapter ??
   - Binding adapters are responsible for making the appropriate framework calls to set values.
   - The Data Binding Library allows you to specify the method called to set a value, provide your own binding logic, and specify the type of the returned object by    using adapters.
   - The power of Binding Adapter is shown when you want to do a lot of work depend on the value that you receive like -live data- or -Model- .
   - You can specify alot of actions on separate place and file to make your code maintainable , easy to track and easy to understand from others . 
   
