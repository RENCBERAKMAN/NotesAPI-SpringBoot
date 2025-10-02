package com.rencber.notesapi.controller;
import com.rencber.notesapi.model.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//javanin kendi siniflari
import java.util.ArrayList;
import java.util.List;
//List = sirali veri koleksiyonu, birden fazla notu saklayabilir.
//ArrayList = List arayuzunu implemente eden sinif, hafizada dinamik dizi gibi calisir.


@RestController // Bu sinifin bir Rest API controller oldugunu springe bildiriyoruz.
//Yani HTTP isteklerini bu sinif karsilayacak ve cevap verecek.


public class NoteController {
    //Hafizada notlari tutacagimiz liste
    private List<Note> notes = new ArrayList<>();
    //new ArrayList<>() ile bos bir ArrayList olusturuyoruz.


    // Get istegi: Notes endpoint i  aciyoruz
    @GetMapping ("/notes")
    //Kullanici tarayici veya postman dan / notes url sine get istegi atarsa bu metod calisir.
    //GET = veri almak icin yapilan HTTP istegi.



    public List<Note> getNotes(){
        //
        //Hafizadaki notlari donduruyoruz.
        return  notes;
    }
}