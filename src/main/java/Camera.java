public class Camera {
    private String brand;
    private Integer megaPixels;
    private Double displaySize;
    private Boolean colored;
    private Lens lens;

    private static Integer CAMERA_QUANTITY = 0;

    public Camera(String brand, Integer megaPixels, Double displaySize, Boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        CAMERA_QUANTITY++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(Integer megaPixels) {
        this.megaPixels = megaPixels;
    }

    public Double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(Double displaySize) {
        this.displaySize = displaySize;
    }

    public Boolean getColored() {
        return colored;
    }

    public void setColored(Boolean colored) {
        this.colored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public static Integer getCAMERA_QUANTITY() {
        return CAMERA_QUANTITY;
    }

    public void setCAMERA_QUANTITY(Integer CAMERA_QUANTITY) {
        this.CAMERA_QUANTITY = CAMERA_QUANTITY;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize(inch)=" + displaySize +
                ", colored=" + colored +
                ", lens=" + lens +
                '}';
    }
}

