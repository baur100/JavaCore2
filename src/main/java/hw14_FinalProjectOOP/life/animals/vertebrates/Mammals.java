package hw14_FinalProjectOOP.life.animals.vertebrates;

import hw14_FinalProjectOOP.Life;
import hw14_FinalProjectOOP.life.Animals;
import hw14_FinalProjectOOP.life.animals.Vertebrates;

public interface Mammals extends Vertebrates, Animals, Life {
    public void mammaryGlands();
}
