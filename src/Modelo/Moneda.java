package Modelo;

public record Moneda(String base_code, String target_code, double conversion_rate,
                     double conversion_result) {
    @Override
    public String base_code() {
        return base_code;
    }

    @Override
    public String target_code() {
        return target_code;
    }

    @Override
    public double conversion_rate() {
        return conversion_rate;
    }

    @Override
    public double conversion_result() {
        return conversion_result;
    }
}
