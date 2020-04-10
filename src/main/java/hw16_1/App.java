package hw16_1;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Country usa = new Country("USA");
        Code one = new Code(1);

        Country can = new Country("Canada");
        Code one1 = new Code(1);

        Country rus = new Country("Russia");
        Code seven = new Code(7);

        Country mex = new Country("Mexico");
        Code ft = new Code(52);

        Country pln = new Country("Poland");
        Code fe = new Code(48);

        Map<Country, Code> countryCode = new HashMap<>();
        countryCode.put(usa,one);
        countryCode.put(can, one1);
        countryCode.put(mex,ft);
        countryCode.put(rus, seven);
        countryCode.forEach((x,y)-> System.out.println(x.printCountry()+" +"+y.printCode()));
        System.out.println("##################");

        System.out.println(countryCode.size());
        System.out.println("##################");

        for (Map.Entry<Country, Code> cc:countryCode.entrySet()){
            System.out.print(cc.getKey().printCountry()+" +");
            System.out.println(cc.getValue().printCode());
        }
        countryCode.replace(usa,fe);
        System.out.println("##################");

        countryCode.remove(can);
        countryCode.forEach((x,y)-> System.out.println(x.printCountry()+"+ "+y.printCode()));
        System.out.println("##################");

        System.out.println(countryCode.get(rus).printCode());

        for(Country country:countryCode.keySet()){
            System.out.println(country.printCountry());
        }

        for(Code code: countryCode.values()){
            System.out.println(code.printCode());
        }





    }
}
