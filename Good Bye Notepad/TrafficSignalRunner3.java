class TrafficSignalRunner3{
public static void main(String[] args){
Cop cop=new Cop();
cop.setCopName("Chow Chow");
cop.setCopId("FX-380");

TrafficSignal traffic=new TrafficSignal();
traffic.createInfo(cop);
traffic.getInfo();
}}