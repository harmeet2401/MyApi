package com.in28mins.Myapi.Controller;

import com.in28mins.Myapi.ApiBeans.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@RestController
public class ApiController {

    @GetMapping(path = "/hey")
    public String getWelcomeMsg() throws IOException {
        File file = new File("/data/data.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String string,str ="";
        while ((string = br.readLine()) != null) {
            str = string;
        }

        return str; //"!!!! welcome to my rest api deployed to Openshift using webhook!!!!";
    }

    @GetMapping(path = "/User")
    public User getUser()
    {
            User user = new User();
            user.setAdd("Plotno 63 wz 31 b3/8 ff navyug ");
            user.setName("HARMEET SINGH - Phoenix Dt ");
            return user;
    }
}
