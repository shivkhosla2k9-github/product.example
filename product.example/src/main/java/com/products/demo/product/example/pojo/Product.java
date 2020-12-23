package com.products.demo.product.example.pojo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {

    @Id
    private int p_id;
    private String p_name;
    private String p_description;
    private int price;
}
