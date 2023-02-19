//package addresser.AuthServicese.controller;
//
//import addresser.AuthServicese.service.GenerateAccessToken;
//import addresser.AuthServicese.model.UserInfo;
//import addresser.AuthServicese.model.UserInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import static addresser.AuthServicese.support.SecurityConstants.SIGNUP_URL;
//
//@CrossOrigin
//@Controller
//@RequestMapping
//public class Login {
//    @Autowired
//    GenerateAccessToken generateAccessToken;
////    普通のログイン
//    @RequestMapping(path ="/Login", method = RequestMethod.GET)
//    public String LoginForm() {
//        return "LoginForm";
//    }
//
//    @RequestMapping(path ="/LoginSuccess", method = RequestMethod.POST)
//    @ResponseBody
//    public UserInfo LoginFunc(@RequestBody UserInfo user) {
//       user.setAccesstoken(generateAccessToken.searchAccessToken(user.getId(),user.getName()));
//       return user;
//    }
//}
