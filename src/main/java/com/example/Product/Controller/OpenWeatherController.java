package com.example.Product.Controller;

import com.example.Product.Model.OpenWeather;
import com.example.Product.Service.OpenWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Weather")
public class OpenWeatherController {
    @Autowired
    public OpenWeatherService openWeatherService;

    @GetMapping("/now/{lat}/{lon}")
    public ResponseEntity<OpenWeather> getWeather(@PathVariable("lat") double lat,
                                                  @PathVariable("lon") double lon) {
        OpenWeather openWeather= openWeatherService.getWeather(lat, lon);
        return new ResponseEntity<>(openWeather, HttpStatusCode.valueOf(200));
    }
}
