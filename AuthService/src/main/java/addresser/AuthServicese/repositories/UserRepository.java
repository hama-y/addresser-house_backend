package addresser.AuthServicese.repositories;

import addresser.AuthServicese.entity.UserTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserRepository extends JpaRepository<UserTableEntity, Integer> {
}