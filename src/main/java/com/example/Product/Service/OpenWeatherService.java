package com.example.Product.Service;

import com.example.Product.Model.OpenWeather;

public interface OpenWeatherService {
    public OpenWeather getWeather(double lat, double lon);
}
