package tn.esprit.rh.achat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rh.achat.IServices.IUserService;
import tn.esprit.rh.achat.entity.User;


@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    IUserService userService;
    @PostMapping("/Register")
    @ResponseBody
    public void Register (@RequestBody User user){
        userService.addUser(user);

    }
    @PostMapping("/Login")
    @ResponseBody
    public User Login (@RequestBody String userName, String password){
        User user= userService.findUserByUserNameAndPassword(userName,password);
        return  user;
    }
}
