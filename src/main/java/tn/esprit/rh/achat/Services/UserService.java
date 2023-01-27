package tn.esprit.rh.achat.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.rh.achat.IServices.IUserService;
import tn.esprit.rh.achat.Repositories.UserRepo;
import tn.esprit.rh.achat.entity.User;
@Service
public class UserService implements IUserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public void addUser(User user) {
    userRepo.save(user);
    }

    @Override
    public User findUserByUserNameAndPassword(String userName, String password) {
        User user=userRepo.findByUserNameAndPassword(userName,password);



        return user;
    }


}
