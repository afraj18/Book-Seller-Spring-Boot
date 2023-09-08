package com.AJ.Springbootbookseller.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchase_history")
public class PurchaseHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id",nullable = false)
    private long userid;

    @Column(name = "book_id",nullable = false)
    private long bookid;

    @Column(name = "price",nullable = false)
    private Double price;
    @Column(name = "purchase_time",nullable = false)
    private LocalDateTime purchaseTime;
}
