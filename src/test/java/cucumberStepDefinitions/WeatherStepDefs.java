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
        assertEquals("wrong id", new BigDecimal(params.get("id")), response.getWeather().get(0).getId());
        assertEquals("wrong main", params.get("main"), response.getWeather().get(0).getMain());
        assertEquals("wrong description", params.get("description"), response.getWeather().get(0).getDescription());
        assertEquals("wrong icon", params.get("icon"), response.getWeather().get(0).getIcon());
    }

    @And("base is (.*)")
    public void check_base(String base) {
        assertEquals("Wrong base", base, response.getBase());
    }

    @And("the main is")
    public void check_main(Map<String, String> params) {
        assertEquals("wrong temperature", new BigDecimal(params.get("temp")), response.getMain().getTemp());
        assertEquals("wrong atmospheric pressure", new BigDecimal(params.get("pressure")), response.getMain().getPressure());
        assertEquals("wrong humidity", new BigDecimal(params.get("humidity")), response.getMain().getHumidity());
        assertEquals("wrong minimum temperature", new BigDecimal(params.get("temp_min")), response.getMain().getTemp_min());
        assertEquals("wrong maximum temperature", new BigDecimal(params.get("temp_max")), response.getMain().getTemp_max());
    }

    @And("visibility is (.*)")
    public void check_visibility(Integer visibility) {
        assertEquals("wrong visibility", visibility, response.getVisibility());
    }

    @And("the wind is")
    public void check_wind(Map<String, String> params) {
        assertEquals("wrong speed", new BigDecimal(params.get("speed")), response.getWind().getSpeed());
        assertEquals("wrong direction", Integer.valueOf(params.get("deg")), response.getWind().getDeg());
    }

    @And("clouds all is (.*)")
    public void check_clouds(Integer all) {
        assertEquals("wrong clouds data", all, response.getClouds().getAll());
    }

    @And("dt is (.*)")
    public void check_dt(Integer dt) {
        assertEquals("wrong dt data", dt, response.getDt());
    }

    @And("the sys is")
    public void check_sys(Map<String, String> params) {
        assertEquals("wrong type", new BigDecimal(params.get("type")), response.getSys().getType());
        assertEquals("wrong id", new BigDecimal(params.get("id")), response.getSys().getId());
        assertEquals("wrong message", new BigDecimal(params.get("message")), response.getSys().getMessage());
        assertEquals("wrong country code", params.get("country"), response.getSys().getCountry());
        assertEquals("wrong sunrise time", new BigDecimal(params.get("sunrise")), response.getSys().getSunrise());
        assertEquals("wrong sunset time", new BigDecimal(params.get("sunset")), response.getSys().getSunset());
    }

    @And("id is (.*)")
    public void check_id(Integer id) {
        assertEquals("wrong id", id, response.getId());
    }

    @And("name is (.*)")
    public void check_name(String name) {
        assertEquals("wrong name", name, response.getName());
    }

    @And("cod is (.*)")
    public void check_cod(Integer cod) {
        assertEquals("wrong cod", cod, response.getCod());
    }
}


