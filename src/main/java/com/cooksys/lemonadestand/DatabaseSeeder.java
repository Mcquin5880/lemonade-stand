package com.cooksys.lemonadestand;

import com.cooksys.lemonadestand.entities.Lemonade;
import com.cooksys.lemonadestand.repositories.LemonadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DatabaseSeeder implements CommandLineRunner {

    private LemonadeRepository lemonadeRepository;

    @Override
    public void run(String... args) throws Exception {
        Lemonade lemonade1 = new Lemonade();
        lemonade1.setLemonJuice(3.25);
        lemonade1.setWater(2.5);
        lemonade1.setSugar(1.25);
        lemonade1.setIceCubes(5);
        lemonade1.setPrice(4.50);

        lemonadeRepository.saveAndFlush(lemonade1);

        Lemonade lemonade2 = new Lemonade();
        lemonade2.setLemonJuice(2.50);
        lemonade2.setWater(2);
        lemonade2.setSugar(2.50);
        lemonade2.setIceCubes(3);
        lemonade2.setPrice(4.99);

        lemonadeRepository.saveAndFlush(lemonade2);

        System.out.println(lemonadeRepository.findAll());
    }
}
