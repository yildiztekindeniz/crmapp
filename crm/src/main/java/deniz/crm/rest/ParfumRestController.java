package deniz.crm.rest;

import deniz.crm.entity.Parfum;
import deniz.crm.service.ParfumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ParfumRestController {

    private ParfumService parfumService;

    @Autowired
    public ParfumRestController(ParfumService parfumService){
        this.parfumService=parfumService;
    }











}
