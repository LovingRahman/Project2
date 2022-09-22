package com.revature.service;


import com.revature.entity.Shop;
import com.revature.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    ShopRepository shopRepository;

    public Shop getByName(String name){
        return shopRepository.findByProductname(name);
    }


}
