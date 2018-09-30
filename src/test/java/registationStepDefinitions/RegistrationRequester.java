package registationStepDefinitions;

import org.springframework.web.client.RestTemplate;
import registrationModel.RegistrationResponse;

public class RegistrationRequester {
    private final String URL = "207.154.242.0:8888";

    public RegistrationResponse getCustomerData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(URL, RegistrationResponse.class).getBody();
    }
}

