package com.lumberjack;

import com.lumberjack.Services.UIService;

public class Main {
    public static void main(String[] args) {
        System.out.print("##--Library Project--##\n\n");
        UIService.HeaderOutPut();
        UIService.lineOutput("Opção 1 - Cadastrar livro");
        UIService.lineOutput("Opção 2 - Ver Livros");
        UIService.lineOutput("Opção 3 - Sair");
        UIService.FooterOutput();
    }
}