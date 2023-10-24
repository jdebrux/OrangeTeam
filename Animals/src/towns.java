package Animals.src;

public class towns {
    public String name;
    public String county;

    public towns(String name, String county) {
        this.name = name;
        this.county = county;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "Name=" + name + ", County=" + county + '}';
    }
}
