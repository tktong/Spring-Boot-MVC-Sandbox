FROM openjdk:8-jdk-alpine
LABEL maintainer="tktong418@gmail.com"

USER root
VOLUME /tmp
COPY --chown=tktong:tktong build/libs/SpringBootSample.jar sample.jar

USER tktong
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "sample.jar"]