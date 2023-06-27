#!/bin/sh
mvn clean spring-boot:run 2>&1 | tee log.log
