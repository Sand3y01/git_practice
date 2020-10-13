import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("We will rock you!");
    desertIslandPlaylist.add("Bless this Morning Year");
    desertIslandPlaylist.add("Winter Dreams");
    desertIslandPlaylist.add("Island in the sun");
    desertIslandPlaylist.add("Knockin' at the door");
    desertIslandPlaylist.add("Party time");
    System.out.println(desertIslandPlaylist.toString());
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Party time");
    System.out.println(desertIslandPlaylist.size());
  int a = desertIslandPlaylist.indexOf("Bless this Morning Year");
  int b = desertIslandPlaylist.indexOf("We will rock you!");
  System.out.println(a + " " + b);
  desertIslandPlaylist.set(a, "We will rock you!");
  desertIslandPlaylist.set(b, "Bless this Morning Year");
  System.out.println(desertIslandPlaylist.toString());

  }
  
}
