class  CropRunner3{
public static void main(String[] args){
Season season=new Season();
season.setSeasonName("Summer");


Crop crop=new Crop();
crop.createInfo(season);
crop.getInfo();
}}