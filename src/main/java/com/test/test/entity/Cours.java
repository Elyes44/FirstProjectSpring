package com.test.test.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer idcours;
    Long numcours;
    int niveau;
    int crrineau;
    float prix ;
    @Enumerated(EnumType.STRING)
    support support;
    @Enumerated(EnumType.STRING)
    Typecours Typecours;
    @OneToMany(mappedBy = "cours")
    Set<Inscrit> Inscrits;


}
