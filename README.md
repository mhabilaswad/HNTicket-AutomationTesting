# HnTiket Mobile Automation Testing

## By Muhammad Habil Aswad

This project contains an automated UI test script developed using **Appium** and **Java**, aimed at testing the core functionalities of the `HnTiket` Android application.

## 🎯 Purpose

This repository was created as a part of the final project for the **Software Quality** course. The objective is to implement and demonstrate automated functional testing of a mobile application, ensuring that various user scenarios can be reliably tested and validated.

## ✅ Features Tested

The automation script covers the following test cases:

1. **App Navigation**
   - Initial launch
   - Home navigation
2. **User Registration**
   - Input full name, phone number, and password
3. **User Authentication**
   - Login with incorrect credentials
   - Login with correct credentials
4. **Homepage Interaction**
   - Scroll up and down
5. **Movie Browsing**
   - View and back from movie detail pages
6. **Event Browsing**
   - View and back from event detail pages
7. **Event Booking**
   - Fill in user details
   - Select payment method
   - Confirm ticket purchase
8. **User Profile**
   - View profile
9. **Booking Management**
   - Cancel booking
10. **Logout**

## 🧰 Technologies Used

- Java
- Appium
- Selenium WebDriver
- AndroidDriver

## 🗂️ Project Structure

- `base.java` – Configuration for Appium capabilities and driver setup
- `basics.java` – Main automation script containing all the test cases
