public class Lens {

    private String model;
    private Integer focalDistanceMin;
    private Integer focalDistanceMax;

    private static Integer lensQuantity = 0;

    public Lens(String model, Integer focalDistanceMin, Integer focalDistanceMax) {
        if (focalDistanceMin < focalDistanceMax) {
            this.model = model;
            this.focalDistanceMin = focalDistanceMin;
            this.focalDistanceMax = focalDistanceMax;
            lensQuantity++;
        } else {
            throw new IllegalArgumentException("Invalid focal distance");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getFocalDistanceMin() {
        return focalDistanceMin;
    }

    public void setFocalDistanceMin(Integer focalDistanceMin) {
        this.focalDistanceMin = focalDistanceMin;
    }

    public Integer getFocalDistanceMax() {
        return focalDistanceMax;
    }

    public void setFocalDistanceMax(Integer focalDistanceMax) {
        this.focalDistanceMax = focalDistanceMax;
    }

    public static Integer getLensQuantity() {
        return lensQuantity;
    }

    public static void setLensQuantity(Integer lensQuantity) {
        Lens.lensQuantity = lensQuantity;
    }

    @Override
    public String toString() {
        return "Lens{" +
                "model='" + model + '\'' +
                ", focalDistanceMin=" + focalDistanceMin +
                ", focalDistanceMax=" + focalDistanceMax +
                '}';
    }
}
