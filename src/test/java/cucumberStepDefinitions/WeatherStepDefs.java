package cucumberStepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import java.math.BigDecimal;
import java.util.Map;
import static org.junit.Assert.*;

public class WeatherStepDefs {
    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response;


    @When("we getting weather from server")
    public void get_weather() {
        response = weatherRequester.getWeather();
    }

    @Then("lon is (.*)")
    public void check_lon(BigDecimal lon) {
        assertEquals("wrong lon", lon, response.getCoord().getLon());
    }

    @And("lat is (.*)")
    public void check_lat(BigDecimal lat) {
        assertEquals("wrong lat", lat, response.getCoord().getLat());
    }


    @And("weather following data is")
    public void check_weather_data(Map<String, String> params) {
        assertEquals(new BigDecimal(params.get("wrong weather id")), response.getWeather().get(0).getId());
        assertEquals(params.get("wrong weather main"), response.getWeather().get(0).getMain());
        assertEquals(params.get("wrong weather description"), response.getWeather().get(0).getDescription());
        assertEquals(params.get(" wrong weather icon"), response.getWeather().get(0).getIcon());
    }

    @And("base is (.*)")
    public void check_base(String base) {
        assertEquals("Wrong base", base, response.getBase());
    }

    @And("the main is")
    public void check_main(Map<String, String> params) {
        assertEquals(new BigDecimal(params.get("wrong temperature")), response.getMain().getTemp());
        assertEquals(new BigDecimal(params.get("wrong atmospheric pressure")), response.getMain().getPressure());
        assertEquals(new BigDecimal(params.get("wrong humidity")), response.getMain().getHumidity());
        assertEquals(new BigDecimal(params.get("wrong minimum temperature")), response.getMain().getTemp_min());
        assertEquals(new BigDecimal(params.get("wrong maximum temperature")), response.getMain().getTemp_max());
    }

    @And("visibility is (.*)")
    public void check_visibility(BigDecimal visibility) {
        assertEquals("wrong visibility", visibility, response.getVisibility());

    }

    @And("the wind is")
    public void check_wind(Map<String, String> params) {
        assertEquals(new BigDecimal(params.get("wrong speed")), response.getWind().getSpeed());
        assertEquals(new BigDecimal(params.get("wrong direction")), response.getWind().getDeg());
    }

    @And("clouds all is (.*)")
    public void check_clouds(BigDecimal all) {
        assertEquals("wrong clouds data", all, response.getClouds().getAll());
    }

    @And("dt is (.*)")
    public void check_dt(BigDecimal dtData) {
        assertEquals("wrong dt data", dtData, response.getDt());
    }

    @And("the sys is")
    public void check_sys(Map<String, String> params) {
        assertEquals(new BigDecimal(params.get("wrong type")), response.getSys().getType());
        assertEquals(new BigDecimal(params.get("wrong id")), response.getSys().getId());
        assertEquals(new BigDecimal(params.get("wrong message")), response.getSys().getMessage());
        assertEquals(params.get("wrong country code"), response.getSys().getCountry());
        assertEquals(new BigDecimal(params.get("wrong sunrise time")), response.getSys().getSunrise());
        assertEquals(new BigDecimal(params.get("wrong sunset time")), response.getSys().getSunset());

    }
    @And("id is (.*)")
    public void check_id(BigDecimal id) {
        assertEquals("wrong id", id, response.getId());
    }

    @And("name is (.*)")
    public void check_name(String name) {
        assertEquals("wrong name", name, response.getName());
    }

    @And("cod is (.*)")
    public void check_cod(String cod) {
        assertEquals("wrong cod", cod, response.getCod());
    }
}


