package com.secao23.projetoSecao23.entities;

import org.hibernate.boot.model.naming.IllegalIdentifierException;

public enum OrderStatus {

    //se não atribuir valor eles recebem 0... na ordem, o problema é que se algum outros for adicionado no meio
    //os valores já introduzidos no banco ficarão desatualizados

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code){
        for (OrderStatus value : OrderStatus.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Orderstatus code");
    }
}
