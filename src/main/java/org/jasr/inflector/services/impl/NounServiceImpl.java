package org.jasr.inflector.services.impl;

import org.jasr.inflector.dao.NounRepository;
import org.jasr.inflector.services.NounService;
import org.springframework.beans.factory.annotation.Autowired;

public class NounServiceImpl implements NounService{

    @Autowired
    private NounRepository nounRepository;
    
}
