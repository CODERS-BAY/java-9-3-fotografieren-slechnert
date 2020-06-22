
public class Main {

    public static void main(String[] args) {
        Lens stalker = new Lens("Canon", 450, 1000);
        Lens standard = new Lens("Kodak", 55, 60);
        Lens makro = new Lens("Nikon", 180, 200);

        Camera mainCam = new Camera("Canon", 9001, 2.7, true, standard);
        Camera voyeurCam = new Camera("Apple", 28, 3D, true, stalker);
        Camera closeUpCam = new Camera("Tesla", 590215, 10D, true, makro);

        Integer lensQuantity = Lens.getLensQuantity();
        Integer cameraQuantity = Camera.getCAMERA_QUANTITY();
        System.out.println("mainCam before edit: " + mainCam.toString());
        System.out.println("Amount of lenses: " + lensQuantity);
        System.out.println("Amount of cameras: " + cameraQuantity);

        mainCam.setLens(makro);


        System.out.println("mainCam after edit: " + mainCam.toString());
    }

}
