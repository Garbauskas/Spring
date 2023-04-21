package Spring0416;

import Spring0416.RaceCar;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Racer {

    private RaceCar raceCar;

    public void useCar(){
        raceCar.drive();
    }


}

