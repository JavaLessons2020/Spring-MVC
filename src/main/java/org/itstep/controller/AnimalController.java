package org.itstep.controller;

import org.itstep.model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/pets")
public class AnimalController {

    Set<Animal>animals = new HashSet<>();
    Long count = 0L;




    @GetMapping(value = {"", "/animal"})
    public String getAnimals(Model model) {
//        List<Animal> animals = List.of(
//                new Animal(1L, "Murzik", 5, "cat"),
//                new Animal(2L, "Barsik", 4, "dog")
//        );
        model.addAttribute("animals", animals);
        return "animal";
    }

    @GetMapping("/animal/{name}")
    public String getAnimalById(@PathVariable("name")String name, Model model){
        for (Animal animal : animals) {
            if(animal.getName().equals(name)){
                model.addAttribute("animal", animal);
            }
        }
        return "animalById";
    }

    @GetMapping("/new")
    public String registration() {
        return "reganimal";
    }

//    @PostMapping("/new_post")
//    public String postReg(@RequestParam("name")String name,
//                          @RequestParam("age")int age,
//                          @RequestParam("breed")String breed){
//        animals.add(new Animal(++count, name, age, breed));
//        return "redirect:/pets/animal";
//    }

    @PostMapping("/new_post")
    public String postReg(@ModelAttribute Animal animal){ //заполняет объект через setters
        animals.add(animal);
        return "redirect:/pets/animal";
    }


}
