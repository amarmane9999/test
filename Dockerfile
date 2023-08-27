FROM registry.access.redhat.com/ubi9/openjdk-11@sha256:a0a1c5d527d42afb99dbf748581c5dcf95d6943c443fbb9a107fc54b635dfb00

LABEL base-image="java:8" \
      purpose="Hello World Fuse Dockerfile"

MAINTAINER Muhammad Edwin < edwin at redhat dot com >

# set working directory at /deployments
WORKDIR /deployments

# copy my jar file
COPY target/*.jar app.jar

# gives uid
USER 185

EXPOSE 8080

# run it
CMD ["java", "-jar","app.jar"]