package com.lumberjack;

import com.lumberjack.Models.Book;
import com.lumberjack.Services.UIService;

public class Main {
    public static void main(String[] args) {
        System.out.print("##--Library Project--##\n\n");
        UIService.HeaderOutPut();
        System.out.println(UIService.lineOutput("Opção 1 - Cadastrar livro"));
        System.out.println(UIService.lineOutput("Opção 2 - Ver Livros"));
        System.out.println( UIService.lineOutput("Opção 3 - Sair"));
        UIService.FooterOutput();
        if(UIService.getUserOption() == 2){
            Book book = new Book("Neuromancer", " William Gibson", false);
            System.out.println(book.getName());
        }
    }
}