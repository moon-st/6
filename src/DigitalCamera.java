public class DigitalCamera extends PhotoTechnique{
    private DigitalCameraType type;

    public DigitalCamera() {
}

    public DigitalCamera(String brand, int price, DigitalCameraType type) {
        super(brand, price);
        this.type = type;
    }

    public DigitalCameraType getType() {
        return type;
    }

    public void setCameraType(DigitalCameraType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DigitalCamera{"+super.toString()+", "+
                "type=" + type+"}";
    }
}
