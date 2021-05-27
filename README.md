# OpenApi 3.0 Demo

## Install

    npm install @openapitools/openapi-generator-cli -g


## How To generate code ?

### Javascript (Client)

#### Generate

    openapi-generator-cli generate -g javascript  -i ./definitions/openapi.yaml -o ./js-specification --additional-properties projectName=js-specification,usePromises=true

#### Install and Build

    npm i
    npm run build

#### Use locally into your Client (example : react)

    "dependencies": {
    ...
    "js-specification": "file:../js-specification/dist",
    ...
    },


    npm install

### Typescript Angular (Client)

    openapi-generator-cli generate -g typescript-angular -i ./definitions/openapi.yaml -o ./angular-specification  --additional-properties npmName=slim-api,snapshot=false,ngVersion=10.0.0,npmVersion=0.0.1

### Java Spring Boot (Server)

    openapi-generator-cli generate -g spring -i ./definitions/openapi.yaml -c ./conf/java-spring-boot/conf.json -o ./spring-boot-specification

### Kotlin SpringBoot

    openapi-generator-cli generate -g kotlin-spring -i ./definitions/openapi.yaml -o ./kotlin-spring-boot-specification --additional-properties=library=spring-boot,serviceImplementation=true


Create package to use as dependencies

Into pom.xml of generated source code for spring-boot v2

    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <configuration>
                <classifier>exec</classifier>
            </configuration>
        </plugin>
    </plugins>


### Kotlin ktor

    openapi-generator-cli generate -g kotlin-server -i ./definitions/openapi.yaml -o ./kotlin-spring-boot-specification --additional-properties=library=ktor

conf.json

    {
        "basePackage": "com.demo.codegen",
        "configPackage": "com.demo.codegen.config",
        "apiPackage": "com.demo.codegen.controllers",
        "modelPackage": "com.demo.codegen.model",
        "groupId": "com.demo",
        "artifactId": "spring-boot-specification"
    }


### Create Springboot

    https://medium.com/litslink/spring-boot-with-kotlin-create-a-project-with-a-simple-html-page-and-api-endpoints-in-examples-17d905c0b711



### JWT

https://blog.softtek.com/en/token-based-api-authentication-with-spring-and-jwt

### Create react app

    npx create-react-app

### Tips and Tricks

Use tag on you yaml (or json) definition to separate the content of services. Otherwise, default service is used.

## Credits

https://wstutorial.com/rest/spring-boot-openapi-codegen.html

https://www.north-47.com/knowledge-base/generate-spring-boot-rest-api-using-swagger-openapi/

https://support.smartbear.com/swaggerhub/docs/tutorials/openapi-3-tutorial.html