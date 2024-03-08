public class Musicas {
    

//Atributos
String title;
String album;
String date;
int time;
//metodos 
//primera forma
/* public void Musicas(String_title, String_album, String_date, int time){
    title=_title;
    album=_album;
    date=_album;
    time=_time;
}*/

//segunda forma
public Musicas(String  title , String album, String date, int time){
    this.title=title;
    this.album=album;
    this.date=date;
    this.time=time;
   
}

public void ShowPlaylist(){
    System.out.println("title: "+title);
    System.out.println("album: "+album);
    System.out.println("date: "+date);
    System.out.println("time: "+time);
}
}