package pl.pjatk.demo;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/human")
public class HumanController {
    private HumanRepository humanRepository;
    private HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    @GetMapping("/humans")
    public ResponseEntity <List<Human>> all(){
        return ResponseEntity.ok(humanService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional <Human>> findOne(Long id){
        Optional <Human> byId = humanService.findById(id);
        if(byId.isPresent()){
            return ResponseEntity.ok(byId);
        } else {

            return ResponseEntity.notFound().build();
        }

    }
    
}
