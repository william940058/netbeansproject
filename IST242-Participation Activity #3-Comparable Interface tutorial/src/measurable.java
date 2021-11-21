
public interface measurable {
    int SHIPPINGCOST_PER_PACKAGE = 20;
    int getTrackingNum();
    int calculateCost();
    String getAddress();
}
