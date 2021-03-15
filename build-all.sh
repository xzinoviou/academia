#!/bin/bash

file='microservices.txt'
info='[---BUILDING---]'
services=()

echo "$info - Microservices - START"
#read all values
while read line;
  do
    services+=($line)
  done < $file

for i in "${services[@]}"
  do
    echo "[---BUILDING---] : $i"
    cd $i
    mvn clean package -DskipTests=true
    cd ..

  done

echo "$info - Microservices - FINISHED"