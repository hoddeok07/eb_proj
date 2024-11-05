package com.ohgiraffers.eb_proj.service;

import com.ohgiraffers.eb_proj.dto.MenuDTO;
import com.ohgiraffers.eb_proj.entity.Menu;
import com.ohgiraffers.eb_proj.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final ModelMapper modelMapper;
    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(ModelMapper modelMapper, MenuRepository menuRepository) {
        this.modelMapper = modelMapper;
        this.menuRepository = menuRepository;
    }

    public MenuDTO findMenuByMenuCode(int menuCode) {
        Menu menu = menuRepository.selectMenu(menuCode);
        return modelMapper.map(menu, MenuDTO.class);
    }
}
