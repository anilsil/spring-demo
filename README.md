# spring-demo

This is basic "Hello world" application built using spring-boot. 

manifest.yml : This file contains the defnition of application, cf push command teakes application name from this file if not specified.

How to run locally:

STS -> Run as spring boot application -> access url http://localhost:8080

How to run in cloud foundry or PWS 

cf login -a <apitarget>
cf push

check urls at the end of complition. 
