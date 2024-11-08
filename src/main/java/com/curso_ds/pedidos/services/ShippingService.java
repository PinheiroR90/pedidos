package com.curso_ds.pedidos.services;

import com.curso_ds.pedidos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order){
        Double val = order.getBaseVal();
        Double shipping = 0.0;

        if(val < 100){
           return shipping = 20.0;
        }else if(val < 200){
            return shipping = 12.0;
        }else {
            return shipping;
        }
    }
}
