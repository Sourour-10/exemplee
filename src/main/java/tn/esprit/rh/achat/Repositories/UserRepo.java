package tn.esprit.rh.achat.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.rh.achat.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    public User findByUserNameAndPassword(String userName,String password);
}
