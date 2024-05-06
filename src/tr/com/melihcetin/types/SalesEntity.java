package tr.com.melihcetin.types;

import java.sql.Date;

public class SalesEntity {
    private int id;
    private int customerId;
    private int employeeId;
    private int productId;
    private int amount;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SalesEntity{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", employeeId=" + employeeId +
                ", productId=" + productId +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
