FROM java:8
VOLUME /tmp
ADD /maven/springbootondocker.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]