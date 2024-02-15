package Stepdefinition;

import Core.ApiCall;
import Core.DatabaseManager;
import Core.HeaderFormatHelper;
import Repository.LocalRepo.dbModel.UserDbModel;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import Repository.RemoteRepo.responseRepo.EmployeeRegGetResponseModel;

import java.sql.ResultSet;
import java.sql.SQLException;

import static Core.CoreConstrainHelper.base_url;

public class EmployeeGetApiStepdefs {
    String url;
    UserDbModel userDbModel;

    private Response response;
    private Gson gson=new Gson();

    @Given("users has the api {string}")
    public void usersHasTheApi(String path) {
        url= base_url+path;
    }

    @When("user call {string}and {string}")
    public void userCallParamsAndParamsValue(String params,String paramsValue) {
        url= url + params+"="+paramsValue;
        System.out.println(url);
        response= ApiCall.getCall(HeaderFormatHelper.commonHeaders(),url);
        System.out.println(response.body().asString());



    }

    @Then("it will return valid data")
    public void itWillReturnValidData() throws SQLException, ClassNotFoundException {
        System.out.println(url);
        EmployeeRegGetResponseModel employeeRegGetResponseModel= gson.fromJson(response.getBody().asString(), EmployeeRegGetResponseModel.class);
        System.out.println(employeeRegGetResponseModel.getData());











//
//        ResultSet rs =  DatabaseManager.executeQueries("select * from qa_test.api limit 2");
////        ResultSet rs = DatabaseManager.executeQueries("SELECT * FROM qa_test.api WHERE id_1 = 4"); // Replace 123 with the specific ID you want to fetch
////        ResultSet rs =  DatabaseManager.executeQueries("select * from qa_test.api");
//        while (rs.next()){
//            UserDbModel userDbModel= new UserDbModel();
//
//            userDbModel.setId(rs.getInt("id_1"));
//            userDbModel.setJob(rs.getString("job"));
//            userDbModel.setName(rs.getString("name"));
//            System.out.println(userDbModel.getId());
//            System.out.println(userDbModel.getJob());
//            System.out.println(userDbModel.getName());
//
//
//
//
//
//
//
//        }


    }


}
