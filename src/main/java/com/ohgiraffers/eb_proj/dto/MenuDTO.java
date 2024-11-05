package com.ohgiraffers.eb_proj.dto;

import lombok.Data;

@Data
public class MenuDTO {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;
}
