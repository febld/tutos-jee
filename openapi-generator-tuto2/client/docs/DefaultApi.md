# DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPets**](DefaultApi.md#createPets) | **POST** /pets | Create a pet
[**showPetById**](DefaultApi.md#showPetById) | **GET** /pets/{petId} | Info for a specific pet

<a name="createPets"></a>
# **createPets**
> createPets()

Create a pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.createPets();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createPets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="showPetById"></a>
# **showPetById**
> showPetById(petId)

Info for a specific pet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String petId = "petId_example"; // String | pet identifier
try {
    apiInstance.showPetById(petId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#showPetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **String**| pet identifier |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

