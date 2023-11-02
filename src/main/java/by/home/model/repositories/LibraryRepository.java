package by.home.model.repositories;

import by.home.model.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
@Transactional
public interface LibraryRepository extends JpaRepository<Library, Integer> {
}
