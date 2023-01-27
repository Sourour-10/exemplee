package tn.esprit.rh.achat.IServices;


import tn.esprit.rh.achat.entity.User;

public interface IUserService {
    public void addUser(User user);
    public User findUserByUserNameAndPassword(String userName, String password);
}
