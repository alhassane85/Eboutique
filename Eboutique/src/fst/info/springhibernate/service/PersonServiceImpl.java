package fst.info.springhibernate.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fst.info.springhibernate.dao.PersonDAO;
import fst.info.springhibernate.model.Person;


@Service
@ManagedBean(name="personService")
@SessionScoped
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;
	 
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
 
    @Override
    @Transactional
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("name", new FacesMessage("Ajout reussi de la prsonne"));
    }
 
    @Override
    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }
 
}
