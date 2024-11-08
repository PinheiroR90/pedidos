package com.curso_ds.pedidos;

import com.curso_ds.pedidos.entities.Order;
import com.curso_ds.pedidos.services.OrderService;
import com.curso_ds.pedidos.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class PedidosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(PedidosApplication.class, args);
	}

	@Autowired
	private OrderService orderService;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Codigo:");
		Integer code = sc.nextInt();
		System.out.println("Valor Base:");
		Double val = sc.nextDouble();
		System.out.println("desconto:");
		Double desconto = sc.nextDouble();

		Order order = new Order(code,val,desconto);
		Double result = orderService.total(order);

		System.out.printf("Pedido código %d%nValor total: R$ %.2f",code,result);

		sc.close();
	}
}
