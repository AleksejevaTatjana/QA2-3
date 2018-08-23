package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Response {
    private Coord coord;

    private Wind wind;
    private Clouds clouds;
    private Sys sys;
    private BigDecimal id;
    private String name;
    private BigDecimal cod;
    private Main main;
    private BigDecimal visibility;
    private String base;
    private BigDecimal dt;
    private Weather weather;

    public void getWeatherList() {
        List<String> list = new ArrayList();

        list.equals(getWeather().getId());
        list.equals(getWeather().getMain());
        list.equals(getWeather().getDescription());
        list.equals(getWeather().getIcon());
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }


    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }


    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }


    public BigDecimal getVisibility() {
        return visibility;
    }

    public void setVisibility(BigDecimal visibility) {
        this.visibility = visibility;
    }

    public BigDecimal getDt() {
        return dt;
    }

    public void setDt(BigDecimal dt) {
        this.dt = dt;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCod() {
        return cod;
    }

    public void setCod(BigDecimal cod) {
        this.cod = cod;
    }


}






