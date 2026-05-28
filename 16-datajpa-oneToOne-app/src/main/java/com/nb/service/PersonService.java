package com.nb.service;

import com.nb.entity.Passport;
import com.nb.entity.Person;
import com.nb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void savepersonData(){
        Passport passport=new Passport();
        passport.setPassportNum("MHLTR1010");
        passport.setIssuedDate(LocalDate.now());
        passport.setExpDate(LocalDate.now().plusYears(10));

        Person person=new Person();
        person.setPersonName("Vishal");
        person.setDob(LocalDate.now());

        passport.setPerson(person);
        person.setPassport(passport);
        personRepository.save(person);
    }
}
