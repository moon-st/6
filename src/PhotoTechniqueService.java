import java.util.Arrays;
import java.util.Scanner;
public class PhotoTechniqueService {

        public PhotoTechnique createNewPhotoTechnique() {
            Scanner s = new Scanner(System.in);
            System.out.println("DigitalCamera or SurveillanceCamera?");

            String type = s.nextLine();

            PhotoTechnique result;

            switch (type) {
                case "DigitalCamera":
                case "digital":
                result = readDigitalCamera(s);
                    break;

                case "SurveillanceCamera":
                case "surveillance":
                result = readSurveillanceCamera(s);
                    break;
                default:
                    throw new IllegalArgumentException("undefined type");
            }

            return result;
        }

        private DigitalCamera readDigitalCamera(Scanner s) {
            DigitalCamera  digitalCamera = new DigitalCamera();
            System.out.println("Input brand");
            digitalCamera.setBrand(s.nextLine());

            System.out.println("Input price");
            digitalCamera.setPrice(Integer.parseInt(s.nextLine()));
            DigitalCameraType digitalCameraType = readDigitalCameraType();
            digitalCamera.setDigitalCameraType(digitalCameraType);

            return digitalCamera;
        }

        private SurveillanceCamera readSurveillanceCamera(Scanner s) {
            return new SurveillanceCamera("Nikon", 300, SurveillanceCameraType.BABY_MONITOR);
        }

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

                digitalCamera.setDigitalCameraType(kind);
            } else if (photoTechnique instanceof SurveillanceCamera) {
                SurveillanceCamera surveillanceCamera = (SurveillanceCamera)photoTechnique ;
                //
            } else {
                throw new IllegalArgumentException();
            }


        }

        private DigitalCameraType readDigitalCameraType() {
            Scanner s = new Scanner(System.in);
           DigitalCameraType[] kinds = DigitalCameraType.values();

            System.out.println("Input type, available types:");
            System.out.println(Arrays.toString(DigitalCameraType.values()));
//            for (int i = 0; i < kinds.length; i++) {
//                System.out.println(kinds[i].name());
//            }

            String DigitalCameraEnumTypeName = s.nextLine();
            DigitalCameraType result = null;
            for (int i = 0; i < kinds.length; i++) {
                if (kinds[i].name().equalsIgnoreCase(DigitalCameraEnumTypeName)) {
                    result = kinds[i];
                    break;
                }
            }
            if (result == null) {
                throw new IllegalArgumentException("undefined type");
            }

            return result;


}}
