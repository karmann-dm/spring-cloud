FROM java:8-jre
MAINTAINER Karmanov Dmitry <karmanno@gmail.com>

ADD ./target/zipkin-service.jar /app/
CMD ["java", "-jar", "/app/zipkin-service.jar"]

EXPOSE 9411