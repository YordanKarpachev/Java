package A05;

public class Robot implements Identifiable{

    private String id;
    private String model;

    @Override
    public String getId() {
        return this.id;
    }

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
