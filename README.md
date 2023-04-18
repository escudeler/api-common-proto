# Api Common Proto
Common Protos for gRPC Demo

## Projects list for gRPC example
**Follow the respectives readmes for build and execute them in following list order:**
```sh
git clone https://github.com/escudeler/api-common-proto.git
git clone https://github.com/escudeler/api-listen.git
git clone https://github.com/escudeler/api-speak.git
git clone https://github.com/escudeler/api-third-part.git
```

## Prerequisites
You have installed:

 - JDK 11
 - Maven
 - protoc

**Execute this commands on the project folder to generate grpc integration**

```sh
In the folder where is pom.xml, execute:
mvn clean package
```

 Reference using pom.xml dependencies:

```sh
<dependency>
    <groupId>escudeler.example</groupId>
    <artifactId>api-common-proto</artifactId>
    <version>this-version</version>
</dependency>
```

**Example for manual generation code (the protoc must be installed before)**

```sh
In the folder where is pom.xml create an "target" folder and execute:
 protoc --java_out=target src/main/proto/*

For generate files for any language, just run the following command (doing the substitution in --'language'_out ):
 protoc -I. --python_out=target --proto_path=src/main/proto/ src/main/proto/SpeakService.proto
 protoc -I. --python_out=target --proto_path=src/main/proto/ src/main/proto/ThirdPartService.proto


To execute only one command run line, in src/main/proto execute:
 protoc --js_out=../../../target ./* 
 ( this is my temporary solution to generate js files with no import issues )
```
 
