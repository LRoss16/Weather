package com.example.lewis.weather.json;

public class Weather {

    WeatherResults weatherResults;

    public Weather(WeatherResults weatherResults){
        this.weatherResults = weatherResults;
    }

    public WeatherResults getWeatherResults() {
        return weatherResults;
    }
}
