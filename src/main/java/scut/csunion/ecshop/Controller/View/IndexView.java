package scut.csunion.ecshop.Controller.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import scut.csunion.ecshop.Model.Entity.UserEntity;
import scut.csunion.ecshop.Model.Repository.UserRepository;

/**
 * Created by zijun on 16-11-24.
 */
@Controller
public class IndexView {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/world")
    public String seeTheWorld(Model model){
        model.addAttribute("wa", 666);

        //get user entity with id=1 from database and then inject its account into the model
        UserEntity userEntity = userRepository.findOne(1);
        if(userEntity != null){
            model.addAttribute("account", userEntity.getAccount());
        }

        //return the jsp page with name "index.jsp"
        return "index";
    }
}
