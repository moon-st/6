import java.io.Serializable;

public class SurveillanceCamera extends PhotoTechnique  {
   private SurveillanceCameraType type;

    public SurveillanceCamera() {
}

    public SurveillanceCamera(String brand, int price, SurveillanceCameraType type) {
        super(brand, price);
        this.type = type;
    }

    public SurveillanceCameraType getType() {
        return type;
    }

    public void setCameraType(SurveillanceCameraType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SurveillanceCamera{"+ super.toString()+
                "type=" + type+
                '}';
    }
}
