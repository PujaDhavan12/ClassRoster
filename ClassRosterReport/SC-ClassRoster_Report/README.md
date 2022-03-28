#SC-ClassRoster_Report
Version: 3.0 <br />
Coverage: All Paths <br />
Last Updated: 15/03/2022 - IST Format <br />
​
###Run the test using Maven
​
```
mvn graphwalker:test
```
​
​
### Directory Schema
​
```jshelllanguage
.
```jshelllanguage
.
├── SC-ClassRoster_Report.iml
├── README.md
├── _classpath.xml
├── _project.xml
├── jmeter.log
├── pom.xml
├── src
│   └── main
│       ├── java
│       │   ├── controllers
│       │   │    ├── LoginController.java
│       │   │    ├── ReportController.java
│       │   │    ├── ClassRosterController.java
│       │   │    
│ 		│ 	│ 
│       │   ├── DataReaders
│		│	│   
│       │   │	     
│       │   ├── helpers
│       │   │    ├── BrowserInitHelper.java
│       │   │    ├── DriverHelper.java
│       │   │    ├── JavascriptHelper.java
│       │   │    ├── LoggerHelper.java
│       │   │    └── ScreenshotHelper.java
│       │   │     
│       │   ├── Pom
│		│	│    ├── LoginPage.java
│       │   │    ├── LaunchpadPage.java
│       │   │    └── ClassRosterPage.java
│       │   │  
│       │   ├── utils
│       │   │    ├── Colors.java
│       │   │    ├── ConsoleLogger.java
│       │   │    ├── Dynamic.java
│       │   │    ├── LoggerUtility.java
│       │   │    ├── Secure.java
│       │   │    └── Static.java
│       │   │   
│       │   │     
│       │   └── org
│       │        └── graphwalker
│       │                ├── LoginTest
│       │                ├── ReportTest
│       │                ├── ClassRosterTest
│       │                
│       │               
│       └── resources
│               └── org
│                    └── graphwalker
│                             ├── Login.graphml
│                             ├── Report.graphml
│                             ├── ClassRoster.graphml
│                           
│                            
└── target
    ├── classes
    │   ├── controllers
    │   │    ├──LoginController.java
    │   │    ├── ReportController.java
    │   │    ├── ClassRosterController.java
    │   │   
    │   │      
	│   ├── helpers
    │   │     ├── BrowserInitHelper.class
    │   │     ├── DriverHelper.class
    │   │     ├── JavascriptHelper.class
    │   │     ├── LoggerHelper.class
    │   │     └── ScreenshotHelper.class 
    │   │     
	│   │
	│   ├── Pom
    │	│    ├── LoginPage.java
    │   │    ├── LaunchpadPage.java
    │   │    └── ClassRosterPage.java
    │   │     
	│   ├── utils
    │   │     ├── Colors.class
    │   │     ├── ConsoleLogger.class
    │   │     ├── Dynamic.class
	│   │     ├── LoggerUtility.class
	│	│	  ├── Secure.class
    │   │     └── Static.class
	│   │
	│   ├── dataReader
    │   │        
	│   │       
    │   │
    │   └── org
	│	     └── graphwalker
	│                 ├── Login.class
	│	              ├── LoginTest.class
	│	              ├── Login.graphml
	│	              ├── Report.class
	│	              ├── ReportTest.class
	│	              ├── Report.graphml
    │                 ├── ClassRoster.class
	│	              ├── ClassRosterTest.class
	│	              ├── ClassRoster.graphml
	│               
	│                                 
    ├── generated-sources
    │   └── graphwalker
    │         ├── Login.graphml
    │         ├── Report.graphml
    │         ├── ClassRoster.graphml
    │      
    │       
    │           
    ├── generated-test-sources
    │   └── graphwalker
    │       └── cache.json
	│       
    ├── graphwalker-reports
	├── maven-archiver
	│   └── pom.properties
    └── maven-status
        └── maven-compiler-plugin
            ├── compile
            │   └── default-compile
            │       ├── createdFiles.lst
            │       └── inputFiles.lst
            └── testCompile
                └── default-testCompile
                    └── inputFiles.lst