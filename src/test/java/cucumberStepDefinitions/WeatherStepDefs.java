package cucumberStepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;

import java.math.BigDecimal;

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
        assertEquals("Wrong LON", lon, response.getCoord().getLon());
    }

    @And("lat is (.*)")
    public void check_lat(BigDecimal lat) {
        assertEquals("Wrong LAT", lat, response.getCoord().getLat());
    }


   @Then("weather following data is")
       public void check_weather_data (String weather){
           assertEquals ("Wrong weather data", weather, response.getWeatherList());

       }

    @And("base is (.*)")
    public void check_base(String base) {
        assertEquals("Wrong base", base, response.getBase());
    }


    @Then("^the main temp is (\\\\d+)\\\\.(\\\\d+) and pressure is (\\\\d+) the humidity is (\\\\d+) and temp_min is (\\\\d+)\\\\.(\\\\d+) and temp_max is (\\\\d+)\\\\.(\\\\d+)$")
    public void check_main(BigDecimal temp, BigDecimal pressure, BigDecimal humidity, BigDecimal temp_min, BigDecimal temp_max) {
        assertEquals("Wrong temp", temp, response.getMain().getTemp());
        assertEquals("Wrong pressure data", pressure, response.getMain().getPressure());
        assertEquals("Wrong humidity data", humidity, response.getMain().getHumidity());
        assertEquals("Wrong temp_min", temp_min, response.getMain().getTemp_min());
        assertEquals("Wrong temp_max", temp_max, response.getMain().getTemp_max());
    }

    @And("visibility is (.*)")
    public void check_visibility(BigDecimal visibil) {
        assertEquals("Wrong visibility", visibil, response.getVisibility());

    }
    @Then("^the wind speed is (\\\\d+)\\\\.(\\\\d+) and deg is (\\\\d+)$")
    public void check_wind(BigDecimal speed, BigDecimal deg) {
        assertEquals("Wrong wind speed data", speed, response.getWind().getSpeed());
        assertEquals("Wrong wind deg data", deg, response.getWind().getDeg());
    }

    @And("clouds all is (.*)")
    public void check_clouds(BigDecimal all) {
        assertEquals("Wrong clouds data", all, response.getClouds().getAll());
    }

    @Then("dt is (.*)")
    public void check_dt(BigDecimal dtData) {
        assertEquals("Wrong dt data", dtData, response.getDt());
    }

    @And("^the sys type is (\\\\d+) and id is (\\\\d+) message is (\\\\d+)\\\\.(\\\\d+) country is GB and sunrise is (\\\\d+) and sunset is (\\\\d+)$")
    public void check_sys(BigDecimal type, BigDecimal id, BigDecimal message, String country, BigDecimal sunrise, BigDecimal sunset) {
        assertEquals("Wrong type", type, response.getSys().getType());
        assertEquals("Wrong id", id, response.getSys().getId());
        assertEquals("Wrong message", message, response.getSys().getMessage());
        assertEquals("Wrong country data", country, response.getSys().getCountry());
        assertEquals("Wrong sunrise data", sunrise, response.getSys().getSunrise());
        assertEquals("Wrong sunset data", sunset, response.getSys().getSunset());
    }

    @Then("id is (.*)")
    public void check_id(BigDecimal id) {
        assertEquals("Wrong id", id, response.getId());
    }

    @And("name is (.*)")
    public void check_name(String name) {
        assertEquals("Wrong name", name, response.getName());

    }

    @Then("cod is (.*)")
    public void check_cod(String cod) {
        assertEquals("Wrong cod", cod, response.getCod());

    }
}


