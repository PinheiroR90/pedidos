package com.curso_ds.pedidos.services;

import com.curso_ds.pedidos.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        Double discont = order.getBaseVal() * (order.getDiscount()/100);
        return (order.getBaseVal() - discont) + shippingService.shipment(order);
    }
}
