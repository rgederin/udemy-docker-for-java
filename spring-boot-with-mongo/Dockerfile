FROM java:8
VOLUME /tmp
ADD target/spring-mongo.jar spring-mongo.jar
RUN bash -c 'touch /spring-mongo.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-mongo.jar"]