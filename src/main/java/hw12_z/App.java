package hw12_z;

public class App {
    Architect architect = new Architect("Chris Abbott");
    Construction a = new Construction("Plaza",2015,"Postmodern",architect);
    Building building = new Building("Building",1990,"Art deco",architect,7);
    House house = new House("House",1967,"Country",architect);
    Mall mall = new Mall("Mall",2020,"Futuristic",architect,35000,245000);


}
