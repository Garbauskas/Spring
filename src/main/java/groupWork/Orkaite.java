package groupWork;

import lombok.Setter;
public class Orkaite implements IrenginysSildytiMaista{
    @Setter
    private String brand;

    @Override
    public void sildytiMaista() {
        System.out.println("Siandien kepu maista orkaiteje " + this.brand + "!");
    }
}
