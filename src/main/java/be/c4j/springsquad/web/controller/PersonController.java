package be.c4j.springsquad.web.controller;

import be.c4j.springsquad.domain.Person;
import be.c4j.springsquad.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by christophe on 22.09.14.
 */
@Controller
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public String list() {
        System.out.println("list start");
        List<Person> persons = service.getAll();
        StringBuilder sb = new StringBuilder("<html><body><h1>Persons list</h1><table border='1'>");
        sb.append("<tr><th>Firstname</th><th>Lastname</th></tr>");
        for (Person person : persons) {
            sb.append("<tr><td>" + person.getFirstname() + "</td><td>" + person.getName() + "</td></tr>");
        }
        sb.append("</table></body></html>");
        return sb.toString();
    }
}
