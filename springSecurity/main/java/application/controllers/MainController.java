package application.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping()
public class MainController {
    private ArrayList<Integer> integers = new ArrayList<>(); // знаю что так лучше не делать, но просто для работы. Задание,вроде, в другом

    public MainController() {
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
    }

    @GetMapping("/getRandomValue")
    public Integer getSomeNumber() {
        int index=((int) (Math.random() * (integers.size() - 1)));
        return integers.get(index);
    }

    @DeleteMapping("/deleteLastNumber")
    public Integer deleteLastNumber() {
        return integers.remove(integers.size() - 1);
    }

    @PutMapping("/replaceNumber")
    public Integer replaceNumberToRandomPlace(@RequestParam("newValue") int newValue) {
        int indexForReplace=((int) (Math.random() * (integers.size() - 1)));
        integers.add(indexForReplace, newValue);
        return indexForReplace;
    }

    @PostMapping("/addElementToEnd")
    public Integer addNumberToEnd(@RequestParam("value") int value) {
        integers.add(value);
        return integers.size();
    }
}
