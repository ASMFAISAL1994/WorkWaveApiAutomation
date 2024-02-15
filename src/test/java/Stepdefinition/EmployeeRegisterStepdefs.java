package Stepdefinition;

import Core.ApiCall;
import Core.FileHandleHelper;
import Core.HeaderFormatHelper;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import Repository.RemoteRepo.requestRepo.EmployeeRegPostRequestModel;
import Repository.RemoteRepo.responseRepo.EmployeeRegPostResponseModel;


import static Core.CoreConstrainHelper.base_url;
import static Core.FilePathHelper.postApiPath;

public class EmployeeRegisterStepdefs {
    EmployeeRegPostRequestModel employeeRegPostRequestModel;
    Response postapiresponse;

    private Gson gson = new Gson();
    private String requestModel;
    String url;
    @Given("user has the api {string}")
    public void userHasTheApi(String path) {
        url= base_url+path;

    }

    @When("user hit {string} and {string}")
    public void userHitAnd(String email , String password) {
        JSONObject requestBody= new FileHandleHelper().readJsonFile(postApiPath);
        employeeRegPostRequestModel=new Gson().fromJson(requestBody.toJSONString(),EmployeeRegPostRequestModel.class);
        employeeRegPostRequestModel.setPassword(password);
        employeeRegPostRequestModel.setEmail(email);
        requestModel = gson.toJson(employeeRegPostRequestModel);


    }

    @And("call the api with body")
    public void callTheApiWithBody() {
        postapiresponse= ApiCall.postCall(HeaderFormatHelper.commonHeaders(),requestModel,url);
        System.out.println(postapiresponse.body().asString());


    }

    @Then("it will return created date data")
    public void itWillReturnCreatedDateData() {
        EmployeeRegPostResponseModel employeeRegPostResponseModel = gson.fromJson(postapiresponse.getBody().asString(), EmployeeRegPostResponseModel.class);
        System.out.println(employeeRegPostResponseModel.getId());
        System.out.println(employeeRegPostResponseModel.getToken());
    }
}
