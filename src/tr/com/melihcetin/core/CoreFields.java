package tr.com.melihcetin.core;

public class CoreFields {
    private String userName = "root";
    private String password = "%password%";
    private String url = "jdbc:mysql://localhost/StockSalesManager?useUnicode=true&characterEncoding=UTF-8";


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }


}
