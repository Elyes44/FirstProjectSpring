package com.test.test.Interfaces;

import com.test.test.entity.Inscrit;

import java.util.List;

public interface IInscrit {
    List<Inscrit> getAllInscrit();

    Inscrit createInscrit(Inscrit Inscrit);

    Inscrit updateInscrit(long id, Inscrit Inscrit);

    void deleteInscrit(long id);

    Inscrit getInscritById(long id);
}
