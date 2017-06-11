#!/usr/bin/env bash

docker build mongodb/. -t mongo-image
mvn clean package docker:build