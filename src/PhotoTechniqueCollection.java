import java.util.Arrays;

public class PhotoTechniqueCollection {
    private PhotoTechnique[] photoTechniques;
    private int count;
    private PhotoTechniqueService service;

    public PhotoTechniqueCollection (int size){
        photoTechniques = new PhotoTechnique[size];
        service = new PhotoTechniqueService();
    }
    public void add() {
        PhotoTechnique photoTechnique = service.createNewPhotoTechnique();
        add(photoTechnique);
    }
    public void add(PhotoTechnique photoTechnique) {
        if (count == photoTechniques.length) {
            int newSize = (int) (photoTechniques.length * 1.5);
            photoTechniques = Arrays.copyOf(photoTechniques, newSize);
        }
        photoTechniques[count] = photoTechnique;
        count++;
    }

    public void update(int index) {
        PhotoTechnique photoTechnique = photoTechniques[index];
        if (photoTechnique == null) {
            throw new
                    IllegalArgumentException("there is no such cameras!");
        }
        service.update(photoTechnique);

    }

    public void delete(int index) {
        if (index < 0 || index >= count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == count - 1) {
            photoTechniques[index] = null;
        } else {
            for(int i = index; i < count-1; i++) {
                photoTechniques[i] = photoTechniques[i+1];
            }
            photoTechniques[count - 1] = null;
        }
        count--;
    }

    public void printAll() {
        System.out.println(Arrays.toString(photoTechniques));
    }


}
