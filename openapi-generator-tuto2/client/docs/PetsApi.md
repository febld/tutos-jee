# PetsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPets**](PetsApi.md#listPets) | **GET** /pets | List all pets

<a name="listPets"></a>
# **listPets**
> listPets(limit)

List all pets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PetsApi;


PetsApi apiInstance = new PetsApi();
Integer limit = 56; // Integer | 
try {
    apiInstance.listPets(limit);
} catch (ApiException e) {
    System.err.println("Exception when calling PetsApi#listPets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

