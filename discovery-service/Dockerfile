FROM java:8-jre
MAINTAINER Karmanov Dmitry <karmanno@gmail.com>

ADD ./target/discovery-service.jar /app/
CMD ["java", "-jar", "/app/discovery-service.jar"]

EXPOSE 8761