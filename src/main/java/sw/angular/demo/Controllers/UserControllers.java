package sw.angular.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sw.angular.demo.Entity.User;
import sw.angular.demo.Repository.UserReprository;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class UserControllers {
    @Autowired
    private UserReprository  userReprository;

    @GetMapping("/AllUsers")
    public List<User> getUsers(){
        return (List<User>) userReprository.findAll();
    }
    @GetMapping("/login/{name}/{pass}")
    public User login(@PathVariable String name,@PathVariable String pass)
    {
        User user=new User();
        user.setUser_name(name);
        user.setPassword(pass);
boolean check=false;
        if (userReprository.existsById(user.getUser_name())) {
            User user1=new User();
            Optional<User> optionalUser = userReprository.findById(user.getUser_name());
            if (optionalUser.isPresent()) {
                 user1 = optionalUser.get();
                if (user1.getPassword().equals(user.getPassword())){
                  check=true  ;
                }
            }
          if (check){
              return user1;
          }
          else return null;
        }
        else
            return null;
    }

    @PostMapping("/Register/{user_name}/{password}/{email}/{Bank_account}/{Address}/{type}")
    public boolean regist(@PathVariable String user_name,@PathVariable  String password,@PathVariable String email,@PathVariable  String Bank_account,@PathVariable  String Address,@PathVariable String type)
    {
        System.out.println(password+" "+email);
        User user=new User( user_name, password,  email,  Bank_account,   Address,   type);
        if (user.getEmail().equals("") || user.getPassword().equals("") || user.getUser_name().equals("")) {
            return false;
        }

        else if (userReprository.existsById(user.getUser_name())) {
            return false;
        }
        else {
            userReprository.save(user);
            return true;
        }
   }

}
