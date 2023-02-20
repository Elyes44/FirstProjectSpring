package com.test.test.Interfaces;

import com.test.test.entity.Skieur;

import java.util.List;

public interface ISkieur {

    List<Skieur> getAllSkieur();

    Skieur createSkieur(Skieur Skieur);

    Skieur updateSkieur(long id, Skieur Skieur);

    void deleteSkieur(long id);

    Skieur getSkieurById(long id);
}
