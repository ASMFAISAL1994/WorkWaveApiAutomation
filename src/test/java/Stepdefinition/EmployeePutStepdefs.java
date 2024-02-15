package Stepdefinition;

import Core.ApiCall;
import Core.FileHandleHelper;
import Core.HeaderFormatHelper;
import Repository.RemoteRepo.requestRepo.EmployeeRegPutRequestModel;
import Repository.RemoteRepo.responseRepo.EmployeeRegPutResponseModel;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static Core.CoreConstrainHelper.base_url;
import static Core.FilePathHelper.putApiPath;

public class EmployeePutStepdefs {
    String url;
    EmployeeRegPutRequestModel employeeRegPutRequestModel;
    private Gson gson = new Gson();

    private String requestModel;

    Response putApiResponse;
    @Given("user got the api {string}")
    public void userGotTheApi(String path) {
        url = base_url + path;

    }

    @When("user hits {string}and {string}")
    public void userHitsAnd(String name, String job) {
        JSONObject requestBody = new FileHandleHelper().readJsonFile(putApiPath);
        employeeRegPutRequestModel = new Gson().fromJson(requestBody.toJSONString(), Repository.RemoteRepo.requestRepo.EmployeeRegPutRequestModel.class);
        employeeRegPutRequestModel.getName(name);
        employeeRegPutRequestModel.getJob(job);
        requestModel = gson.toJson(employeeRegPutRequestModel);

    }

    @And("calls the api with changed body")
    public void callsTheApiWithChangedBody() {
        putApiResponse = ApiCall.putCall(HeaderFormatHelper.commonHeaders(), requestModel, url);
        System.out.println(putApiResponse.body().asString());

    }

    @Then("it will return updated data")
    public void itWillReturnUpdatedData() {
        EmployeeRegPutResponseModel employeeRegPutResponseModel=gson.fromJson(putApiResponse.getBody().asString(), EmployeeRegPutResponseModel.class);
        System.out.println(employeeRegPutResponseModel.getName());
        System.out.println(employeeRegPutResponseModel.getJob());
        System.out.println(employeeRegPutResponseModel.getUpdatedAt());
    }
}

