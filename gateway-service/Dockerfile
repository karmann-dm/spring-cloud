FROM java:8-jre
MAINTAINER Karmanov Dmitry <karmanno@gmail.com>

ADD ./target/gateway-service.jar /app/
CMD ["java", "-jar", "/app/gateway-service.jar"]

EXPOSE 8765