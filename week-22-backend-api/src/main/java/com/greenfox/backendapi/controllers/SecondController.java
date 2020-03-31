package com.greenfox.backendapi.controllers;

import com.greenfox.backendapi.models.*;
import com.greenfox.backendapi.models.entities.Log;
import com.greenfox.backendapi.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecondController {

    private LogRepository logRepository;

    @Autowired
    public SecondController(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @GetMapping("/doubling")
    public ResponseEntity multiplyByTwo(@RequestParam(name = "input", required = false) Integer received) {
        logRepository.save(new Log("GET /doubling", Integer.toString(received)));
        if (received == null) return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        return ResponseEntity.status(200).body(new Doubler(received));
    }

    @GetMapping("/greeter")
    public ResponseEntity welcome(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
        logRepository.save(new Log("GET /greeter", name + " " + title));
        if (name == null && title == null)
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        if (name == null) return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        if (title == null) return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        return ResponseEntity.status(200).body(new Greeter(name, title));
    }

    @GetMapping("/appenda")
    public ResponseEntity appendA() {
        logRepository.save(new Log("GET /appenda", ""));
        return ResponseEntity.status(404).body(new ErrorMessage("Requested resource not found"));
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable(value = "appendable") String appendable) {
        logRepository.save(new Log("GET /appenda", appendable));
        return ResponseEntity.status(200).body(new Appender(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity dountil(@RequestBody Limit limit, @PathVariable(value = "action") String action) {
        logRepository.save(new Log("POST /dountil/" + action, limit.toString()));
        if (limit == null) return ResponseEntity.status(200).body(new ErrorMessage("Please provide a number!"));
        if (action.equals("sum")) return ResponseEntity.status(200).body(limit.sum());
        if (action.equals("factor")) return ResponseEntity.status(200).body(limit.factor());
        else return ResponseEntity.status(404).body(new ErrorMessage("Something went wrong"));
    }

    @PostMapping("/arrays")
    public ResponseEntity doWhat(@RequestBody MathExercise exercise) {
        logRepository.save(new Log("POST /arrays", exercise.toString()));
        if (exercise == null) return ResponseEntity.status(200).body(new ErrorMessage("Please give a math exercise!"));
        if (exercise.getWhat() == null)
            return ResponseEntity.status(200).body(new Error("Please provide what to do with the numbers!"));
        if (exercise.getNumbers() == null) return ResponseEntity.status(200).body(new Error("Please provide numbers!"));
        if (exercise.getWhat().equals("double")) return ResponseEntity.status(200).body(exercise.solveDouble());
        return ResponseEntity.status(200).body(exercise.solve());
    }

    @GetMapping("/log")
    public ResponseEntity getLogs() {
        return ResponseEntity.status(200).body(new Entries(logRepository.findAll()));
    }

    @GetMapping("/sith")
    public ResponseEntity askYoda(@RequestBody Text text) {
        logRepository.save(new Log("GET /sith", text.toString()));
        if (text.equals(null) || text.equals("")) return ResponseEntity.status(400).body(new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm."));
        return ResponseEntity.status(200).body(new YodaSpeak(text));
    }


}
