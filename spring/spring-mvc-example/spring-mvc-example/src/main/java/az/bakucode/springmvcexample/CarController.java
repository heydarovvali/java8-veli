package az.bakucode.springmvcexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@Controller
@RequestMapping(path = "/cars")


public class CarController {

    @GetMapping(path = "/search")
    public String google(Model model, @RequestParam(name = "q",required = false,defaultValue = "") String q) {

        List<Car> cars = List.of(new Car(1, "mustang"), new Car(2, "mercedes"));

        List<Car> carsFiltered = cars.stream().filter(s -> {
            return s.getName().contains(q);
        }).collect(Collectors.toList());

        model.addAttribute("cars", carsFiltered); // cars-da yazanda carsfiltered-de yazanda konsolda eyni netice cixir
        return "cars";
    }


    @GetMapping(path="/open-save")

    public String openSave(Model model) {

        Car c=new Car(0,"");
        model.addAttribute("car", c); // cars-da yazanda carsfiltered-de yazanda konsolda eyni netice cixir
        return "save-car";
    }


    @PostMapping(path="/save")
    public String save(@ModelAttribute(name="car") Car c){

        return "redirect:/cars/search";
    }
    }


