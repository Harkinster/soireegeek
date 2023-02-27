package net.qwerty.soireegeek.repo;

import net.qwerty.soireegeek.model.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JoueurRepo extends JpaRepository<Joueur, Long> {
    void deleteJoueurById(Long id);

    Optional<Joueur> findJoueurById(Long id);
}
