package hello.core.order;

public interface OrderSerive {
    Order createOrder(Long membId, String itemName, int itemPrice);


}
