package com.test.test.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Inscrit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer idinscrit;
    Long numinscrit;
    int numsemaine;
    @ManyToOne
    Cours cours;
    @ManyToOne
    Skieur Skieur;



}
