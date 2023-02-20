package com.test.test.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     Integer idPiste;

     Long numpiste;
     String nompiste;
    @Enumerated(EnumType.STRING)
     color color;
     Integer longeur;
     Integer pente;
    @ManyToMany
    Set<Skieur> Skieurs;

}
