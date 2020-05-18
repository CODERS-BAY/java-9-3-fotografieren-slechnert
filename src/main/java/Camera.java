public class Camera {
    private String brand;
    private Integer megaPixels;
    private Double displaySize;
    private Boolean colored;
    private Lens lens;

    private static Integer cameraQuantity = 0;

    public Camera(String brand, Integer megaPixels, Double displaySize, Boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        cameraQuantity++;
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

    public static Integer getCameraQuantity() {
        return cameraQuantity;
    }

    public void setCameraQuantity(Integer cameraQuantity) {
        this.cameraQuantity = cameraQuantity;
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

