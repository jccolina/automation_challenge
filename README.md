## Frameworks/Libraries
1. Selenium 3.141.59
2. Java 8
3. Cucumber 6.10.4
4. Reports: monochromata reporter 4.0.84
5. webdrivermanager 4.4.3
6. json-simple 1.1.1
7. json-path 2.6.0
8. junit 4.13
9. cucumber-picocontainer 6.10

## How to Run
1. Have installed browser, e.g. Chrome
2. Have installed Java 8
    * If error when installing dependencies then remove current java version and install again.
    * Suggested source Amazon Correto: https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html
3. Have installed gradle
    * MacOS throguh Homebrew (http://brew.sh/) ```brew install gradle```
    * Linux through SDKMAN! (http://sdkman.io/) ```sdk install gradle 7.1.1```   
      Or manually for Linux/MacOS
        * Download binary from https://gradle.org/next-steps/?version=7.1.1&format=bin
        * Unzip the distribution zip file in the directory of your choosing, e.g.:
       ```
          $ mkdir /opt/gradle
          $ unzip -d /opt/gradle gradle-7.1.1-bin.zip
          $ ls /opt/gradle/gradle-7.1.1
          LICENSE  NOTICE  bin  getting-started.html  init.d  lib  media
       ```
    * Windows
        * download binary https://gradle.org/install/ in zip file
        * Create a new directory C:\Gradle
        * Extract ZIP content. Drag the content folder gradle-7.1.1 to your newly created C:\Gradle folder.
        * In File Explorer right-click on the This PC (or Computer) icon, then click Properties -> Advanced System Settings -> Environmental Variables.
        * Under System Variables select Path, then click Edit. Add an entry for C:\Gradle\gradle-7.1.1\bin. Click OK to save.
    * Verify your installation

      ```
      $ gradle -v
       ------------------------------------------------------------
       Gradle 7.1.1
       ------------------------------------------------------------   
       ```
   Reference: https://gradle.org/install/

4. Clone project    ```git clone https://github.com/jccolina/automation_challenge.git```
5. Run the following gradle command inside automation_challenge folder:  
   ```gradle uiTests```
5. Open results report on: reports/cucumber-html-reports/overview-features.html
6. Find tests scenarios in src/test/resources/scenarios/Search.feature
7. To change browser modify the file environment.json > "browser": "chrome"  
   Values allowed (no case sensitive):
    * CHROME,
    * FIREFOX

## Execution Report: 
![image](https://user-images.githubusercontent.com/5452898/129296566-1253bb19-4a0c-475c-ba8b-7250a367b087.png)
