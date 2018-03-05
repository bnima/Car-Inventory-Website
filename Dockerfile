FROM openjdk:latest
MAINTAINER Nima Bagheri
ADD target/car-inventory.jar /default/car-inventory.jar
USER root
RUN chown root:root /default
RUN chmod 777 /default
EXPOSE 8080
CMD ["java","-jar","/default/car-inventory.jar"]