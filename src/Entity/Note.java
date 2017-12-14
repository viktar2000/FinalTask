package Entity;

public class Note {
   private String date;
   private String content;

   public Note(String date,String Content) {
       this.date = date;
       this.content = content;
   }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }


}
