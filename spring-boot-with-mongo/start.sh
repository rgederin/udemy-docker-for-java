#!/usr/bin/env bash

docker run -p 27017:27017 -d --name mongo-container mongo-image

docker run -p 8080:8080 -d --name spring-container --link mongo-container:mongodb spring-mongo-image