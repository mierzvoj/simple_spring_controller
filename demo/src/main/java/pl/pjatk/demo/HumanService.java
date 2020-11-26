package pl.pjatk.demo;

import org.springframework.stereotype.*;

import java.util.*;
@Component
public class HumanService {

    private HumanRepository humanRepository;

    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;

    }

    public List<Human> humans = new ArrayList<>();

    public List<Human> findAll(){
        return humanRepository.findAll();
    }

    public Optional<Human> findById(Long id){
        return humanRepository.findById(id);
    }

    public Human saveHuman(Human human){
        return humanRepository.save(human);
    }

    public void deleteHuman(Long id){
        humanRepository.deleteById(id);
    }


}
