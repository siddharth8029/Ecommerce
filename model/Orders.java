package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(unique=true)
    private String orderId;
    private String customerName;
    private String email;
    private String status;
    private LocalDateTime orderDate;

    @OneToMany(mappedBy ="order",cascade = CascadeType.ALL )
    private List<OrderItem> orderItems;

}
