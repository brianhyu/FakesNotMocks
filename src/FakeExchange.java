public class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        // Hardcoded exchange rates for testing
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.90f;
        }
        return 1.0f;
    }
}
