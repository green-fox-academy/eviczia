package com.greenfox.backendapi.controllers;

import com.greenfox.backendapi.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecondController {


    @GetMapping("/doubling")
    public ResponseEntity multiplyByTwo(@RequestParam(name = "input", required = false) Integer received) {
        if (received == null) return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        return ResponseEntity.status(200).body(new Doubler(received));
    }

    @GetMapping("/greeter")
    public ResponseEntity welcome(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
        if (name == null && title == null)
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        if (name == null) return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        if (title == null) return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        return ResponseEntity.status(200).body(new Greeter(name, title));
    }

    @GetMapping("/appenda")
    public ResponseEntity appendA() {
        return ResponseEntity.status(404).body(new ErrorMessage("Requested resource not found"));
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable(value = "appendable") String appendable) {
        return ResponseEntity.status(200).body(new Appender(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity dountil(@RequestBody Limit limit, @PathVariable(value = "action") String action) {
        if (limit == null) return ResponseEntity.status(200).body(new ErrorMessage("Please provide a number!"));
        if (action.equals("sum")) return ResponseEntity.status(200).body(limit.sum());
        if (action.equals("factor")) return ResponseEntity.status(200).body(limit.factor());
        else return ResponseEntity.status(404).body(new ErrorMessage("Something went wrong"));
    }

    @PostMapping("/arrays")
    public ResponseEntity doWhat(@RequestBody MathExercise exercise) {
        if (exercise == null) return ResponseEntity.status(200).body(new ErrorMessage("Please give a math exercise!"));
        if (exercise.getWhat() == null)
            return ResponseEntity.status(200).body(new Error("Please provide what to do with the numbers!"));
        if (exercise.getNumbers() == null) return ResponseEntity.status(200).body(new Error("Please provide numbers!"));
        if (exercise.getWhat().equals("double")) return ResponseEntity.status(200).body(exercise.solveDouble());
        return ResponseEntity.status(200).body(exercise.solve());


    }

}
