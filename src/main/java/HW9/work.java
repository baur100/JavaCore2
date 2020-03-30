package HW9;

public class work {

    public static void main(String[] args) {


        aircraft A320 = new aircraft();
        aircraft AW120 = new aircraft();
        aircraft C172 = new aircraft();

        passenger ivanov = new passenger();
        passenger anderson = new passenger();
        // Define object from class as array example
        passenger[] folks = new passenger[5];

        for (int i=0; i<= folks.length-1; i++){
            folks[i]= new passenger();
        }

        pilot salyvan = new pilot();
        pilot abdurahman = new pilot();

        airport tampa = new airport();
        airport clearwater = new airport();


        salyvan.name = "Salyvan";
        salyvan.license = "ATPL";
        salyvan.position = "Captain";
        salyvan.likes = "Coffee";

        abdurahman.name = "Abdurahman";
        abdurahman.license = "CPL";
        abdurahman.position = "1st Officer";
        abdurahman.likes = "Tea";

        A320.type = "Jet";
        A320.category = "Aircraft";
        A320.name = "A320";
        A320.capacity = 146;
        A320.crewReq = 2;
        A320.runwayReq = 6500;
        A320.fuel = "JetAA";
        A320.coffee = true;

        AW120.type = "Jet";
        AW120.category = "Helicopter";
        AW120.name = "AW120";
        AW120.capacity = 6;
        AW120.crewReq = 2;
        AW120.runwayReq = 100;
        AW120.fuel = "JetAA";
        AW120.coffee = false;

        C172.type = "Piston";
        C172.category = "Aircraft";
        C172.name = "C172";
        C172.capacity = 4;
        C172.crewReq = 1;
        C172.runwayReq = 3500;
        C172.fuel = "100LL";
        C172.coffee = false;

        ivanov.name = "Ivanov";
        ivanov.age = 75;
        ivanov.direction = "Tampa";

        folks[1].name = "Trumps";
        folks[1].age = 47;
        folks[1].direction = "Newark";

        folks[2].name = "Petrovich";
        folks[2].age = 12;
        folks[2].direction = "Tampa";

        anderson.name = "Anderson";
        anderson.age = 31;
        anderson.direction = "Clearwater";




        tampa.name = "KTPA";
        tampa.rwySize = 8900;
        tampa.fuelType = "JetAA";
        tampa.terminalCap = 10000;
        tampa.gates[1] = 2;
        tampa.gates[11] = 12;

        clearwater.name = "KCLW";
        clearwater.rwySize = 4800;
        clearwater.fuelType = "100LL";
        clearwater.terminalCap = 20;

        if (salyvan.breakTime(6)) { // check for sleep hours
            A320.airworthy(salyvan.name, salyvan.license, salyvan.position);  // check if pilot match aircraft
        }
        if (abdurahman.breakTime(11)) { // check for sleep hours
            A320.airworthy(abdurahman.name, abdurahman.license, abdurahman.position);  // check if pilot match aircraft
            C172.airworthy(abdurahman.name, abdurahman.license, abdurahman.position);  // check if pilot match aircraft
        }




        System.out.print("Airport availability for "+ A320.name + " - ");
        tampa.isAvail(A320.runwayReq, A320.fuel, A320.capacity); //check Airport availability
        System.out.print("Airport availability for "+ C172.name + " - ");
        tampa.isAvail(C172.runwayReq, C172.fuel, C172.capacity);//check Airport availability

        clearwater.isAvail(C172.runwayReq, C172.fuel, C172.capacity);//check Airport availability
        clearwater.isAvail(AW120.runwayReq, AW120.fuel, AW120.capacity);//check Airport availability
        clearwater.isAvail(A320.runwayReq, A320.fuel, A320.capacity);//check Airport availability




        if (ivanov.direction == "Tampa") {
            ivanov.gate = tampa.gate(ivanov.direction, A320.capacity);
        }

        anderson.gate = clearwater.gate(anderson.direction, C172.capacity);
        ivanov.showDirection();
        anderson.showDirection();
        ivanov.boarding();
        anderson.boarding();
        folks[2].boarding();
        folks[1].showDirection();

    }
}
