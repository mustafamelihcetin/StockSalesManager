package tr.com.melihcetin.types;

public class AccountEntity {
    private int id;
    private int authorityId;
    private int employeeId;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "id=" + id +
                ", authorityId=" + authorityId +
                ", employeeId=" + employeeId +
                ", password='" + password + '\'' +
                '}';
    }
}
