package com.example.shop.dto;

import com.example.shop.entity.ImgEntity;
import com.example.shop.entity.OrderItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderItemDTO {
    private String itemNm;

    private int count;//주문수량

    private int oderPrice;//주문금액

    private String imgUrl;//상품이미지 경로

    public OrderItemDTO(OrderItem orderItem, String imgUrl) {
        this.itemNm = orderItem.getItem().getItemNm();
        this.count =  orderItem.getCount();
        this.oderPrice = orderItem.getOrderPrice();
        List<ImgEntity>a = orderItem.getItem().getImgEntityList();

        this.imgUrl = imgurl;
    }
}
