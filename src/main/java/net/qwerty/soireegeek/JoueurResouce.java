package net.qwerty.soireegeek;

import net.qwerty.soireegeek.model.Joueur;
import net.qwerty.soireegeek.service.JoueurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("joueur")
public class JoueurResouce {
    private final JoueurService joueurService;

    public JoueurResouce(JoueurService joueurService) {
        this.joueurService = joueurService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Joueur>> getAllJoueurs(){
        List<Joueur> joueurs = joueurService.findAllJoueurs();
        return new ResponseEntity<>(joueurs, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Joueur> getJoueurById(@PathVariable("id")Long id){
        Joueur joueur = joueurService.findJoueurById(id);
        return new ResponseEntity<>(joueur, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Joueur> addJoueur(@RequestBody Joueur joueur){
        Joueur newJoueur = joueurService.addJoueur(joueur);
        return new ResponseEntity<>(newJoueur, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Joueur> updateJoueur(@RequestBody Joueur joueur){
        Joueur updateJoueur = joueurService.updateJoueur(joueur);
        return new ResponseEntity<>(updateJoueur, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteJoueur(@PathVariable("id")Long id){
        joueurService.deleteJoueur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
