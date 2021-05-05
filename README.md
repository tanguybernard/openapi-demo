# OpenApi 3.0 Demo

## Install

    npm install @openapitools/openapi-generator-cli -g


## How To generate code ?

### Javascript (Client)

#### Generate

    openapi-generator-cli generate -g javascript  -i ./definitions/openapi.yaml -o ./js-specification --additional-properties projectName=js-specification

#### Install and Build

    npm i
    npm run build

#### Use locally into your Client (example : react)

    "dependencies": {
    ...
    "js-specification": "file:../js-specification/dist",
    ...
    },

### Typescript Angular (Client)

    openapi-generator-cli generate -g typescript-angular -i ./definitions/openapi.yaml -o ./angular-specification  --additional-properties npmName=slim-api,snapshot=false,ngVersion=10.0.0,npmVersion=0.0.1

### Java Spring (Server)

    openapi-generator-cli generate -g spring -i ./definitions/openapi.yaml -c conf.json -o ./spring-boot-specification

conf.json

    {
        "basePackage": "com.demo.codegen",
        "configPackage": "com.demo.codegen.config",
        "apiPackage": "com.demo.codegen.controllers",
        "modelPackage": "com.demo.codegen.model",
        "groupId": "com.demo",
        "artifactId": "spring-boot-specification"
    }


### Tips and Tricks

Use tag on you yaml (or json) definition to separate the content of services. Otherwise, default service is used.

## Credits

https://wstutorial.com/rest/spring-boot-openapi-codegen.html

https://www.north-47.com/knowledge-base/generate-spring-boot-rest-api-using-swagger-openapi/

https://support.smartbear.com/swaggerhub/docs/tutorials/openapi-3-tutorial.html