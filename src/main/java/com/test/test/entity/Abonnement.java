package com.test.test.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer idabo;

    Long numabo;
    @Temporal (TemporalType.DATE)

    Date debut;
    @Temporal (TemporalType.DATE)
    Date fin;
    float prix;

    @Enumerated(EnumType.STRING)
    Type type;
}
