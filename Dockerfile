FROM openjdk:8-jre-alpine

WORKDIR /usr/app

COPY ./output/demo-0.0.1-SNAPSHOT.jar ./

CMD ["java","-jar","./demo-0.0.1-SNAPSHOT.jar","com.docker.example.demo.DemoApplication"]
