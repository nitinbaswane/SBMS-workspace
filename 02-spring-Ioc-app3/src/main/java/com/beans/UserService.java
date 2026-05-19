package com.beans;

public class UserService {
    private IEmailService emailService;
    private IpwdService pwdService;
    UserService(IpwdService pwd,IEmailService email){
        this.emailService=email;
        this.pwdService=pwd;
    }

    public void register(String e,String p){
        String email = emailService.email(e);
        String i = pwdService.pwd(p);
        System.out.println("User registered with : "+email+ "  "+i+" successfully.... ^_~ ...");

    }


}
