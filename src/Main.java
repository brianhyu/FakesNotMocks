public class Main {
    public static void main(String[] args) {
        // Use FakeExchange instead of NYSE
        Exchange exchange = new FakeExchange();
        
        // Create Cash object
        Cash dollar = new Cash(exchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        // Convert Dollar to Euro
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}
