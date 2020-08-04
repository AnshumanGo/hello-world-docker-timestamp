FROM alpine:latest
ADD DockerDemo.class DockerDemo.class
RUN apk --update add openjdk8-jre
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "DockerDemo"]
