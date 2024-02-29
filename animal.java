public class animal {
    private int id;
    private String name;
    private String live;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public animal(int id, String name, String live) {
        this.id = id;
        this.name = name;
        this.live = live;
    }
}
