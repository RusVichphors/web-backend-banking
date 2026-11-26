
package com.example.banking.entity;

import lombok.*;
import java.math.BigDecimal;
import jakarta.persistence.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String accountName;
    private BigDecimal balance;

}
