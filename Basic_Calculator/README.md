
## Introduction

    This is an Basic_Calculator build using java as well as using user defined packages

## Prerequisites
   
    Java 1.8 or above and i have also uploaded vs code default settings to use this project named "settings.json" 

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources and packages made by users
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

1) Add dependency into your pom file as below:
```xml
<dependency>
<groupId>${project.groupId}</groupId>
<artifactId>${project.artifactId}</artifactId>
</dependency>
```
## Created by Tech-Hacker16 