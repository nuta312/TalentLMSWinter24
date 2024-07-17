package api.statics;


import api.config.ConfigReader;

public final class TalentLMSEndpoints {
    public static final String URL = ConfigReader.getValue("url");
    public static final String API = "api";
    public static final String V1 = "v1";
    public static final String USERS = "users";
    public static final String USER_SIGNUP = "usersignup";
    public static final String DELETE_USER = "deleteuser";
}