package com.lumberjack.Models;

import java.time.LocalDateTime;

public class Book {

        private String name;
        private String autor;
        private boolean borrowed;

        private String borrowedTo;
        private LocalDateTime borrowedDate;
        private String editora;
        private String edition;

        private int year;
        private String synopsis;
        private int yearOfPurchase;

        public Book(String name,String autor,boolean borrowed){
            this.name=name;
            this.autor=autor;
            this.borrowed=borrowed;
        }


        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return this.name;
        }
        public void setAutor(String autor){
            this.autor=autor;
        }
        public String getAutor(){
            return this.autor;
        }

        public void setBorrowed(boolean borrowed) {
            this.borrowed = borrowed;
        }
        public boolean getBorrowed(){
            return this.borrowed;
        }

        public void setBorrowedTo(String borrowedTo) {
            this.borrowedTo = borrowedTo;
        }

        public String getBorrowedTo() {
            return this.borrowedTo;
        }

        public void setBorrowedDate(LocalDateTime borrowedDate) {
            this.borrowedDate = borrowedDate;
        }

        public LocalDateTime getBorrowedDate() {
            return this.borrowedDate;
        }


        public void setEditora(String editora){
            this.editora=editora;
        }
        public String getEditora(){
            return this.editora;
        }
        public void setEdition(String edition){
            this.edition=edition;
        }

        public String getEdition(){
            return this.edition;
        }

        public void setYear(int year){
            this.year=year;
        }

        public int getYear(){
            return this.year;
        }

        public void setYearOfPurchase(int yearOfPurchase) {
            this.yearOfPurchase = yearOfPurchase;
        }

        public int getYearOfPurchase() {
            return this.yearOfPurchase;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public String getSynopsis() {
            return this.synopsis;
        }

}
