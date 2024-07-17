
package api.controllers;

import api.ApiRequest;

import api.entities.User;
import io.qameta.allure.Step;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

import static api.statics.TalentLMSEndpoints.*;


public class UserController extends ApiRequest {
    public UserController(String url) {
        super(url);
    }

    @Step("Get all users")
    public User[] getUsers() {
        return super.get(getEndpoint(API, V1, USERS)).as(User[].class);
    }

    @Step("Get user by")
    public User getUserBy(By by, String value) {
        HashMap<String, String> parameters = new HashMap<>() {{
            put(by.getKey(), value);
        }};
        return super.get(getEndpoint(API, V1, USERS
                , formatParameter(parameters))).as(User.class);
    }

    @Step("Create a new user {}")
    public User createUser(User user) {
        return super.post(getEndpoint(API, V1, USER_SIGNUP), user.toJson()).as(User.class);
    }

    @Step("Delete a user by id {}")
    public void deleteUser(String userId) {
        Map<String, String> params = new HashMap<>() {{
            put("user_id", userId);
            put("deleted_by_user_id", "1");
        }};
        super.post(getEndpoint(API, V1, DELETE_USER), params);
    }

    @Getter
    public enum By {
        ID("id"),
        USERNAME("username"),
        EMAIL("email");
        public final String key;

        By(String key) {
            this.key = key;
        }
    }
}
