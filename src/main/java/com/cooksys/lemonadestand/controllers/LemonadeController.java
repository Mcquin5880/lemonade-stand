package com.cooksys.lemonadestand.controllers;

import com.cooksys.lemonadestand.model.LemonadeRequestDto;
import com.cooksys.lemonadestand.model.LemonadeResponseDto;
import com.cooksys.lemonadestand.services.LemonadeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lemonades")
@AllArgsConstructor
public class LemonadeController {

    private LemonadeService lemonadeService;

    @GetMapping
    public List<LemonadeResponseDto> getAllLemonades() {
        return lemonadeService.getAllLemonades();
    }

    @GetMapping("/{id}")
    public LemonadeResponseDto getLemonadeById(@PathVariable Long id) {
        return lemonadeService.getLemonadeById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LemonadeResponseDto createLemonade(@RequestBody LemonadeRequestDto lemonadeRequestDto) {
        return lemonadeService.createLemonade(lemonadeRequestDto);
    }
}
