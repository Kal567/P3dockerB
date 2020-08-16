FROM openjdk:8-jre-alpine
EXPOSE 8080
ADD /build/libs/P3dockerB-1.0-SNAPSHOT.jar .
VOLUME /tmp
CMD ["java", "-jar", "P3dockerB-1.0-SNAPSHOT.jar"]

