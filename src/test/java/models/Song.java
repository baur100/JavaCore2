package models;



    public class Song {
        public String id;
        public int album_id;
        public int artist_id;
        public String title;
        public String created_at;
        public int disc;
        public int track;
        public double length;

        public Song(String id, int album_id, int artist_id, String title,  int track, double length) {
            this.id = id;
            this.album_id = album_id;
            this.artist_id = artist_id;
            this.title = title;
            this.track = track;
            this.length = length;
        }
        public Song(){

        }
    }

