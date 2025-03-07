public class Constructor {
    private String name;
    private int amount;
    private String status;
    public Constructor(String name, int amount, String status){
        this.name = name;
        this.amount = amount;
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public int getAmount() {
        return amount;
    }
    public String getStatus() {
        return status;
    }
}
