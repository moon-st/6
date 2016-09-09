/**
 * Created by Admin on 08.09.2016.
 */
public class SurveillanceCamera extends PhotoTechnique {
   private SurveillanceCameraType type;

    public SurveillanceCamera() {
        super();
        type = type.UNDEFINED;
    }

    public SurveillanceCamera(String brand, int price, SurveillanceCameraType type) {
        super(brand, price);
        this.type = type;
    }

    public SurveillanceCameraType getType() {
        return type;
    }

    public void setType(SurveillanceCameraType type) {
        this.type = type;
    }
}
