# Salsa Project

Semester Abroad Lovely Semester Application

A platform for INSA organisation for study abroad semester of student.

## Sumary
* Getting started
* Project convention
* Model architecture
* Network topology
* Documentation
* Authors

## Getting started
### Required
* Java jdk 1.8
* Node js

### Installation instruction
*TODO*

### Clone project from github
#### IntelliJ Jetbrains
* Choose **New** > **Project from Version Control** > **Git** > Fill with URL of this Git
* Wait for loading
* Include Lombok
* Click **Edit Configuration** (up ahead) > 
Click the **+** in the up left > **Spring Boot** > Fill the **Name**, 
in *Main class* Choose **SalsaWebappApplication.java**

#### Eclipse
**TODO**

## Project convention
### Global organisation
1. The core application consists of 2 modules: **salsa-webapp** and **salsa-model**
1. The client front-end (GUI) is in sub-project **salsa-front**
1. All other modules are webservice

### Name convention
1. Consisting of module: Main application's name prefixed with `salsa-*`, web service prefixed with `ws-*`
1. All Controller class suffixed with `*Controller`
1. All service class suffixed with `*Service`
1. So on with `*Repository`, `*Exception`, `*Advice`

### Detail organisation
1. In **salsa-model**: 
  1. package `fr.insa.soa.model.bean` contains entities.
  1. package `fr.insa.soa.model.exception` relies on exception when finding in database.
  1. package `fr.insa.soa.model.repository` has interface (the code is autogenerated by **Spring**).

1. In **salsa-webapp**:
  1. package `fr.insa.soa.advisor` translates `*Exception` from `fr.insa.soa.model.exception` to Http response.
  1. package `fr.insa.soa.consumer` connect with outer (Database, Webservice, ...)
  1. package `fr.insa.soa.controller` has controllers and business logic.
  
## Model architecture
**TODO**

## Network topology
**TODO**

## Documentaion
**TODO**

## Authors
* Duc Hau NGUYEN
* Thien Nhat VAN
* Fatima LALAOI
* Constantin DOGGYDOG
* Adrien GONZALEZ