# HIIT Your Goal

An Android mobile application for monitoring intensity in HITT workouts. Built in Android Studio.

# Motivation
For my first major programming project, I decided to bring my passion for fitness into my coding journey. This mobile application is meant to provide a way to track workout 
intensity via heart rate monitoring during High Intensity Interval Training. This will provide real time feedback to the user during the workout. The user will be able to create 
and save an account that will store their workout history and workout session parameters (age, sex, upper heart rate limit, lower heart rate limit, etc.). My goal with this project
is to provide an application

# Vision and Application Structure

The application will have a main activity with buttons to login to an existing account, register a new account, or continue as a guest. All account information will be stored 
in a local server and facilitated through SQLite in Android Studio (at least during initial development and testing). Each button will go to a respective activity for entering the user's information or displaying previous 
saved information. There will be buttons at the bottom of the display on each of those actvities that will prompt the user to begin the workout. That button will connect to 
another activity with a countdown timer. Initially, this application will prompt the user to enter their heart rate (either from a heart rate monitoring device or manual 
pulse count)at the end of every interval and then will output a string object based on where the user's heart rate falls in the provided parameters. This prompt and feedback 
will be run by instituting a time based loop (with a nested loop to account for heart rate feedback). The ultimate goal is for this application to be able to sync directly with 
wearable tech that has heart rate monitoring capabiilites and to provide real time coaching and feedback with a do while loop. When the countdown timer reaches zero, a new 
activity will open with the workout data and an option to save or delete the workout to the account (if logged in).

# Sources
https://www.acefitness.org/education-and-resources/lifestyle/tools-calculators/heart-rate-zone-calculator/
