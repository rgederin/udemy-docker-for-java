#!/usr/bin/env bash
mvn clean package docker:build
docker run  -p 1111:8080 -d hello-docker-image
