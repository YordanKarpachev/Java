package ObjekteUndKlassenLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A04Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs =  new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.setType(type);
            song.setName(name);
            song.setTime(time);
            songs.add(song);

        }

        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }

        } else {
            List<Song> filterSong = songs.stream().filter(e -> e.getType().equals(command)).collect(Collectors.toList());
            for (Song song : filterSong) {
                System.out.println(song.getName());
            }

        }

    }




    static class Song {
        private String type;
        private String name;
        private String time;

        public String getType(){
            return type;
        }

        public void setType(String type){
            this.type = type;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getTime() {
            return time;
        }
        public void setTime(String time){
            this.time = time;

        }
    }

}
