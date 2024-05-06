package tr.com.melihcetin.entities;

public class AuthorizationsEntity {
    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "AuthorizationsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
