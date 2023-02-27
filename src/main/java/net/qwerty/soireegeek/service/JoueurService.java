package net.qwerty.soireegeek.service;

import net.qwerty.soireegeek.exception.UserNotFoundException;
import net.qwerty.soireegeek.model.Joueur;
import net.qwerty.soireegeek.repo.JoueurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class JoueurService {
    private final JoueurRepo joueurRepo;

    @Autowired
    public JoueurService(JoueurRepo joueurRepo) {
        this.joueurRepo = joueurRepo;
    }
    public Joueur addJoueur(Joueur joueur){
        joueur.setJoueurCode((UUID.randomUUID().toString()));
        return joueurRepo.save(joueur);
    }
    public List<Joueur> findAllJoueurs(){
        return joueurRepo.findAll();
    }
    public Joueur findJoueurById(Long id){
        return joueurRepo.findJoueurById(id).orElseThrow(() -> new UserNotFoundException("User by Id" + id + "was not found"));
    }
    public Joueur updateJoueur(Joueur joueur){
        return joueurRepo.save(joueur);
    }
    public void deleteJoueur(Long id){
        joueurRepo.deleteJoueurById(id);
    }

}
