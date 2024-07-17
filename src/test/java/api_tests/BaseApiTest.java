package api_tests;

import api.application.TalentLMSApplication;
import org.testng.annotations.BeforeSuite;

import static api.statics.TalentLMSEndpoints.URL;

public class BaseApiTest {
    protected TalentLMSApplication application;

    @BeforeSuite(alwaysRun = true)
    public void setup() {
        application = new TalentLMSApplication(URL);
    }
}