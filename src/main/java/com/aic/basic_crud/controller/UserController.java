package com.aic.basic_crud.controller;

import com.aic.basic_crud.models.User;
import com.aic.basic_crud.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/create")
    @ResponseBody
    public String create(String email, String name) {
        String userId = "";
        try {
            User user = new User(email, name);
            userDao.save(user);
            userId = String.valueOf(user.getId());
        } catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User successfully created with id: " + userId;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        try {
            User user = new User(id);
            userDao.delete(user);
        } catch (Exception ex) {
            return "Error deleting the user: " + ex.toString();
        }
        return "User successfully deleted with id: " + id;
    }

    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(long id, String email, String name) {
        try {
            User user = new User(id);
            user.setEmail(email);
            user.setName(name);
            userDao.save(user);
        } catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User successfully updating with id: " + id;
    }

    @RequestMapping("/getByEmail")
    @ResponseBody
    public String getByEmail(String email) {
        String userId = "";
        try {
            User user = userDao.findByEmail(email);
            userId = String.valueOf(user.getId());
        } catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId;
    }

}
