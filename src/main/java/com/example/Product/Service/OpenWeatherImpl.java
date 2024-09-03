package com.example.Product.Service;

import com.example.Product.DTO.OpenWeatherDTO;
import com.example.Product.DTO.WeatherDTO;
import com.example.Product.Model.OpenWeather;
import com.example.Product.Model.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpenWeatherImpl implements  OpenWeatherService{
    @Override
    public OpenWeather getWeather(double lat, double lon) {
        String url="https://api.openweathermap.org/data/2.5/weather?lat="
                +lat+"&lon="+lon+"&appid=8652632e3dc25077965379bf1ef251f9";
        RestTemplate restTemplate = new RestTemplate();
        OpenWeatherDTO openWeatherDTO=restTemplate.getForObject(url, OpenWeatherDTO.class);
        return convertToOpenWeather(openWeatherDTO);
    }
    public OpenWeather convertToOpenWeather(OpenWeatherDTO openWeatherDTO){
        OpenWeather openWeather=new OpenWeather();
        List<Weather> weatherList=new ArrayList<>();
        for(WeatherDTO weatherDTO:openWeatherDTO.getWeatherDTOList()){
            Weather weather=new Weather();
            weather.setWeatherCondition(weatherDTO.getMain());
            weather.setWeatherDescription(weatherDTO.getDescription());
            weatherList.add(weather);
        }
        openWeather.setWeatherList(weatherList);
        openWeather.setCityName(openWeatherDTO.getName());
        openWeather.setTimeZone(openWeatherDTO.getTimezone());
        return openWeather;
    }
}
