package registationStepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import registrationModel.RegistrationResponse;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RegistrationStepDefs {
    private RegistrationRequester registrationRequester = new RegistrationRequester();
    private RegistrationResponse registrationResponse;

    @Given("customer data")
    public void get_RegistrationData(Map<String, String> data) {

        data.get(registrationResponse.getEmail());
        new BigDecimal(data.get(registrationResponse.getPhone()));
        data.get(registrationResponse.getPwd());
        new BigDecimal(data.get(registrationResponse.getBirthDate()));
        data.get(registrationResponse.getDescription());
    }

    @And("address is")
    public void get_RegistrationAddress(Map<String, String> address) {
        address.get(registrationResponse.getAddress().getCountry());
        address.get(registrationResponse.getAddress().getCity());
        address.get(registrationResponse.getAddress().getState());
        address.get(registrationResponse.getAddress().getZip());
        address.get(registrationResponse.getAddress().getStreet());
    }

    @When("we getting customer data from RequesterResponse")
    public void get_customerData() {
        registrationResponse = registrationRequester.getCustomerData();
    }

    @Then("answer is On success")
    public void get_PositiveAnswer(Map<String, String> positiveAnswer) {
        assertEquals("incorrect result", positiveAnswer.get("result"), registrationResponse.getPositiveResponse().getResult());
        assertEquals("incorrect details", positiveAnswer.get("details"), registrationResponse.getPositiveResponse().getDetails());

    }

    //  @Then("we are trying register data with missed field:")
    //  public void get_MissedField(Map<String, String> emptyField) {
    //     emptyField.get(registrationResponse.getDescription());
    //  }

    // @And("answer is On error:")
    //  public void get_NegativeAnswer(Map<String, String> negativeAnswer) {
    //       assertEquals("incorrect result", negativeAnswer.get("result"), registrationResponse.getNegativeResponse().getResult());
    //       assertEquals("incorrect details", negativeAnswer.get("details"), registrationResponse.getNegativeResponse().getDetails());
    //   }

}




