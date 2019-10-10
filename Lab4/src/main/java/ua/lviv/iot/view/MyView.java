package ua.lviv.iot.view;

import ua.lviv.iot.model.Order;

import java.math.BigDecimal;
import java.sql.Date;

public class MyView {

    public void show() {
        Order myOrder = new Order();
        final long MILLISECONDS_IN_DAY = 1000 * 60 * 60 * 24;
        try {
            myOrder.create(5, 2, 5, 2, null,
                    null, 5, 2, new BigDecimal(30), null, 2,
                    new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + MILLISECONDS_IN_DAY),
                    null);
            myOrder.findAll();
            myOrder.findById(7);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
