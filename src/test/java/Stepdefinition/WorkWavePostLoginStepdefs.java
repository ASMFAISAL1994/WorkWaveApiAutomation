package Stepdefinition;

import Core.ApiCall;
import Core.DatabaseManager;
import Core.FileHandleHelper;
import Core.HeaderFormatHelper;
import Repository.LocalRepo.dbModel.UserDbModel;
import Repository.RemoteRepo.requestRepo.WorkWavePostLoginRequestModel;
import Repository.RemoteRepo.responseRepo.WorkWavePostLoginResponseModel;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.sql.ResultSet;
import java.sql.SQLException;

import static Core.CoreConstrainHelper.base_url;
import static Core.FilePathHelper.WorkWavePostApiPath;
import static Core.FilePathHelper.putApiPath;

public class WorkWavePostLoginStepdefs {
    String url;
    WorkWavePostLoginRequestModel workWavePostLoginRequestModel;
    private Gson gson = new Gson();
    private String requestModel;
    Response WorkWaveApiResponse;

    @Given("user has hit the api {string}")
    public void userHasHitTheApiPath(String path) {
        url = base_url + path;

    }

    @When("user will  provide email and password")
    public void userWillProvideEmailAndPassword() {
        JSONObject requestBody = new FileHandleHelper().readJsonFile(WorkWavePostApiPath);
        workWavePostLoginRequestModel = new Gson().fromJson(requestBody.toJSONString(), Repository.RemoteRepo.requestRepo.WorkWavePostLoginRequestModel.class);
        workWavePostLoginRequestModel.setEmail("adndiginet.imran@gmail.com");
        workWavePostLoginRequestModel.setPassword("123456");
        requestModel = gson.toJson(workWavePostLoginRequestModel);


    }

    @Then("user will login successfully")
    public void userWillLoginSuccessfully() throws SQLException, ClassNotFoundException {
        WorkWaveApiResponse = ApiCall.postCall(HeaderFormatHelper.commonHeaders(), requestModel, url);
        System.out.println(WorkWaveApiResponse.body().asString());
        WorkWavePostLoginResponseModel workWavePostLoginResponseModel = gson.fromJson(WorkWaveApiResponse.getBody().asString(), WorkWavePostLoginResponseModel.class);
        System.out.println(workWavePostLoginResponseModel.getData());
        System.out.println(workWavePostLoginResponseModel.getMessage());
        System.out.println(workWavePostLoginResponseModel.getCode());
        System.out.println(workWavePostLoginResponseModel.getData().getUser().getId());
        System.out.println(workWavePostLoginResponseModel.getData().getUser().getMobile());
        System.out.println(workWavePostLoginResponseModel.getData().getUser().getId());



        ResultSet rs = DatabaseManager.executeQueries("SELECT id,email,name,mobile,password FROM public.users");

        while (rs.next()) {
            UserDbModel userDbModel = new UserDbModel();

            userDbModel.setId(rs.getInt("id"));
            userDbModel.setEmail(rs.getString("email"));
            userDbModel.setName(rs.getString("name"));
            userDbModel.setMobile(rs.getString("mobile"));
            userDbModel.setPassword(rs.getString("password"));


            System.out.println(userDbModel.getId());
            System.out.println(userDbModel.getEmail());
            System.out.println(userDbModel.getName());
            System.out.println(userDbModel.getMobile());
            System.out.println(userDbModel.getPassword());

//            System.out.println(userDbModel.getJob());
//            System.out.println(userDbModel.getName());


        }
    }
}
