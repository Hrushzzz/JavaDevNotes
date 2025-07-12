package DesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = OrderService.getInstance();
        CustomerNotificationService notificationService = new CustomerNotificationService();
        InvoiceGenerationService invoiceService = new InvoiceGenerationService();

        orderService.add(notificationService);
        orderService.add(invoiceService);

        orderService.placeOrder();
    }
}

/*
    Youtube -> create channels -> upload Videos
    -- validate the video
    -- figure out the language and captions creation
    -- encode video in different formats
    -- update feed for youtube

    Solve this with observer design pattern
 */
