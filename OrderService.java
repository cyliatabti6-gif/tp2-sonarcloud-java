public class OrderService {
    public double calculateDiscount(String type, double amount) {
        if (type.equals("VIP")) {
            if (amount > 1000) {
                return amount * 0.30;
            } else if (amount > 500) {
                return amount * 0.20;
            } else {
                return amount * 0.10;
            }
        } else if (type.equals("PREMIUM")) {
            if (amount > 1000) {
                return amount * 0.20;
            } else if (amount > 500) {
                return amount * 0.10;
            } else {
                return amount * 0.05;
            }
        } else {
            return 0;
        }
    }
}
