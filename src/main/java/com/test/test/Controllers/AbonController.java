package com.test.test.Controllers;

import com.test.test.Interfaces.IAbonn;
import com.test.test.entity.Abonnement;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@Api (tags ="Gestion Abonnement")
@RequestMapping("/API/Abonnement/")
public class AbonController {
    @Autowired
    private  IAbonn iAbonn;
    public AbonController(IAbonn iAbonn) {
        this.iAbonn = iAbonn;
    }
@PostMapping("/Post")
@ApiOperation(value="Adding new abbonnement")
    public Abonnement createAbonnement(@RequestBody Abonnement Abonnement){
        return iAbonn.createAbonnement(Abonnement);
}
@ApiOperation(value="Updating an abbonnement")
@PutMapping("/Put/{id}")
    public Abonnement updateAbonnement(@PathVariable Integer id, @RequestBody Abonnement Abonnement){
    try {
        return iAbonn.updateAbonnement(id ,Abonnement);
    } catch (ParseException e) {
        throw new RuntimeException(e);
    }
}
    @ApiOperation(value="removing an abbonnement")
    @DeleteMapping ("/Delete/{id}")
    public void deleteAbonnement(@PathVariable Integer id) {
        iAbonn.deleteAbonnement(id);
    }
    @ApiOperation(value="Display of abbonnements")
    @GetMapping("/Get")
    public List<Abonnement> getAllAbonnements(){
        return iAbonn.getAllAbonnements();
    }

}
