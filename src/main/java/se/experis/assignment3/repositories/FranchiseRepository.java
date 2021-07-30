package se.experis.assignment3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.experis.assignment3.models.Franchise;

@Repository
public interface FranchiseRepository extends JpaRepository<Franchise,Long> {
}