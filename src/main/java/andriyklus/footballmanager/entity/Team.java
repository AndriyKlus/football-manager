package andriyklus.footballmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Team name is required")
    private String name;

    @NotNull(message = "Balance cannot be null")
    @DecimalMin(value = "0.0", message = "Balance must be greater than or equal to 0")
    private Double balance;

    @NotNull(message = "Commission rate cannot be null")
    @DecimalMin(value = "0.0", message = "Commission rate must be greater than or equal to 0")
    @DecimalMax(value = "10.0", message = "Commission rate must not exceed 10")
    private Double commissionRate;

    public Team(String name, double balance, double commissionRate) {
        this.name = name;
        this.balance = balance;
        this.commissionRate = commissionRate;
    }
}