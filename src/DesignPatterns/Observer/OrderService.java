package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

// PUBLISHER
// Making this class as a SINGLETON class, because we should not create a new OrderService for every order
public class OrderService{

    private static OrderService instance;

    private List<OrderPlacedSubscriber> orderPlacedSubscribers;

    public static OrderService getInstance() {
        if (instance == null) {
            synchronized (OrderService.class) {
                if (instance == null) {
                    instance = new OrderService();
                }
            }
        }
        return instance;
    }

    private OrderService() {
        this.orderPlacedSubscribers = new ArrayList();
    }

    public void placeOrder() {
        //order being placed -- business logic
        for (OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers) {
            orderPlacedSubscriber.orderPlaceAction();
        }
    }

    public void add(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void remove(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

}
