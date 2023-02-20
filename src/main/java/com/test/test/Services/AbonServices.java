package com.test.test.Services;

import com.test.test.Interfaces.IAbonn;
import com.test.test.Repositories.AbonRepo;
import com.test.test.entity.Abonnement;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class AbonServices implements IAbonn {
    private final AbonRepo abonRepo;
    public AbonServices(AbonRepo abonRepo) {
        this.abonRepo = abonRepo;
    }
    @Override
    public List<Abonnement> getAllAbonnements() {
        return abonRepo.findAll();
    }

    @Override
    public Abonnement createAbonnement(Abonnement Abonnement) {
        return abonRepo.save(Abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Integer id, Abonnement Abonnement) throws ParseException {
        Abonnement abonnement = abonRepo.findById(id).orElse(null);
        if(abonnement!=null){
            return abonRepo.save(Abonnement);
        }
        else
            return null;

    }

    @Override
    public void deleteAbonnement(Integer id) {
        Abonnement abonnement = abonRepo.findById(id).orElse(null);
        abonRepo.delete(abonnement);
    }

    @Override
    public Abonnement getAbonnementById(Integer id) {
        return abonRepo.findById(id).orElse(null);
    }
}
