import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PhotoTechniqueService implements GenericService<PhotoTechnique> {

    public PhotoTechnique createNew() {
        Scanner s = new Scanner(System.in);
        System.out.println("DigitalCamera or SurveillanceCamera?");

        String type = s.nextLine();

        PhotoTechnique result;

        switch (type) {
            case "DigitalCamera":
            case "d":
                DigitalCamera camera = new DigitalCamera();
                result = readCamera(s, camera);
                break;

            case "SurveillanceCamera":
            case "s":
                SurveillanceCamera camera1 = new SurveillanceCamera();
                result = readCamera(s, camera1);
                break;
            default:
                throw new IllegalArgumentException("undefined type");
        }

        return result;
    }

    @Override
    public void update(PhotoTechnique photoTechnique) {
        Scanner s = new Scanner(System.in);
        System.out.println("input new brand");
        String name = s.nextLine();

        photoTechnique.setBrand(name);
        System.out.println("input new price");
        int price = Integer.parseInt(s.nextLine());
        photoTechnique.setPrice(price);

        if (photoTechnique instanceof DigitalCamera) {
            DigitalCamera digitalCamera = (DigitalCamera) photoTechnique;
            System.out.println("input new camera type");
            DigitalCameraType kind = readDigitalCameraType();
            digitalCamera.setCameraType(kind);
        } else if (photoTechnique instanceof SurveillanceCamera) {
            SurveillanceCamera surveillanceCamera = (SurveillanceCamera) photoTechnique;
            System.out.println("input new camera type");
            SurveillanceCameraType kind = readSurveillanceCameraType();
            surveillanceCamera.setCameraType(kind);
        } else {
            throw new IllegalArgumentException();
        }


    }

    private <T extends PhotoTechnique> T readCamera(Scanner s, T camera) {
        System.out.println("Input brand");
        camera.setBrand(s.nextLine());
        System.out.println("Input price");
        camera.setPrice(Integer.parseInt(s.nextLine()));
        if (camera instanceof DigitalCamera) {
            DigitalCamera digitalCamera = (DigitalCamera) camera;
            DigitalCameraType cameraType = readDigitalCameraType();
            digitalCamera.setCameraType(cameraType);
        } else if (camera instanceof SurveillanceCamera) {
            SurveillanceCamera surveillanceCamera = (SurveillanceCamera) camera;
            SurveillanceCameraType cameraType = readSurveillanceCameraType();
            surveillanceCamera.setCameraType(cameraType);
        } else throw new IllegalArgumentException();


        return camera;
    }

    private DigitalCameraType readDigitalCameraType() {
        Scanner s = new Scanner(System.in);
        DigitalCameraType[] kinds = DigitalCameraType.values();
        System.out.println("Input type, available types:");
        System.out.println(Arrays.toString(DigitalCameraType.values()));
        String typeName = s.nextLine();
        DigitalCameraType result = null;
        for (int i = 0; i < kinds.length; i++) {
            if (kinds[i].name().equalsIgnoreCase(typeName)) {
                result = kinds[i];
                break;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("undefined type");
        }

        return result;


    }

    private SurveillanceCameraType readSurveillanceCameraType() {
        Scanner s = new Scanner(System.in);
        SurveillanceCameraType[] kinds = SurveillanceCameraType.values();
        System.out.println("Input type, available types:");
        System.out.println(Arrays.toString(SurveillanceCameraType.values()));
        String SurveillanceCameraEnumTypeName = s.nextLine();
        SurveillanceCameraType result = null;
        for (int i = 0; i < kinds.length; i++) {
            if (kinds[i].name().equalsIgnoreCase(SurveillanceCameraEnumTypeName)) {
                result = kinds[i];
                break;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("undefined type");
        }

        return result;
    }
    public double averagePrice(List<PhotoTechnique> list){
        double sum=0;
        for (PhotoTechnique obj: list) {
            sum+=obj.getPrice();
        }return sum/list.size();

    }


}
