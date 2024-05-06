package tr.com.melihcetin.types;

public class EmployeeEntity {
    private int id;
    private String nameSurname;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", nameSurname='" + nameSurname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
