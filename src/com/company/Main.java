package com.company;

import com.company.DTO.DeliberationDto;
import com.company.service.DeliberationService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().start(args);
    }

    private void start(String[] args) {

    }

    private void update(DeliberationDto delibDto){

    }

    private void create(DeliberationDto delibDto) {
        new DeliberationService().creerDeliberation(delibDto);
    }
}
