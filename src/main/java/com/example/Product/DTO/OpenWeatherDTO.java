package com.example.Product.DTO;

import java.util.List;

public class OpenWeatherDTO {
    List<WeatherDTO> weatherDTOList;
    String timezone;
    String name;

    public List<WeatherDTO> getWeatherDTOList() {
        return weatherDTOList;
    }

    public void setWeatherDTOList(List<WeatherDTO> weatherDTOList) {
        this.weatherDTOList = weatherDTOList;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
