import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return this.name;
        }

        public String getTypeList() {
            return this.typeList;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] currentSongData = scanner.nextLine().split("_");
            String currentTypeList = currentSongData[0];
            String currentName = currentSongData[1];
            String currentTime = currentSongData[2];

            Song song = new Song(currentTypeList, currentName, currentTime);
            songs.add(song);
        }
        String command = scanner.nextLine();

        if (command.equals("all")) {

            for (Song song : songs) {
                String currentName = song.getName();
                System.out.println(currentName);
            }
        } else {

            for (Song song : songs) {

                if (song.getTypeList().equals(command)) {
                    String currentName = song.getName();
                    System.out.println(currentName);
                }
            }
        }
    }
}
