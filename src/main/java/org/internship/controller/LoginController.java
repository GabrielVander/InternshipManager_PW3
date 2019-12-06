package org.internship.controller;

import org.internship.DAO.AdministratorDAO;
import org.internship.DAO.CompanyDAO;
import org.internship.DAO.StudentDAO;
import org.internship.DAO.SupervisorDAO;
import org.internship.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
  @PostMapping("/login")
  public RedirectView login(User user, @RequestParam String type, HttpSession session){
    switch (type){
      case "supervisor":
        if(new SupervisorDAO().checkUser(user) != null){
          session.setAttribute("user", type);
          return new RedirectView("./");
        }
      case "student":
        if(new StudentDAO().checkUser(user) != null){
          session.setAttribute("user", type);
          return new RedirectView("./");
        }
      case "company":
        if(new CompanyDAO().checkUser(user) != null){
          session.setAttribute("user", type);
          return new RedirectView("./");
        }
      case "administrator":
        if(new AdministratorDAO().checkUser(user) != null){
          session.setAttribute("user", type);
          return new RedirectView("./");
        }
    }
    session.setAttribute("user", null);
    return new RedirectView("./login");
  }

}
