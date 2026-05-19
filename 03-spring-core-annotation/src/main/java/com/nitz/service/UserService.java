package com.nitz.service;

import com.nitz.dao.UserDao;
import com.nitz.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private SecurityService securityService;

   public String getName(int id){
       return userDao.getNameByID(id);
   }
   public void securityPro(){securityService.securityProvider();}
}
