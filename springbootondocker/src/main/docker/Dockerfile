FROM java:8
VOLUME /tmp
ADD /maven/springbootondocker.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]