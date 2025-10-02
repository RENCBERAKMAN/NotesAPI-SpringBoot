package com.rencber.notesapi.model;//Bu dosyanin hangi pakette oldugunu belirtiyoruz
//paket , javada  klasor mantigi gibidir. kodlari gruplamak ve organize etmek icin kullanilir.
//ornegin: model paketi -> veri ile ilgili siniflar, controller paketi  -> istekleri yoneten siniflar.


//Note adında bir class(sinif) tanimliyoruz(Notlarimizin sablonu olacak)
//class = Nesnelerin sablonu. Bizim durumumuzda bir "not" nesnesinin nasil gorunecegini tanimlar.

public class Note {
    private Long id; //Her note ozel benzersiz ID
    //private = sadece bu class icinde erisilebilir, disaridan erismek icin getter/setter kulanacagız.
    private String title; //Notun basligi
    //title = notun basligi örn: "Alisveris listesi veya spring boot ogrenilcek"
    private String content; //NOtun icerigi

    //----Constructor----
    //Bos constructor -> Not nesnesi olusturulurken parametre vermek istemezsen kullanilir.
    //Spring ve bazı frameworkler bos constructor ister.

    //Boş constructor -> Spring gibi frameworkler gerektiginde kullanilir.
    public Note() {
    }

    //Dolu constructor -> Not nesnesi olusturulurken id, titlei content degerlerini tek seferde atamak icin
    //Dolu constructor -> Kolayca note nesnesi olusturmak icin
    public Note(Long id, String title, String content) {
        this.id = id;//id alanini parametre ile doldur.
        this.title = title;//title alanini parametre ile doldur.
        this.content = content;//content alanini paremetre ile doldur.
    }

    //Getter & setter metotlari
    // Private alanlara disaridan erismek icin kullanıyoruz.

    //Getter = Deger okumak icin.
    public Long getId() {
        return id;// Notun id'sini döndürür
    }
// Setter = Deger degistirmek icin
    public void setId(Long id) {
        this.id = id; // Notun id sini gunceller.
    }

    public String getTitle() {
        return title;//Notun basligini dondurur.
    }

    public void setTitle(String title) {
        this.title = title;//Notun basligini gunceller
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
