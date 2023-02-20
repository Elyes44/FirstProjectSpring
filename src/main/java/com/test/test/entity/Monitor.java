package com.test.test.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Monitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer idmon;
    Long nimmon;
    String nom;
    String prenom;
    @Temporal (TemporalType.DATE)
    Date reçu;
    @OneToMany
    Set<Cours> cours;
}
