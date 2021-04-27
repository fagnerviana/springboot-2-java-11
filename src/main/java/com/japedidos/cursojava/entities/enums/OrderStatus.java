package com.japedidos.cursojava.entities.enums;

//Status dos pedidos
public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
	
		this.code =code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		//percorre em busca do codigo 
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		//retorna error caso codigo nao exista
		throw new IllegalArgumentException("Invalid OrdeStatus code");
	}

}
