//package addresser.AuthServicese.service;
//
//import addresser.AuthServicese.model.UserInfo;
//import addresser.AuthServicese.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class GenerateAccessToken {
//
//    @Autowired
//    UserRepository userRepository;
//
//    public List<UserInfo> searchAll() {
//        // ユーザーTBLの内容を全検索
//        return userRepository.findAll();
//    }
//
//    public String searchAccessToken(int id,String name) {
//        String accesstoken = userRepository.findById(id)
//                .filter(user -> name.equals(user.getName()))
//                .map(user -> user.getAccesstoken())
//                .orElse("アクセストークンなし");
//
//        return accesstoken;
//    }
//}
