package com.example.shop.dto;

import com.example.shop.constant.OrderStatus;
import com.example.shop.entity.Orders;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderHistDTO {
    private long orderId;

    private String orderDate;//주문날짜

    private OrderStatus orderStatus;//주문상태
    //상품리스트
    private List<OrderItemDTO> orderItemDTOList=new ArrayList<>();

    public void addOrderItemDTO(OrderItemDTO orderItemDTO) {
        orderItemDTOList.add(orderItemDTO);
    }
    public OrderHistDTO(Orders orders) {
        this.orderId = orders.getId();
        this.orderDate = orders.getRegTime()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        this.orderStatus = orders.getOrderStatus();

        //기존처럼 생성하고 나서 modelMapper로 대체해도 가능하다.

    }
    public void addOrderDTO(OrderItemDTO orderItemDTO) {
        orderItemDTOList.add(orderItemDTO);
    }

}

