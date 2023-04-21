package groupWork;

import lombok.Setter;
public class Mikrobange implements IrenginysSildytiMaista{
    @Setter
    private String brand;
    @Override

    public void sildytiMaista() {
        System.out.println("Rytoj sildau maista mikrobangeje " + this.brand + "!");

    }
}
