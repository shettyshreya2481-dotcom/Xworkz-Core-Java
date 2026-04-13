class WeatherRunner3{
public static void main(String[] args){
Climate climate=new Climate();
climate.setClimate("Moody");
climate.setClimateDegree("42");

Weather weather=new Weather();
weather.createInfo(climate);
weather.getInfo();
}}