package uy.edu.ort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uy.edu.ort.model.User;
import uy.edu.ort.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/lista", method = RequestMethod.GET)
    public String lista(User user, BindingResult result, Model model) {
        List<User> users = userService.listUsers();
        model.addAttribute("users", users);

        return "user/list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String userForm(Model model) {
        User user = new User();
        model.addAttribute(user);

        return "user/form";
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public String agregar(User user, BindingResult result) {
        if (!user.getCode().equals("")) {
            this.userService.addUser(user);
            return "user/view";
        } else {
            result.reject("", "El code no puede ser vacio");
            return "user/form";
        }
    }

}
