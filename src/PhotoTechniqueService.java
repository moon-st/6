import java.util.Scanner;
public class PhotoTechniqueService {

        public PhotoTechnique createNewPhotoTechnique() {
            Scanner s = new Scanner(System.in);
            System.out.println("cat or dog?");

            String type = s.nextLine();

            PhotoTechnique result;

            switch (type) {
                case "DigitalCamera":
                result = DigitalCamera(s);
                    break;

                case "SurveillanceCamera":
                result = readSurveillanceCamera(s);
                    break;
                default:
                    throw new IllegalArgumentException("undefined photoTechnique type");
            }

            return result;
        }

        private DigitalCamera DigitalCamera(Scanner s) {
            DigitalCamera cat  = new DigitalCamera();
            System.out.println("Input cat name");
            cat.setBrand(s.nextLine());

            System.out.println("Input cat type");
            DigitalCameraType digitalCameraType = readDigitalCameraType();
            cat.setDigitalCameraType(digitalCameraType);

            return cat;
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
                System.out.println("input new cat type");
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

            System.out.println("Input cat type, available types:");
            for (int i = 0; i < kinds.length; i++) {
                System.out.println(kinds[i].name());
            }

            String catEnumTypeName = s.nextLine();
            DigitalCameraType result = null;
            for (int i = 0; i < kinds.length; i++) {
                if (kinds[i].name().equalsIgnoreCase(catEnumTypeName)) {
                    result = kinds[i];
                    break;
                }
            }
            if (result == null) {
                throw new IllegalArgumentException("undefined cat type");
            }

            return result;


}}
