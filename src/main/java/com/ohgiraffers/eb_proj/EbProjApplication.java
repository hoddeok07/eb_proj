package com.ohgiraffers.eb_proj;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EbProjApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbProjApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    // modelmapper를 main application에서 bean으로 등록하는 이유: SpringBootApplication에 Configuration이 포함되어 있음
    // 어차피 전역에서 쓸 거니까 따로 Config 파일 만들 필요 없이 바로 Bean 등록
}
