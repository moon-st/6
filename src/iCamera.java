/**
 * Created by Fbiu-026-St on 22.08.16.
 */
public interface iCamera extends iPhototechnique{
   void setType(KindOfCam type);
    KindOfCam getType();
    void SetZoom(int z);
    int GetZoom();
}
