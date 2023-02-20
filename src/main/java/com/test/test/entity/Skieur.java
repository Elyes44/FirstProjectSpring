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
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer idski;

    Long numski;
    String nomski;
    String prenomski;
    String ville;
    @Temporal (TemporalType.DATE)
    Date naissance;
    @ManyToMany(mappedBy = "Skieurs")
    Set<Piste> Pistes;
@OneToMany(mappedBy = "Skieur")
    Set<Inscrit> Inscrits;
@OneToOne(cascade = CascadeType.ALL)
Abonnement abo; //abonnement
}
