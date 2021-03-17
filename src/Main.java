import Units.Factory;
import Units.UnitFactory;
import Units.UnitType;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();
        ArrayList army = new ArrayList();

        for(int i=0; i<10; i++) {
            army.add(factory.createUnit(UnitType.TANK));
        }

        System.out.println(army);
    }
}
