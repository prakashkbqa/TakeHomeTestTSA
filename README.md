Mobile Automation Testing Task:

Take Home Test from Score Media and Gaming Inc.

Prerequisites software & hardware:

	•	Homebrew
	•	Node - v20.12.2
	•	Npm - 10.5.0
	•	Java - 11.0.13
	•	Appium - 2.5.4
	•	Android SDK
	•	Appium inspector - 2024.3.4
	•	The score app APK file - theScore_SportsNews&Scores_24.8.0_Apkpure.apk
	•	Android Studio - Android Studio Jellyfish | 2023.3.1
	•	Emulator Google pixel with 13.0(Tiramisu) OS version - API 33
	•	macOS


Instructions on how to install or set up the project:

Step 1: Install JAVA JDK 11.0.13

Step 2: Install Android Studio latest version Jellyfish then download SDK manager and install necessary components

Step 3: Create a bash profile and set the JAVA_HOME & ANDROID_HOME paths

Step 4: Install Homebrew, Node, & npm, Appium 2 on Mac terminal

Step 5: Download IntelliJ IDEA IDE, then import the project and reload Gradle to install dependencies as provided in the build.gradle file

Step 6: Set up Android virtual device and launch the (Emulator Google pixel with 13.0(Tiramisu) OS version - API 33) in Android Studio using Virtual device manager

Step 7: Update the Android emulator's “deviceName” and “app” capabilities in the CapabilitiesFile.json file as required.

Step 8: Configure TestNG in IDE and set the suite with the path of the TestNG.xml located under the src/test/resources folder  

<class name="Test.TheScoreTask"/>


Testing Approach Description for the Assigned Task:

I have developed a testing framework using TestNG, the Page Object Model (POM), and Java programming language, designed to handle various scenarios and end-to-end flows. Execution of the test suite is managed through the testNG.xml file, providing flexibility for multiple script runs or package execution by adding package tags. My script primarily focuses on functionality testing.

Testing Scenario: As a first-time user, download the Score app from the Google Play Store and launch it without creating an account. Proceed to select my favorite league and team by choosing different options. Finally, verify that user can return to the previous page using the back navigation feature.

I focused on the following script coverage points:

	•	Validating page titles after selecting favorite league and team, and verifying the respective page titles
	•	Click actions on buttons
	•	Navigation through main tabs and sub-tabs, ensuring the correct display of selected tab data
	•	Verification of back navigation, ensuring the correct return to the previous page.

Note: The test run report is attached in this project repository.


 
