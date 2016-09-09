/**
 * Created by Admin on 08.09.2016.
 */
public class DigitalCamera extends PhotoTechnique{
    private DigitalCameraType type;

    public DigitalCamera() {
        super();
        type = type.UNDEFINED;
    }

    public DigitalCamera(String brand, int price, DigitalCameraType type) {
        super(brand, price);
        this.type = type;
    }



    public DigitalCameraType getType() {
        return type;
    }

    public void setType(DigitalCameraType type) {
        this.type = type;
    }
}
