package Repositories;

import Model.UserAd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAdRepository extends JpaRepository<UserAd, Long> {
}
