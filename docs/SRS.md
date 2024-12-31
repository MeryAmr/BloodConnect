# Software Requirements Specification
## For BloodConnect

Version 0.1  
Prepared by **Amr Mamdouh, Mariam Samaha, Mai Mostafa**  
**Organization:** Zewail City of Science and Technology  
**Date Created:** 11/22/2024

Table of Contents
=================
* [Revision History](#revision-history)
* [1. Introduction](#1-introduction)
  * [1.1 Document Purpose](#11-document-purpose)
  * [1.2 Product Scope](#12-product-scope)
  * [1.3 References](#13-references)
  * [1.4 Document Overview](#14-document-overview)
* [2. Overall Description](#2-overall-description)
  * [2.1 Product Perspective](#21-product-perspective)
  * [2.2 Product Features](#22-product-features)
  * [2.3 User Classes and Characteristics](#23-user-classes-and-characteristics)
  * [2.4 Operating Environment](#24-operating-environment)
  * [2.5 Constraints](#25-constraints)
  * [2.6 Assumptions and Dependencies](#26-assumptions-and-dependencies)
* [3. Specific Requirements](#3-requirements)
  * [3.1 Functional Requirements](#31-functional-requirements)
  * [3.2 External Interface Requirements](#32-external-interface-requirements)
    * [3.2.1 User Interfaces](#321-user-interfaces)
    * [3.2.2 Hardware Interfaces](#322-hardware-interfaces)
    * [3.2.3 Software Interfaces](#323-software-interfaces)
    * [3.2.4 Communication Interfaces](#324-communication-interfaces)
  * [3.3 Non-functional Requirements](#33-non-functional-requirements)
    * [3.3.1 Performance Requirements](#331-performance-requirements)
    * [3.3.2 Safety Requirements](#332-safety-requirements)
    * [3.3.3 Security Requirements](#333-security-requirements)
    * [3.3.4 Software Quality Attributes](#334-software-quality-attributes)
* [4. Legal and Regulatory Requirements](#4-legal-and-regulatory-requirements)
  * [4.1 Data Protection](#41-data-protection)
* [5. Appendices](#5-appendices)

## Revision History

<table>
<tr>
<th>Name</th>
<th>Date</th>
<th>Reason for Changes</th>
<th>Version</th>
</tr>
<tr>
<td>Amr Mamdouh, Mariam Samaha, Mai Mostafa</td>
<td>22 Nov 2024</td>
<td>Initial version</td>
<td>1.0</td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
</table>

## 1. Introduction

### 1.1 Document Purpose
This document specifies the functional and non-functional requirements for BloodConnect, 
a platform designed to bridge the gap between blood donors and recipients. 
It aims to provide a detailed description of the system's functionality,
ensuring effective communication among stakeholders, including developers, users, and regulators.

### 1.2 Product Scope
BloodConnect is a software platform that establishes communication between blood donors and requesters. 
It addresses the problem of delayed access to blood in emergencies by providing a user-friendly interface to manage blood requests, 
donor profiles, and donation including:
- Enabling users to post blood requests specifying type, urgency, and location.
- Allowing donors to view requests, filter based on their compatibility, and schedule donations.
- Providing a secure, scalable, and user-friendly solution accessible via web and mobile platforms.

### 1.3 References
[OWASP Guidelines](https://owasp.org/www-project-secure-coding-practices-quick-reference-guide/)

### 1.4 Document Overview
This SRS is structured to provide an overview of BloodConnect, its functionality,
and the requirements necessary for its development and implementation. Specific details on system architecture,
user interactions, and design considerations are outlined in subsequent sections.

## 2. Overall Description
  
### 2.1 Product Perspective
#### Problem:
- Access to blood for medical emergencies and surgeries is often challenging due to inadequate communication between donors and recipients. This results in critical delays that can endanger lives. Current systems lack an efficient platform where individuals can easily request or donate blood, often requiring time-consuming manual processes or dependence on local blood banks with limited resources.  
The proposed platform aims to bridge this gap by providing an accessible, user-friendly solution for facilitating blood donations. It ensures that blood recipients can connect with donors promptly while adhering to essential medical and regulatory guidelines.

#### Solution:
- It’s a platform designed to bridge the gap between those in urgent need of blood and willing donors. In critical medical situations, such as surgeries, emergencies, and life-threatening conditions, finding the right blood type in time can be a matter of life or death. Blood Connect provides an intuitive and reliable interface to facilitate blood requests, manage donor profiles, and streamline the process of connecting recipients with nearby eligible donors.
- The platform allows users to create blood requests, specifying blood type and location, while enabling donors to view requests in their area and schedule donation appointments. With search and filter options, users can find compatible donors, blood banks, and hospitals with ease.

### 2.2 Product Features
Product features include:
- User signing up for the site.
- User choosing either to become a donor or to request blood.
- Identifying nearby hospitals or blood banks via map integration.
- Communication with said hospitals and blood banks.
- Ability to search for the blood type the user needs via search bar.
### 2.3 User Classes and Characteristics
**Donors**: They will donate blood to either blood banks or hospitals through our platform.
**Recipients/Requesters**: People who create urgent blood requests.
**Hospitals/BloodBanks**: Institutions who will manage blood requests, and communicate with our platform to check the requests of users or accept donations of donors.  
**Admins**: Developers and admins who will manage our website.

### 2.4 Operating Environment
**Web Platform:** Compatible with modern browsers (Chrome, Firefox, Safari).  
**Mobile Platform:** Applications for Android and iOS devices

### 2.5 Constraints
Adherence to medical guidelines and local egyptian regulations for blood donation.

### 2.6 Assumptions and Dependencies


## 3. Requirements

### 3.1 Functional Requirements

Functional requirements:
1. User Registration: Users (donors and recipients) can create accounts and log in securely
2. Profile Management: Users can update their profiles with additional details, such as contact preferences.
3. Blood Request Management: Recipients can post requests specifying blood type, urgency level, and location.
4. Blood Donation Management: Donors can view active blood requests and respond to those matching their blood type
5. Search and Filtration: Users can filter and search by location, blood typem or request date for efficient matching
6. Health Tips for Blood Donation: A section offering tips and guidelines on safe blood donation practices to encourage and educate donors
7. Donation History: users can view past donation activities, including dates, locations, and recipients
8. Emergency Contacts and Support: a directory of emergency contacts for blood banks, hospitals, and customer support for immediate assistance.
9. FAQs and Guidance: A repository of frequently asked questions and guides to help users understand how the platform works and the importance of blood donation.
10. Map Integration: Integration with mapping services to show blood banks, and hospitals with ease
11. Notifications and alerts: Real-time alerts for new matches, updates on requests, or reminders for eligible donation dates
12. Feedback and Rating System: Users can rate their experience to build trust and improve platform services. 

### 3.2 External Interface Requirements
#### 3.2.1 User Interfaces
#### 3.2.2 Hardware Interfaces
#### 3.2.3 Software Interfaces
#### 3.2.4 Communication Interfaces

### 3.3 Non-functional Requirements
#### 3.3.1 Performance Requirements
- The platform should handle up to 40,000 concurrent users efficiently, ensuring smooth operations.
- Search results must load within 2-3 seconds.

#### 3.3.2 Safety Requirements

#### 3.3.3 Security Requirements

- Adhere to OWASP guidelines to defend maintain security and prevent attacks such as SQL injection, cross-site scripting (XSS) and sensitive data exposure.
- Implement OWASP-recommended secure coding practices to mitigate the risk of the attacks mentioned above from happening.

#### 3.3.4 Software Quality Attributes
- **Usability**: The platform should be easy to use and accessible to different categories of people with varying levels of technical proficiency.
- **Scalability**: Accommodate a growing number of users and new regions.
- **Compatibility**: Ensure support across web browsers and mobile devices including IOS and Android devices.
- **Reliability**: The system should maintain high uptime (99.9%) and include mechanisms to avoid service disruptions.
- **Accessibility**: Include support for screen readers to support those with disabilities.

## 4 Legal and Regulatory Requirements

### 4.1 Data Protection
Compliance with Egyptian data protection law. ( Law No. 151 of 2020 )

## 5. Appendices
