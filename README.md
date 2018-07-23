###### **Sara Silva 21/07/2018**

###### **About Me**

I am currently working with Web Automation using Ruby with Rspec and Capybara and writing unit, integration and API tests using C#, but also
have previous experience with Java and Selenium which is what I used to this technical test.

###### **How I conducted the design of the technical test**

The test was completed using Java, Maven, Selenium, Cucumber.

All WebElements were located using Firefox 43.0.1 which is an old version but I favor it since it has firebug which helps greatly when using xpath for finding WebElements.

I used page object model (POM) to design the test.

I tried to demonstrate dependency injection using picocontainer for the webdriver.

Used hooks for setup and teardown of end-to-end test.

Tried to demonstrate usage of implicit waits and expected conditions for Selenium
as a more elegant approach to Tread.sleep();

###### **Steps to run the test**

First step to run the test would be to clone the repository. Then for the test to be run the path to the geckodriver needs to be changed to the specific user's directory. 
Finally locate the TestRunner file which can be found in the Runner folder and trigger the test.

Reports should be located in the following path: ./target/index.html

