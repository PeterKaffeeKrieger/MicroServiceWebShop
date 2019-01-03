# SanityService

Sanity Service
- API version: 1.0.0
  - Build date: 2019-01-03T17:47:55.174Z

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>SanityService</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:SanityService:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/SanityService-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import hska.microServiceWebShop.api.*;
import hska.microServiceWebShop.api.auth.*;
import hska.microServiceWebShop.models.*;
import hska.microServiceWebShop.api.SanityService.CategoriesApi;

import java.io.File;
import java.util.*;

public class CategoriesApiExample {

    public static void main(String[] args) {
        
        CategoriesApi apiInstance = new CategoriesApi();
        String name = "name_example"; // String | The name of the category
        try {
            Category result = apiInstance.addCategory(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#addCategory");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8081*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CategoriesApi* | [**addCategory**](docs/CategoriesApi.md#addCategory) | **POST** /categories | Adds a new category
*CategoriesApi* | [**deleteCategory**](docs/CategoriesApi.md#deleteCategory) | **DELETE** /categories/{id} | Deletes a category
*CategoriesApi* | [**getCategory**](docs/CategoriesApi.md#getCategory) | **GET** /categories/{id} | Retrieves a category
*CategoriesApi* | [**queryCategories**](docs/CategoriesApi.md#queryCategories) | **GET** /categories | Queries categories. If no name is provided all categories will be returned
*ProductsApi* | [**addProduct**](docs/ProductsApi.md#addProduct) | **POST** /products | Adds a new product
*ProductsApi* | [**deleteProduct**](docs/ProductsApi.md#deleteProduct) | **DELETE** /products/{id} | Deletes a product
*ProductsApi* | [**getProduct**](docs/ProductsApi.md#getProduct) | **GET** /products/{id} | Retrieves a product
*ProductsApi* | [**queryProducts**](docs/ProductsApi.md#queryProducts) | **GET** /products | Queries products. If no name is provided all products will be returned
*UserRoleApi* | [**createRole**](docs/UserRoleApi.md#createRole) | **POST** /roles | Create role
*UserRoleApi* | [**createUser**](docs/UserRoleApi.md#createUser) | **POST** /users | Create user
*UserRoleApi* | [**deleteRole**](docs/UserRoleApi.md#deleteRole) | **DELETE** /roles/{id} | Delete role with Id
*UserRoleApi* | [**deleteUser**](docs/UserRoleApi.md#deleteUser) | **DELETE** /users/{id} | Delete user with Id
*UserRoleApi* | [**getRoleById**](docs/UserRoleApi.md#getRoleById) | **GET** /roles/{id} | Get role by Id
*UserRoleApi* | [**getRoles**](docs/UserRoleApi.md#getRoles) | **GET** /roles | Get roles
*UserRoleApi* | [**getUserById**](docs/UserRoleApi.md#getUserById) | **GET** /users/{id} | Get user by Id
*UserRoleApi* | [**getUsers**](docs/UserRoleApi.md#getUsers) | **GET** /users | Get users
*UserRoleApi* | [**setRoleById**](docs/UserRoleApi.md#setRoleById) | **PUT** /roles/{id} | Set role by Id
*UserRoleApi* | [**setUserById**](docs/UserRoleApi.md#setUserById) | **PUT** /users/{id} | Set user by Id


## Documentation for Models

 - [Category](docs/Category.md)
 - [Product](docs/Product.md)
 - [Role](docs/Role.md)
 - [User](docs/User.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

bhb127@outlook.de
