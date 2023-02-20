package com.test.test.Interfaces;

import com.test.test.entity.Piste;

import java.util.List;

public interface IPiste {

    List<Piste> getAllPistes();

    Piste createPiste(Piste Piste);

    Piste updatePiste(long id, Piste Piste);

    void deletePiste(long id);

    Piste getPisteById(long id);
}
