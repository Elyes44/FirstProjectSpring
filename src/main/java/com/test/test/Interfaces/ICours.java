package com.test.test.Interfaces;

import com.test.test.entity.Cours;

import java.util.List;

public interface ICours {

    List<Cours> getAllCours();

    Cours createCours(Cours Cours);

    Cours updateCours(long id, Cours Cours);

    void deleteCours(long id);

    Cours getCoursById(long id);
}
