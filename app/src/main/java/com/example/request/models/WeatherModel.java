package com.example.request.models;

public class WeatherModel {
    private String condition;
    private String conditionImg;
    private double temp;
    private Localization localization;

    public WeatherModel() {
        this.condition = "Não foi possível recuperar informações sobre o clima";
        this.conditionImg = "";
        this.temp = 0;
        this.localization = new Localization();
    }

    public WeatherModel(String condition, String conditionImg, double temp, Localization localization) {
        this.condition = condition;
        this.conditionImg = conditionImg;
        this.temp = temp;
        this.localization = localization;
    }

    public String getCondition() { return condition; }

    public String getConditionImg() { return conditionImg; }

    public double getTemp() { return temp; }

    public Localization getLocalization() { return localization; }
}