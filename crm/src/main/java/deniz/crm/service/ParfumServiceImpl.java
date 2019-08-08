package deniz.crm.service;

import deniz.crm.entity.Parfum;
import deniz.crm.repository.ParfumRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ParfumServiceImpl implements ParfumService{

    private ParfumRepository parfumRepository;

    @Override
    public List<Parfum> findAll() {
        List<Parfum> parfums = parfumRepository.findAll();
        return parfums;
    }

    @Override
    public void save(Parfum parfum) {

        parfumRepository.save(parfum);

    }
}
