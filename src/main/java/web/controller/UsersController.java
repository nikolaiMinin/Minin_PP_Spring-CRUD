package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class UsersController {

//    private CarDao carDao;

//    @Autowired
//    public UsersController(CarDao carDao) {
//        this.carDao = carDao;
//    }
//
    @GetMapping(value = "/")
    public String printView(ModelMap model) {
        return "users";
    }
}
