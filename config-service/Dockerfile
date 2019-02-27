FROM java:8-jre
MAINTAINER Karmanov Dmitry <karmanno@gmail.com>

ADD ./target/config-service.jar /app/
CMD ["java", "-jar", "/app/config-service.jar"]

EXPOSE 8081