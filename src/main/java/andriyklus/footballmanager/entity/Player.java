package andriyklus.footballmanager.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Player name is required")
    private String name;

    @Min(value = 18, message = "Player must be at least 18 years old")
    @Max(value = 40, message = "Player must be at most 40 years old")
    private int age;

    @Min(value = 0, message = "Experience in months must be greater than or equal to 0")
    private int experienceMonths;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    public Player(String name, int age, int experienceMonths, Team team) {
        this.name = name;
        this.age = age;
        this.experienceMonths = experienceMonths;
        this.team = team;
    }
}