package tr.com.melihcetin.types;

import java.sql.Date;

public class StockEntity {
    private int id;
    private int employeeId;
    private int productId;
    private Date date;
    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "StockEntity{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", productId=" + productId +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
