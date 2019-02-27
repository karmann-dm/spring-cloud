FROM java:8-jre
MAINTAINER Karmanov Dmitry <karmanno@gmail.com>

ADD ./target/frontend-service.jar /app/
CMD ["java", "-jar", "/app/frontend-service.jar"]

EXPOSE 8080