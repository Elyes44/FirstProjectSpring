package com.test.test.Interfaces;

import com.test.test.entity.Abonnement;
import org.jboss.jandex.Index;

import java.text.ParseException;
import java.util.List;

public interface IAbonn {

    List<Abonnement> getAllAbonnements();

    Abonnement createAbonnement(Abonnement Abonnement);

    Abonnement updateAbonnement(Integer id, Abonnement Abonnement) throws ParseException;

    void deleteAbonnement(Integer id);

    Abonnement getAbonnementById(Integer id);
}
